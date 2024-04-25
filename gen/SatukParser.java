// Generated from C:/Users/Msi/Desktop/2rok - studia/testAntlr4/src/Satuk.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SatukParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, SEMICOLON=12, COMMA=13, DOT=14, ASSIGN=15, 
		GT=16, LT=17, NOT=18, QUESTION=19, EQUAL=20, LE=21, GE=22, NOTEQUAL=23, 
		AND=24, OR=25, INC=26, DEC=27, ADD=28, SUB=29, MUL=30, DIV=31, MOD=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, WS=37, INT=38, 
		STRING=39, BOOL=40, FLOAT=41, CHAR=42, VARIABLE=43;
	public static final int
		RULE_prog = 0, RULE_assignment = 1, RULE_assign_bool = 2, RULE_assign_float = 3, 
		RULE_assign_string = 4, RULE_assign_char = 5, RULE_assign_int = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "assignment", "assign_bool", "assign_float", "assign_string", 
			"assign_char", "assign_int"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'float'", "'string'", "'char'", "'int'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'?'", "'=='", "'<='", "'>='", null, "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMICOLON", "COMMA", "DOT", "ASSIGN", "GT", "LT", 
			"NOT", "QUESTION", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "WS", "INT", "STRING", "BOOL", "FLOAT", "CHAR", 
			"VARIABLE"
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
	public String getGrammarFileName() { return "Satuk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SatukParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			assignment();
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
	public static class AssignmentContext extends ParserRuleContext {
		public Assign_intContext assign_int() {
			return getRuleContext(Assign_intContext.class,0);
		}
		public Assign_charContext assign_char() {
			return getRuleContext(Assign_charContext.class,0);
		}
		public Assign_stringContext assign_string() {
			return getRuleContext(Assign_stringContext.class,0);
		}
		public Assign_floatContext assign_float() {
			return getRuleContext(Assign_floatContext.class,0);
		}
		public Assign_boolContext assign_bool() {
			return getRuleContext(Assign_boolContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				assign_int();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				assign_char();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				assign_string();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				assign_float();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(20);
				assign_bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Assign_boolContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SatukParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(SatukParser.ASSIGN, 0); }
		public TerminalNode BOOL() { return getToken(SatukParser.BOOL, 0); }
		public TerminalNode SEMICOLON() { return getToken(SatukParser.SEMICOLON, 0); }
		public Assign_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssign_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssign_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssign_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_boolContext assign_bool() throws RecognitionException {
		Assign_boolContext _localctx = new Assign_boolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(VARIABLE);
			setState(25);
			match(ASSIGN);
			setState(26);
			match(BOOL);
			setState(27);
			match(SEMICOLON);
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
	public static class Assign_floatContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SatukParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(SatukParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(SatukParser.FLOAT, 0); }
		public TerminalNode SEMICOLON() { return getToken(SatukParser.SEMICOLON, 0); }
		public Assign_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssign_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssign_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssign_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_floatContext assign_float() throws RecognitionException {
		Assign_floatContext _localctx = new Assign_floatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__1);
			setState(30);
			match(VARIABLE);
			setState(31);
			match(ASSIGN);
			setState(32);
			match(FLOAT);
			setState(33);
			match(SEMICOLON);
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
	public static class Assign_stringContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SatukParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(SatukParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(SatukParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(SatukParser.SEMICOLON, 0); }
		public Assign_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssign_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssign_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stringContext assign_string() throws RecognitionException {
		Assign_stringContext _localctx = new Assign_stringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__2);
			setState(36);
			match(VARIABLE);
			setState(37);
			match(ASSIGN);
			setState(38);
			match(STRING);
			setState(39);
			match(SEMICOLON);
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
	public static class Assign_charContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SatukParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(SatukParser.ASSIGN, 0); }
		public TerminalNode CHAR() { return getToken(SatukParser.CHAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(SatukParser.SEMICOLON, 0); }
		public Assign_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssign_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssign_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssign_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_charContext assign_char() throws RecognitionException {
		Assign_charContext _localctx = new Assign_charContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__3);
			setState(42);
			match(VARIABLE);
			setState(43);
			match(ASSIGN);
			setState(44);
			match(CHAR);
			setState(45);
			match(SEMICOLON);
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
	public static class Assign_intContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SatukParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(SatukParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(SatukParser.INT, 0); }
		public TerminalNode SEMICOLON() { return getToken(SatukParser.SEMICOLON, 0); }
		public Assign_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).enterAssign_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SatukListener ) ((SatukListener)listener).exitAssign_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SatukVisitor ) return ((SatukVisitor<? extends T>)visitor).visitAssign_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_intContext assign_int() throws RecognitionException {
		Assign_intContext _localctx = new Assign_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			match(VARIABLE);
			setState(49);
			match(ASSIGN);
			setState(50);
			match(INT);
			setState(51);
			match(SEMICOLON);
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

	public static final String _serializedATN =
		"\u0004\u0001+6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000"+
		"2\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000"+
		"\u0004\u0017\u0001\u0000\u0000\u0000\u0006\u001d\u0001\u0000\u0000\u0000"+
		"\b#\u0001\u0000\u0000\u0000\n)\u0001\u0000\u0000\u0000\f/\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0010\u0016\u0003\f\u0006\u0000\u0011\u0016\u0003\n\u0005"+
		"\u0000\u0012\u0016\u0003\b\u0004\u0000\u0013\u0016\u0003\u0006\u0003\u0000"+
		"\u0014\u0016\u0003\u0004\u0002\u0000\u0015\u0010\u0001\u0000\u0000\u0000"+
		"\u0015\u0011\u0001\u0000\u0000\u0000\u0015\u0012\u0001\u0000\u0000\u0000"+
		"\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000"+
		"\u0018\u0019\u0005+\u0000\u0000\u0019\u001a\u0005\u000f\u0000\u0000\u001a"+
		"\u001b\u0005(\u0000\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c\u0005"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f"+
		"\u0005+\u0000\u0000\u001f \u0005\u000f\u0000\u0000 !\u0005)\u0000\u0000"+
		"!\"\u0005\f\u0000\u0000\"\u0007\u0001\u0000\u0000\u0000#$\u0005\u0003"+
		"\u0000\u0000$%\u0005+\u0000\u0000%&\u0005\u000f\u0000\u0000&\'\u0005\'"+
		"\u0000\u0000\'(\u0005\f\u0000\u0000(\t\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0004\u0000\u0000*+\u0005+\u0000\u0000+,\u0005\u000f\u0000\u0000,-\u0005"+
		"*\u0000\u0000-.\u0005\f\u0000\u0000.\u000b\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0005\u0000\u000001\u0005+\u0000\u000012\u0005\u000f\u0000\u000023\u0005"+
		"&\u0000\u000034\u0005\f\u0000\u00004\r\u0001\u0000\u0000\u0000\u0001\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}