package com.github.akruk.ebnf2antlr;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.xpath.XPath;

import com.github.akruk.ebnf2antlr.W3CEbnfParser.EbnfContext;

public final class EBNF2ANTLRConverter {
    private EBNF2ANTLRConverter() {
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Incorrect number of arguments: " + args.length + " != 1");
        }
        String convertedFilename = args[0];
        try {
            CharStream charStream = CharStreams.fromFileName(convertedFilename);
            W3CEbnfLexer ebnfLexer = new W3CEbnfLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(ebnfLexer);
            W3CEbnfParser ebnfParser = new W3CEbnfParser(tokenStream);
            EbnfContext tree = ebnfParser.ebnf();
            var products = XPath.findAll(tree, "/grammarProduct", ebnfParser);
            for (var product : products) {
                var text = product.getText();
                // ::= -> :
                text.replaceFirst("\s*::=\s*", ": ");
                //
                System.out.println(text + ";");
            }

        } catch (IOException e) {
            System.err.println("File could not be parsed: " + convertedFilename);
        }
        System.out.println("Hello World!");
    }
}
