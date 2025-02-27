// Generated from d:/Programowanie/ebnf2antlr/ebnf2antlr/src/main/antlr4/IsoEbnf.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class IsoEbnfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, TERMINAL=2, NAME=3, NUMBERS=4, OR_OP=5, MINUS=6, STAR=7, PLUS=8, 
		QMARK=9, ASSIGNMENT=10, LBRACKET=11, RBRACKET=12, LPAREN=13, RPAREN=14, 
		WS=15, NL=16, COMMENT=17, OTHER=18;
	public static final int
		RULE_ebnf = 0, RULE_rule = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"ebnf", "rule", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'|'", "'-'", "'*'", "'+'", "'?'", "'::='", 
			"'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "TERMINAL", "NAME", "NUMBERS", "OR_OP", "MINUS", "STAR", 
			"PLUS", "QMARK", "ASSIGNMENT", "LBRACKET", "RBRACKET", "LPAREN", "RPAREN", 
			"WS", "NL", "COMMENT", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsoEbnf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IsoEbnfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EbnfContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IsoEbnfParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				rule_();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==LBRACKET );
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(IsoEbnfParser.NAME, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(IsoEbnfParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(IsoEbnfParser.LBRACKET, 0); }
		public TerminalNode NUMBERS() { return getToken(IsoEbnfParser.NUMBERS, 0); }
		public TerminalNode RBRACKET() { return getToken(IsoEbnfParser.RBRACKET, 0); }
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(13);
				match(LBRACKET);
				setState(14);
				match(NUMBERS);
				setState(15);
				match(RBRACKET);
				}
			}

			setState(18);
			match(NAME);
			setState(19);
			match(ASSIGNMENT);
			setState(20);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(IsoEbnfParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(IsoEbnfParser.RPAREN, 0); }
		public TerminalNode NAME() { return getToken(IsoEbnfParser.NAME, 0); }
		public TerminalNode TERMINAL() { return getToken(IsoEbnfParser.TERMINAL, 0); }
		public TerminalNode LITERAL() { return getToken(IsoEbnfParser.LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(IsoEbnfParser.MINUS, 0); }
		public List<TerminalNode> OR_OP() { return getTokens(IsoEbnfParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(IsoEbnfParser.OR_OP, i);
		}
		public TerminalNode STAR() { return getToken(IsoEbnfParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(IsoEbnfParser.PLUS, 0); }
		public TerminalNode QMARK() { return getToken(IsoEbnfParser.QMARK, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(23);
				match(LPAREN);
				setState(24);
				expr(0);
				setState(25);
				match(RPAREN);
				}
				break;
			case NAME:
				{
				setState(27);
				match(NAME);
				}
				break;
			case TERMINAL:
				{
				setState(28);
				match(TERMINAL);
				}
				break;
			case LITERAL:
				{
				setState(29);
				match(LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(32);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(33);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(35);
						match(MINUS);
						setState(36);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(40); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(38);
								match(OR_OP);
								setState(39);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(42); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(45);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00124\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		")\b\u0002\u000b\u0002\f\u0002*\u0001\u0002\u0001\u0002\u0005\u0002/\b"+
		"\u0002\n\u0002\f\u00022\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000"+
		"\u0002\u0004\u0000\u0001\u0001\u0000\u0007\t:\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000"+
		"\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000"+
		"\u0000\b\t\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		"\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0005\u000b"+
		"\u0000\u0000\u000e\u000f\u0005\u0004\u0000\u0000\u000f\u0011\u0005\f\u0000"+
		"\u0000\u0010\r\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000"+
		"\u0013\u0014\u0005\n\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015"+
		"\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0006\u0002\uffff\uffff\u0000"+
		"\u0017\u0018\u0005\r\u0000\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019"+
		"\u001a\u0005\u000e\u0000\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b"+
		"\u001f\u0005\u0003\u0000\u0000\u001c\u001f\u0005\u0002\u0000\u0000\u001d"+
		"\u001f\u0005\u0001\u0000\u0000\u001e\u0016\u0001\u0000\u0000\u0000\u001e"+
		"\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001d\u0001\u0000\u0000\u0000\u001f0\u0001\u0000\u0000\u0000 !\n\u0007"+
		"\u0000\u0000!/\u0003\u0004\u0002\b\"#\n\u0006\u0000\u0000#$\u0005\u0006"+
		"\u0000\u0000$/\u0003\u0004\u0002\u0007%(\n\b\u0000\u0000&\'\u0005\u0005"+
		"\u0000\u0000\')\u0003\u0004\u0002\u0000(&\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+/\u0001\u0000\u0000\u0000,-\n\u0005\u0000\u0000-/\u0007\u0000\u0000\u0000"+
		". \u0001\u0000\u0000\u0000.\"\u0001\u0000\u0000\u0000.%\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u0000\u0006\t\u0010\u001e*.0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}