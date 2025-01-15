// Generated from c:/Users/48698/Desktop/Metody i algorytmy kompilacji/py.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEWLINE=2, COMMENT=3, IF=4, ELIF=5, ELSE=6, DEF=7, RETURN=8, BREAK=9, 
		CONTINUE=10, WHILE=11, IS=12, NOT=13, IN=14, OR=15, AND=16, GLOBAL=17, 
		NONLOCAL=18, FOR=19, PASS=20, INT=21, STR=22, FLOAT=23, LIST=24, BOOL=25, 
		TRUE=26, FALSE=27, NONE=28, NUMBER=29, STRING=30, IDENTIFIER=31, COMMA=32, 
		PLUS=33, MINUS=34, POW=35, MULT=36, DIV=37, DIVI=38, ASSIGN=39, MOD=40, 
		LT=41, GT=42, LOE=43, GOE=44, EQ=45, NEQ=46, LPAREN=47, RPAREN=48, LBRACKET=49, 
		RBRACKET=50, COLON=51, BEGIN=52, END=53, DOT=54, INDICATOR=55, WS=56;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_control_stmt = 3, 
		RULE_global_stmt = 4, RULE_nonlocal_stmt = 5, RULE_type = 6, RULE_assignment = 7, 
		RULE_comparison_op = 8, RULE_expr = 9, RULE_logic_expr = 10, RULE_logic_term = 11, 
		RULE_logic_factor = 12, RULE_comparison_expr = 13, RULE_valued_expr = 14, 
		RULE_term = 15, RULE_factor = 16, RULE_list_expr = 17, RULE_key_value_pair = 18, 
		RULE_fstring_expr = 19, RULE_compound_stmt = 20, RULE_block = 21, RULE_if_stmt = 22, 
		RULE_while_stmt = 23, RULE_funcdef = 24, RULE_for_stmt = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "control_stmt", "global_stmt", 
			"nonlocal_stmt", "type", "assignment", "comparison_op", "expr", "logic_expr", 
			"logic_term", "logic_factor", "comparison_expr", "valued_expr", "term", 
			"factor", "list_expr", "key_value_pair", "fstring_expr", "compound_stmt", 
			"block", "if_stmt", "while_stmt", "funcdef", "for_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", null, null, "'if'", "'elif'", "'else'", "'def'", "'return'", 
			"'break'", "'continue'", "'while'", "'is'", "'not'", "'in'", "'or'", 
			"'and'", "'global'", "'nonlocal'", "'for'", "'pass'", "'int'", "'str'", 
			"'float'", "'list'", "'bool'", "'True'", "'False'", "'None'", null, null, 
			null, "','", "'+'", "'-'", "'**'", "'*'", "'/'", "'//'", "'='", "'%'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'('", "')'", "'['", "']'", 
			"':'", "'{'", "'}'", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "COMMENT", "IF", "ELIF", "ELSE", "DEF", "RETURN", 
			"BREAK", "CONTINUE", "WHILE", "IS", "NOT", "IN", "OR", "AND", "GLOBAL", 
			"NONLOCAL", "FOR", "PASS", "INT", "STR", "FLOAT", "LIST", "BOOL", "TRUE", 
			"FALSE", "NONE", "NUMBER", "STRING", "IDENTIFIER", "COMMA", "PLUS", "MINUS", 
			"POW", "MULT", "DIV", "DIVI", "ASSIGN", "MOD", "LT", "GT", "LOE", "GOE", 
			"EQ", "NEQ", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "BEGIN", 
			"END", "DOT", "INDICATOR", "WS"
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
	public String getGrammarFileName() { return "py.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pyParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(pyParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(pyParser.COMMENT, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 703691671611550L) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case NEWLINE:
				case IF:
				case DEF:
				case WHILE:
				case NOT:
				case GLOBAL:
				case NONLOCAL:
				case FOR:
				case PASS:
				case TRUE:
				case FALSE:
				case NONE:
				case NUMBER:
				case STRING:
				case IDENTIFIER:
				case LPAREN:
				case LBRACKET:
					{
					setState(52);
					statement();
					}
					break;
				case COMMENT:
					{
					setState(53);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
	public static class StatementContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(pyParser.NEWLINE, 0); }
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT:
			case GLOBAL:
			case NONLOCAL:
			case PASS:
			case TRUE:
			case FALSE:
			case NONE:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
			case LPAREN:
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				simple_stmt();
				setState(62);
				match(NEWLINE);
				}
				break;
			case IF:
			case DEF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				compound_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(NEWLINE);
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
	public static class Simple_stmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public TerminalNode PASS() { return getToken(pyParser.PASS, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				global_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				nonlocal_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(PASS);
				}
				break;
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
	public static class Control_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pyParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(pyParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(pyParser.CONTINUE, 0); }
		public Control_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_stmt; }
	}

	public final Control_stmtContext control_stmt() throws RecognitionException {
		Control_stmtContext _localctx = new Control_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_stmt);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(RETURN);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(76);
					expr();
					}
					break;
				}
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(CONTINUE);
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
	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(pyParser.GLOBAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(pyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(GLOBAL);
			setState(84);
			match(IDENTIFIER);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				match(IDENTIFIER);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(pyParser.NONLOCAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(pyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyParser.COMMA, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(NONLOCAL);
			setState(93);
			match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				match(IDENTIFIER);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pyParser.INT, 0); }
		public TerminalNode STR() { return getToken(pyParser.STR, 0); }
		public TerminalNode FLOAT() { return getToken(pyParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(pyParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(pyParser.LIST, 0); }
		public TerminalNode LBRACKET() { return getToken(pyParser.LBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(pyParser.RBRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(INT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(STR);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(LIST);
				setState(106);
				match(LBRACKET);
				setState(107);
				type();
				setState(108);
				match(RBRACKET);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pyParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(pyParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INDICATOR() { return getToken(pyParser.INDICATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(pyParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(pyParser.LBRACKET, i);
		}
		public List<Valued_exprContext> valued_expr() {
			return getRuleContexts(Valued_exprContext.class);
		}
		public Valued_exprContext valued_expr(int i) {
			return getRuleContext(Valued_exprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(pyParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(pyParser.RBRACKET, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IDENTIFIER);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(113);
				match(LBRACKET);
				setState(114);
				valued_expr();
				setState(115);
				match(RBRACKET);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(ASSIGN);
			setState(123);
			expr();
			setState(124);
			match(INDICATOR);
			setState(125);
			type();
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
	public static class Comparison_opContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(pyParser.LT, 0); }
		public TerminalNode GT() { return getToken(pyParser.GT, 0); }
		public TerminalNode EQ() { return getToken(pyParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(pyParser.NEQ, 0); }
		public TerminalNode GOE() { return getToken(pyParser.GOE, 0); }
		public TerminalNode LOE() { return getToken(pyParser.LOE, 0); }
		public TerminalNode IS() { return getToken(pyParser.IS, 0); }
		public TerminalNode IN() { return getToken(pyParser.IN, 0); }
		public TerminalNode NOT() { return getToken(pyParser.NOT, 0); }
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparison_op);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(NEQ);
				}
				break;
			case GOE:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(GOE);
				}
				break;
			case LOE:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(LOE);
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(IS);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 9);
				{
				setState(135);
				match(NOT);
				setState(136);
				match(IN);
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
	public static class ExprContext extends ParserRuleContext {
		public Valued_exprContext valued_expr() {
			return getRuleContext(Valued_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				valued_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				logic_expr();
				}
				break;
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
	public static class Logic_exprContext extends ParserRuleContext {
		public List<Logic_termContext> logic_term() {
			return getRuleContexts(Logic_termContext.class);
		}
		public Logic_termContext logic_term(int i) {
			return getRuleContext(Logic_termContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(pyParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(pyParser.OR, i);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			logic_term();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(144);
				match(OR);
				setState(145);
				logic_term();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Logic_termContext extends ParserRuleContext {
		public List<Logic_factorContext> logic_factor() {
			return getRuleContexts(Logic_factorContext.class);
		}
		public Logic_factorContext logic_factor(int i) {
			return getRuleContext(Logic_factorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(pyParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(pyParser.AND, i);
		}
		public Logic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_term; }
	}

	public final Logic_termContext logic_term() throws RecognitionException {
		Logic_termContext _localctx = new Logic_termContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			logic_factor();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(152);
				match(AND);
				setState(153);
				logic_factor();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Logic_factorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(pyParser.NOT, 0); }
		public Logic_factorContext logic_factor() {
			return getRuleContext(Logic_factorContext.class,0);
		}
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public Logic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_factor; }
	}

	public final Logic_factorContext logic_factor() throws RecognitionException {
		Logic_factorContext _localctx = new Logic_factorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logic_factor);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(NOT);
				setState(160);
				logic_factor();
				}
				break;
			case T__0:
			case TRUE:
			case FALSE:
			case NONE:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
			case LPAREN:
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				comparison_expr();
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
	public static class Comparison_exprContext extends ParserRuleContext {
		public List<Valued_exprContext> valued_expr() {
			return getRuleContexts(Valued_exprContext.class);
		}
		public Valued_exprContext valued_expr(int i) {
			return getRuleContext(Valued_exprContext.class,i);
		}
		public List<Comparison_opContext> comparison_op() {
			return getRuleContexts(Comparison_opContext.class);
		}
		public Comparison_opContext comparison_op(int i) {
			return getRuleContext(Comparison_opContext.class,i);
		}
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			valued_expr();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					comparison_op();
					setState(166);
					valued_expr();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
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
	public static class Valued_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(pyParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(pyParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(pyParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(pyParser.MINUS, i);
		}
		public Valued_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valued_expr; }
	}

	public final Valued_exprContext valued_expr() throws RecognitionException {
		Valued_exprContext _localctx = new Valued_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valued_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			term();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				term();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(pyParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(pyParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(pyParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(pyParser.DIV, i);
		}
		public List<TerminalNode> DIVI() { return getTokens(pyParser.DIVI); }
		public TerminalNode DIVI(int i) {
			return getToken(pyParser.DIVI, i);
		}
		public List<TerminalNode> MOD() { return getTokens(pyParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(pyParser.MOD, i);
		}
		public List<TerminalNode> POW() { return getTokens(pyParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(pyParser.POW, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			factor();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1614907703296L) != 0)) {
				{
				{
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1614907703296L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				factor();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pyParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(pyParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(pyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pyParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(pyParser.NONE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(pyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pyParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(pyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pyParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(pyParser.DOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyParser.COMMA, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(pyParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(pyParser.LBRACKET, i);
		}
		public List<Valued_exprContext> valued_expr() {
			return getRuleContexts(Valued_exprContext.class);
		}
		public Valued_exprContext valued_expr(int i) {
			return getRuleContext(Valued_exprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(pyParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(pyParser.RBRACKET, i);
		}
		public List_exprContext list_expr() {
			return getRuleContext(List_exprContext.class,0);
		}
		public Fstring_exprContext fstring_expr() {
			return getRuleContext(Fstring_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(NONE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(IDENTIFIER);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(195);
					match(DOT);
					setState(196);
					match(IDENTIFIER);
					}
				}

				setState(199);
				match(LPAREN);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 703691669643266L) != 0)) {
					{
					setState(200);
					expr();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(201);
						match(COMMA);
						setState(202);
						expr();
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(IDENTIFIER);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						match(LBRACKET);
						setState(213);
						valued_expr();
						setState(214);
						match(RBRACKET);
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(LPAREN);
				setState(222);
				expr();
				setState(223);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(225);
				list_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(226);
				fstring_expr();
				}
				break;
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
	public static class List_exprContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(pyParser.LBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(pyParser.RBRACKET, 0); }
		public List<TerminalNode> FOR() { return getTokens(pyParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(pyParser.FOR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(pyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pyParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IN() { return getTokens(pyParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(pyParser.IN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyParser.COMMA, i);
		}
		public List_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expr; }
	}

	public final List_exprContext list_expr() throws RecognitionException {
		List_exprContext _localctx = new List_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_expr);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(LBRACKET);
				setState(230);
				expr();
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(231);
					match(FOR);
					setState(232);
					match(IDENTIFIER);
					setState(233);
					match(IN);
					setState(234);
					expr();
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FOR );
				setState(239);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(LBRACKET);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 703691669643266L) != 0)) {
					{
					setState(242);
					expr();
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(243);
						match(COMMA);
						setState(244);
						expr();
						}
						}
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(252);
				match(RBRACKET);
				}
				break;
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
	public static class Key_value_pairContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(pyParser.COLON, 0); }
		public Key_value_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value_pair; }
	}

	public final Key_value_pairContext key_value_pair() throws RecognitionException {
		Key_value_pairContext _localctx = new Key_value_pairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_key_value_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expr();
			setState(256);
			match(COLON);
			setState(257);
			expr();
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
	public static class Fstring_exprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pyParser.STRING, 0); }
		public Fstring_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring_expr; }
	}

	public final Fstring_exprContext fstring_expr() throws RecognitionException {
		Fstring_exprContext _localctx = new Fstring_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fstring_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__0);
			setState(260);
			match(STRING);
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				funcdef();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pyParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pyParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(pyParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Control_stmtContext> control_stmt() {
			return getRuleContexts(Control_stmtContext.class);
		}
		public Control_stmtContext control_stmt(int i) {
			return getRuleContext(Control_stmtContext.class,i);
		}
		public TerminalNode PASS() { return getToken(pyParser.PASS, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(BEGIN);
				setState(269);
				match(NEWLINE);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 703691671613334L) != 0)) {
					{
					setState(272);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case NEWLINE:
					case IF:
					case DEF:
					case WHILE:
					case NOT:
					case GLOBAL:
					case NONLOCAL:
					case FOR:
					case PASS:
					case TRUE:
					case FALSE:
					case NONE:
					case NUMBER:
					case STRING:
					case IDENTIFIER:
					case LPAREN:
					case LBRACKET:
						{
						setState(270);
						statement();
						}
						break;
					case RETURN:
					case BREAK:
					case CONTINUE:
						{
						setState(271);
						control_stmt();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(BEGIN);
				setState(279);
				match(NEWLINE);
				setState(280);
				match(PASS);
				setState(281);
				match(NEWLINE);
				setState(282);
				match(END);
				}
				break;
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
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pyParser.IF, 0); }
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(pyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pyParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pyParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pyParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(pyParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(pyParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(pyParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IF);
			setState(286);
			logic_expr();
			setState(287);
			match(COLON);
			setState(288);
			match(NEWLINE);
			setState(289);
			block();
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(NEWLINE);
					setState(291);
					match(ELIF);
					setState(292);
					logic_expr();
					setState(293);
					match(COLON);
					setState(294);
					match(NEWLINE);
					setState(295);
					block();
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(302);
				match(NEWLINE);
				setState(303);
				match(ELSE);
				setState(304);
				match(COLON);
				setState(305);
				match(NEWLINE);
				setState(306);
				block();
				}
				break;
			}
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pyParser.WHILE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pyParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(pyParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(WHILE);
			setState(310);
			logic_expr();
			setState(311);
			match(COLON);
			setState(312);
			match(NEWLINE);
			setState(313);
			block();
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(pyParser.DEF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(pyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(pyParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(pyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pyParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(pyParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(pyParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> INDICATOR() { return getTokens(pyParser.INDICATOR); }
		public TerminalNode INDICATOR(int i) {
			return getToken(pyParser.INDICATOR, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pyParser.COMMA, i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(DEF);
			setState(316);
			match(IDENTIFIER);
			setState(317);
			match(LPAREN);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(318);
				match(IDENTIFIER);
				setState(319);
				match(INDICATOR);
				setState(320);
				type();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					match(IDENTIFIER);
					setState(323);
					match(INDICATOR);
					setState(324);
					type();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			match(RPAREN);
			setState(333);
			match(COLON);
			setState(334);
			match(NEWLINE);
			setState(335);
			block();
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pyParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(pyParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(pyParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pyParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(pyParser.NEWLINE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(FOR);
			setState(338);
			match(IDENTIFIER);
			setState(339);
			match(IN);
			setState(340);
			expr();
			setState(341);
			match(COLON);
			setState(342);
			match(NEWLINE);
			setState(343);
			block();
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
		"\u0004\u00018\u015a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000"+
		"\n\u0000\f\u0000:\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007v\b\u0007"+
		"\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u008a\b\b\u0001\t\u0001\t\u0003\t\u008e\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u009b\b\u000b\n\u000b\f\u000b\u009e"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00a9\b\r\n\r\f\r\u00ac\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00b1\b\u000e\n\u000e\f\u000e\u00b4\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00b9\b\u000f\n\u000f\f\u000f"+
		"\u00bc\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c6\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00cc\b\u0010\n\u0010"+
		"\f\u0010\u00cf\t\u0010\u0003\u0010\u00d1\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d9\b\u0010"+
		"\n\u0010\f\u0010\u00dc\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e4\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00ec"+
		"\b\u0011\u000b\u0011\f\u0011\u00ed\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f6\b\u0011\n\u0011"+
		"\f\u0011\u00f9\t\u0011\u0003\u0011\u00fb\b\u0011\u0001\u0011\u0003\u0011"+
		"\u00fe\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u010b\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0111\b\u0015\n\u0015\f\u0015\u0114\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011c"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u012a\b\u0016\n\u0016\f\u0016\u012d\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0134\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0146\b\u0018"+
		"\n\u0018\f\u0018\u0149\t\u0018\u0003\u0018\u014b\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0002\u0001\u0000"+
		"!\"\u0002\u0000#&((\u017b\u00008\u0001\u0000\u0000\u0000\u0002B\u0001"+
		"\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000"+
		"\u0000\bS\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fn\u0001"+
		"\u0000\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000"+
		"\u0000\u0000\u0012\u008d\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000"+
		"\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000"+
		"\u0000\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00ad\u0001\u0000"+
		"\u0000\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00e3\u0001\u0000\u0000"+
		"\u0000\"\u00fd\u0001\u0000\u0000\u0000$\u00ff\u0001\u0000\u0000\u0000"+
		"&\u0103\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000\u0000*\u011b"+
		"\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000.\u0135\u0001\u0000"+
		"\u0000\u00000\u013b\u0001\u0000\u0000\u00002\u0151\u0001\u0000\u0000\u0000"+
		"47\u0003\u0002\u0001\u000057\u0005\u0003\u0000\u000064\u0001\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0000\u0000\u0001<\u0001\u0001\u0000\u0000"+
		"\u0000=>\u0003\u0004\u0002\u0000>?\u0005\u0002\u0000\u0000?C\u0001\u0000"+
		"\u0000\u0000@C\u0003(\u0014\u0000AC\u0005\u0002\u0000\u0000B=\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003"+
		"\u0001\u0000\u0000\u0000DJ\u0003\u000e\u0007\u0000EJ\u0003\u0012\t\u0000"+
		"FJ\u0003\b\u0004\u0000GJ\u0003\n\u0005\u0000HJ\u0005\u0014\u0000\u0000"+
		"ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KM\u0005\b\u0000\u0000LN\u0003\u0012\t\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NR\u0001\u0000\u0000\u0000"+
		"OR\u0005\t\u0000\u0000PR\u0005\n\u0000\u0000QK\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0011\u0000\u0000TY\u0005\u001f\u0000\u0000UV\u0005"+
		" \u0000\u0000VX\u0005\u001f\u0000\u0000WU\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\t\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0012\u0000"+
		"\u0000]b\u0005\u001f\u0000\u0000^_\u0005 \u0000\u0000_a\u0005\u001f\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000eo\u0005\u0015\u0000\u0000fo\u0005\u0016\u0000"+
		"\u0000go\u0005\u0017\u0000\u0000ho\u0005\u0019\u0000\u0000ij\u0005\u0018"+
		"\u0000\u0000jk\u00051\u0000\u0000kl\u0003\f\u0006\u0000lm\u00052\u0000"+
		"\u0000mo\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000nf\u0001\u0000"+
		"\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000ni\u0001"+
		"\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000pw\u0005\u001f\u0000\u0000"+
		"qr\u00051\u0000\u0000rs\u0003\u001c\u000e\u0000st\u00052\u0000\u0000t"+
		"v\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\'\u0000\u0000{|\u0003\u0012"+
		"\t\u0000|}\u00057\u0000\u0000}~\u0003\f\u0006\u0000~\u000f\u0001\u0000"+
		"\u0000\u0000\u007f\u008a\u0005)\u0000\u0000\u0080\u008a\u0005*\u0000\u0000"+
		"\u0081\u008a\u0005-\u0000\u0000\u0082\u008a\u0005.\u0000\u0000\u0083\u008a"+
		"\u0005,\u0000\u0000\u0084\u008a\u0005+\u0000\u0000\u0085\u008a\u0005\f"+
		"\u0000\u0000\u0086\u008a\u0005\u000e\u0000\u0000\u0087\u0088\u0005\r\u0000"+
		"\u0000\u0088\u008a\u0005\u000e\u0000\u0000\u0089\u007f\u0001\u0000\u0000"+
		"\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0081\u0001\u0000\u0000"+
		"\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000"+
		"\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000"+
		"\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008e\u0003\u001c\u000e"+
		"\u0000\u008c\u008e\u0003\u0014\n\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000"+
		"\u008f\u0094\u0003\u0016\u000b\u0000\u0090\u0091\u0005\u000f\u0000\u0000"+
		"\u0091\u0093\u0003\u0016\u000b\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009c\u0003\u0018\f\u0000\u0098"+
		"\u0099\u0005\u0010\u0000\u0000\u0099\u009b\u0003\u0018\f\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0017"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\r\u0000\u0000\u00a0\u00a3\u0003\u0018\f\u0000\u00a1\u00a3\u0003"+
		"\u001a\r\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00aa\u0003\u001c"+
		"\u000e\u0000\u00a5\u00a6\u0003\u0010\b\u0000\u00a6\u00a7\u0003\u001c\u000e"+
		"\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u001b\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u001e\u000f"+
		"\u0000\u00ae\u00af\u0007\u0000\u0000\u0000\u00af\u00b1\u0003\u001e\u000f"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u001d\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ba\u0003 \u0010\u0000\u00b6\u00b7\u0007\u0001\u0000\u0000"+
		"\u00b7\u00b9\u0003 \u0010\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00e4\u0005\u001d\u0000\u0000\u00be"+
		"\u00e4\u0005\u001e\u0000\u0000\u00bf\u00e4\u0005\u001a\u0000\u0000\u00c0"+
		"\u00e4\u0005\u001b\u0000\u0000\u00c1\u00e4\u0005\u001c\u0000\u0000\u00c2"+
		"\u00c5\u0005\u001f\u0000\u0000\u00c3\u00c4\u00056\u0000\u0000\u00c4\u00c6"+
		"\u0005\u001f\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00d0"+
		"\u0005/\u0000\u0000\u00c8\u00cd\u0003\u0012\t\u0000\u00c9\u00ca\u0005"+
		" \u0000\u0000\u00ca\u00cc\u0003\u0012\t\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00e4\u00050\u0000\u0000\u00d3\u00da\u0005\u001f\u0000"+
		"\u0000\u00d4\u00d5\u00051\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000"+
		"\u00d6\u00d7\u00052\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00e4\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005/\u0000\u0000\u00de\u00df\u0003\u0012\t\u0000\u00df\u00e0"+
		"\u00050\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000\u00e1\u00e4\u0003"+
		"\"\u0011\u0000\u00e2\u00e4\u0003&\u0013\u0000\u00e3\u00bd\u0001\u0000"+
		"\u0000\u0000\u00e3\u00be\u0001\u0000\u0000\u0000\u00e3\u00bf\u0001\u0000"+
		"\u0000\u0000\u00e3\u00c0\u0001\u0000\u0000\u0000\u00e3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00c2\u0001\u0000\u0000\u0000\u00e3\u00d3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4!\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u00051\u0000\u0000\u00e6\u00eb\u0003\u0012\t\u0000"+
		"\u00e7\u00e8\u0005\u0013\u0000\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000"+
		"\u00e9\u00ea\u0005\u000e\u0000\u0000\u00ea\u00ec\u0003\u0012\t\u0000\u00eb"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u00052\u0000\u0000\u00f0\u00fe"+
		"\u0001\u0000\u0000\u0000\u00f1\u00fa\u00051\u0000\u0000\u00f2\u00f7\u0003"+
		"\u0012\t\u0000\u00f3\u00f4\u0005 \u0000\u0000\u00f4\u00f6\u0003\u0012"+
		"\t\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u00052\u0000\u0000"+
		"\u00fd\u00e5\u0001\u0000\u0000\u0000\u00fd\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fe#\u0001\u0000\u0000\u0000\u00ff\u0100\u0003\u0012\t\u0000\u0100"+
		"\u0101\u00053\u0000\u0000\u0101\u0102\u0003\u0012\t\u0000\u0102%\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005\u0001\u0000\u0000\u0104\u0105\u0005"+
		"\u001e\u0000\u0000\u0105\'\u0001\u0000\u0000\u0000\u0106\u010b\u0003,"+
		"\u0016\u0000\u0107\u010b\u0003.\u0017\u0000\u0108\u010b\u00032\u0019\u0000"+
		"\u0109\u010b\u00030\u0018\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010b)\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u00054\u0000\u0000\u010d\u0112\u0005\u0002\u0000\u0000\u010e\u0111\u0003"+
		"\u0002\u0001\u0000\u010f\u0111\u0003\u0006\u0003\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u011c\u00055\u0000\u0000\u0116\u0117\u00054\u0000"+
		"\u0000\u0117\u0118\u0005\u0002\u0000\u0000\u0118\u0119\u0005\u0014\u0000"+
		"\u0000\u0119\u011a\u0005\u0002\u0000\u0000\u011a\u011c\u00055\u0000\u0000"+
		"\u011b\u010c\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000\u0000\u0000"+
		"\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e"+
		"\u011f\u0003\u0014\n\u0000\u011f\u0120\u00053\u0000\u0000\u0120\u0121"+
		"\u0005\u0002\u0000\u0000\u0121\u012b\u0003*\u0015\u0000\u0122\u0123\u0005"+
		"\u0002\u0000\u0000\u0123\u0124\u0005\u0005\u0000\u0000\u0124\u0125\u0003"+
		"\u0014\n\u0000\u0125\u0126\u00053\u0000\u0000\u0126\u0127\u0005\u0002"+
		"\u0000\u0000\u0127\u0128\u0003*\u0015\u0000\u0128\u012a\u0001\u0000\u0000"+
		"\u0000\u0129\u0122\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000"+
		"\u0000\u012c\u0133\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005\u0002\u0000\u0000\u012f\u0130\u0005\u0006\u0000"+
		"\u0000\u0130\u0131\u00053\u0000\u0000\u0131\u0132\u0005\u0002\u0000\u0000"+
		"\u0132\u0134\u0003*\u0015\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134-\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005\u000b\u0000\u0000\u0136\u0137\u0003\u0014\n\u0000\u0137\u0138\u0005"+
		"3\u0000\u0000\u0138\u0139\u0005\u0002\u0000\u0000\u0139\u013a\u0003*\u0015"+
		"\u0000\u013a/\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0007\u0000\u0000"+
		"\u013c\u013d\u0005\u001f\u0000\u0000\u013d\u014a\u0005/\u0000\u0000\u013e"+
		"\u013f\u0005\u001f\u0000\u0000\u013f\u0140\u00057\u0000\u0000\u0140\u0147"+
		"\u0003\f\u0006\u0000\u0141\u0142\u0005 \u0000\u0000\u0142\u0143\u0005"+
		"\u001f\u0000\u0000\u0143\u0144\u00057\u0000\u0000\u0144\u0146\u0003\f"+
		"\u0006\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000"+
		"\u0000\u0000\u014a\u013e\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u00050\u0000"+
		"\u0000\u014d\u014e\u00053\u0000\u0000\u014e\u014f\u0005\u0002\u0000\u0000"+
		"\u014f\u0150\u0003*\u0015\u0000\u01501\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005\u0013\u0000\u0000\u0152\u0153\u0005\u001f\u0000\u0000\u0153\u0154"+
		"\u0005\u000e\u0000\u0000\u0154\u0155\u0003\u0012\t\u0000\u0155\u0156\u0005"+
		"3\u0000\u0000\u0156\u0157\u0005\u0002\u0000\u0000\u0157\u0158\u0003*\u0015"+
		"\u0000\u01583\u0001\u0000\u0000\u0000#68BIMQYbnw\u0089\u008d\u0094\u009c"+
		"\u00a2\u00aa\u00b2\u00ba\u00c5\u00cd\u00d0\u00da\u00e3\u00ed\u00f7\u00fa"+
		"\u00fd\u010a\u0110\u0112\u011b\u012b\u0133\u0147\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}