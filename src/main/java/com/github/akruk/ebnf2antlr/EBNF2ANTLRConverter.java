package com.github.akruk.ebnf2antlr;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

import com.github.akruk.ebnf2antlr.W3CEbnfParser.EbnfContext;

public final class EBNF2ANTLRConverter {
    private EBNF2ANTLRConverter() {
    }

    private static void help() {
        System.err.println("Expected arguments: [--output <output-path>] <file-to-be-converted-path>");
    }

    record Args(Path fileToBeConvertedPath, Path outputPath) {}
    private static Args parseArgs(String[] args) {
        final var argcount = args.length;
        Path outputPath = null;
        Path convertedPath = null;
        if (argcount == 1) {
            convertedPath = Path.of(args[0]);
        }
        if (argcount == 3 && "--output".equals(args[0])) {
            outputPath = Path.of(args[1]);
            convertedPath = Path.of(args[2]);
        }
        return new Args(convertedPath, outputPath);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            help();
        }
        Args parsedArgs = parseArgs(args);
        Path fileToBeConverted = parsedArgs.fileToBeConvertedPath;
        Path outputPath = parsedArgs.outputPath;
        try {
            Writer outputWriter = outputPath != null? Files.newBufferedWriter(outputPath): new OutputStreamWriter(System.out);
            CharStream charStream = CharStreams.fromPath(fileToBeConverted);
            W3CEbnfLexer ebnfLexer = new W3CEbnfLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(ebnfLexer);
            W3CEbnfParser ebnfParser = new W3CEbnfParser(tokenStream);
            EbnfContext tree = ebnfParser.ebnf();
            var products = XPath.findAll(tree, "//grammarProduct", ebnfParser);
            for (var product : products) {
                var text = product.getText();
                // removal of rule numbering: '[1...]'
                text = text.replaceFirst("\\[\\d+\\]", "");
                // ::= -> :
                text = text.replaceFirst("\s*::=\s*", ": ");
                // ;
                text = text.trim() + ";";
                // "..." -> '...'
                // Regex: (?!\')" -> an unescaped double quotation mark
                text = text.replaceAll("(?!\\\\')\"", "'");
                outputWriter.write(text + "\n");
            }
            outputWriter.flush();
        } catch (IOException e) { // TODO: Granularize
            System.err.println("Error while opening file: " + outputPath.toAbsolutePath());
        }
    }
}
