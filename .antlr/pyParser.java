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
		CONTINUE=10, WHILE=11, IS=12, NOT=13, IN=14, OR=15, AND=16, FOR=17, INT=18, 
		STR=19, FLOAT=20, LIST=21, BOOL=22, TRUE=23, FALSE=24, NONE=25, NUMBER=26, 
		STRING=27, IDENTIFIER=28, COMMA=29, PLUS=30, MINUS=31, POW=32, MULT=33, 
		DIV=34, DIVI=35, ASSIGN=36, MOD=37, LT=38, GT=39, LOE=40, GOE=41, EQ=42, 
		NEQ=43, LPAREN=44, RPAREN=45, LBRACKET=46, RBRACKET=47, COLON=48, BEGIN=49, 
		END=50, DOT=51, INDICATOR=52, WS=53;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_control_stmt = 3, 
		RULE_type = 4, RULE_assignment = 5, RULE_comparison_op = 6, RULE_expr = 7, 
		RULE_logic_expr = 8, RULE_logic_term = 9, RULE_logic_factor = 10, RULE_comparison_expr = 11, 
		RULE_valued_expr = 12, RULE_term = 13, RULE_factor = 14, RULE_list_expr = 15, 
		RULE_key_value_pair = 16, RULE_fstring_expr = 17, RULE_compound_stmt = 18, 
		RULE_block = 19, RULE_if_stmt = 20, RULE_while_stmt = 21, RULE_funcdef = 22, 
		RULE_for_stmt = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "control_stmt", "type", "assignment", 
			"comparison_op", "expr", "logic_expr", "logic_term", "logic_factor", 
			"comparison_expr", "valued_expr", "term", "factor", "list_expr", "key_value_pair", 
			"fstring_expr", "compound_stmt", "block", "if_stmt", "while_stmt", "funcdef", 
			"for_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", null, null, "'if'", "'elif'", "'else'", "'def'", "'return'", 
			"'break'", "'continue'", "'while'", "'is'", "'not'", "'in'", "'or'", 
			"'and'", "'for'", "'int'", "'str'", "'float'", "'list'", "'bool'", "'True'", 
			"'False'", "'None'", null, null, null, "','", "'+'", "'-'", "'**'", "'*'", 
			"'/'", "'//'", "'='", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'('", "')'", "'['", "']'", "':'", "'{'", "'}'", "'.'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NEWLINE", "COMMENT", "IF", "ELIF", "ELSE", "DEF", "RETURN", 
			"BREAK", "CONTINUE", "WHILE", "IS", "NOT", "IN", "OR", "AND", "FOR", 
			"INT", "STR", "FLOAT", "LIST", "BOOL", "TRUE", "FALSE", "NONE", "NUMBER", 
			"STRING", "IDENTIFIER", "COMMA", "PLUS", "MINUS", "POW", "MULT", "DIV", 
			"DIVI", "ASSIGN", "MOD", "LT", "GT", "LOE", "GOE", "EQ", "NEQ", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "COLON", "BEGIN", "END", "DOT", "INDICATOR", 
			"WS"
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87961458845854L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case NEWLINE:
				case IF:
				case DEF:
				case WHILE:
				case NOT:
				case FOR:
				case TRUE:
				case FALSE:
				case NONE:
				case NUMBER:
				case STRING:
				case IDENTIFIER:
				case LPAREN:
				case LBRACKET:
					{
					setState(48);
					statement();
					}
					break;
				case COMMENT:
					{
					setState(49);
					match(COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT:
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
				setState(57);
				simple_stmt();
				setState(58);
				match(NEWLINE);
				}
				break;
			case IF:
			case DEF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				compound_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
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
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				expr();
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(RETURN);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(69);
					expr();
					}
					break;
				}
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(INT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(STR);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(BOOL);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(LIST);
				setState(81);
				match(LBRACKET);
				setState(82);
				type();
				setState(83);
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
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(88);
				match(LBRACKET);
				setState(89);
				valued_expr();
				setState(90);
				match(RBRACKET);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(ASSIGN);
			setState(98);
			expr();
			setState(99);
			match(INDICATOR);
			setState(100);
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
		enterRule(_localctx, 12, RULE_comparison_op);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(NEQ);
				}
				break;
			case GOE:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(GOE);
				}
				break;
			case LOE:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(LOE);
				}
				break;
			case IS:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(IS);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				match(NOT);
				setState(111);
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
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				valued_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
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
		enterRule(_localctx, 16, RULE_logic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			logic_term();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(119);
				match(OR);
				setState(120);
				logic_term();
				}
				}
				setState(125);
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
		enterRule(_localctx, 18, RULE_logic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			logic_factor();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(127);
				match(AND);
				setState(128);
				logic_factor();
				}
				}
				setState(133);
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
		enterRule(_localctx, 20, RULE_logic_factor);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(NOT);
				setState(135);
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
				setState(136);
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
		enterRule(_localctx, 22, RULE_comparison_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			valued_expr();
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					comparison_op();
					setState(141);
					valued_expr();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_valued_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			term();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				term();
				}
				}
				setState(155);
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
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			factor();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 201863462912L) != 0)) {
				{
				{
				setState(157);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 201863462912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				factor();
				}
				}
				setState(163);
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
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			int _alt;
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(NONE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(IDENTIFIER);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(170);
					match(DOT);
					setState(171);
					match(IDENTIFIER);
					}
				}

				setState(174);
				match(LPAREN);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87961458712578L) != 0)) {
					{
					setState(175);
					expr();
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(176);
						match(COMMA);
						setState(177);
						expr();
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(185);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				match(IDENTIFIER);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(187);
						match(LBRACKET);
						setState(188);
						valued_expr();
						setState(189);
						match(RBRACKET);
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(LPAREN);
				setState(197);
				expr();
				setState(198);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				list_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
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
		enterRule(_localctx, 30, RULE_list_expr);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(LBRACKET);
				setState(205);
				expr();
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					match(FOR);
					setState(207);
					match(IDENTIFIER);
					setState(208);
					match(IN);
					setState(209);
					expr();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FOR );
				setState(214);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(LBRACKET);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87961458712578L) != 0)) {
					{
					setState(217);
					expr();
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(218);
						match(COMMA);
						setState(219);
						expr();
						}
						}
						setState(224);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(227);
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
		enterRule(_localctx, 32, RULE_key_value_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expr();
			setState(231);
			match(COLON);
			setState(232);
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
		enterRule(_localctx, 34, RULE_fstring_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__0);
			setState(235);
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
		enterRule(_localctx, 36, RULE_compound_stmt);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
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
		public TerminalNode NEWLINE() { return getToken(pyParser.NEWLINE, 0); }
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(BEGIN);
			setState(244);
			match(NEWLINE);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 87961458847638L) != 0)) {
				{
				setState(247);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case NEWLINE:
				case IF:
				case DEF:
				case WHILE:
				case NOT:
				case FOR:
				case TRUE:
				case FALSE:
				case NONE:
				case NUMBER:
				case STRING:
				case IDENTIFIER:
				case LPAREN:
				case LBRACKET:
					{
					setState(245);
					statement();
					}
					break;
				case RETURN:
				case BREAK:
				case CONTINUE:
					{
					setState(246);
					control_stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(END);
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
		enterRule(_localctx, 40, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IF);
			setState(255);
			logic_expr();
			setState(256);
			match(COLON);
			setState(257);
			match(NEWLINE);
			setState(258);
			block();
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(259);
					match(NEWLINE);
					setState(260);
					match(ELIF);
					setState(261);
					logic_expr();
					setState(262);
					match(COLON);
					setState(263);
					match(NEWLINE);
					setState(264);
					block();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(271);
				match(NEWLINE);
				setState(272);
				match(ELSE);
				setState(273);
				match(COLON);
				setState(274);
				match(NEWLINE);
				setState(275);
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
		enterRule(_localctx, 42, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(WHILE);
			setState(279);
			logic_expr();
			setState(280);
			match(COLON);
			setState(281);
			match(NEWLINE);
			setState(282);
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
		enterRule(_localctx, 44, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DEF);
			setState(285);
			match(IDENTIFIER);
			setState(286);
			match(LPAREN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(INDICATOR);
				setState(289);
				type();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					match(IDENTIFIER);
					setState(292);
					match(INDICATOR);
					setState(293);
					type();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(301);
			match(RPAREN);
			setState(302);
			match(COLON);
			setState(303);
			match(NEWLINE);
			setState(304);
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
		enterRule(_localctx, 46, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FOR);
			setState(307);
			match(IDENTIFIER);
			setState(308);
			match(IN);
			setState(309);
			expr();
			setState(310);
			match(COLON);
			setState(311);
			match(NEWLINE);
			setState(312);
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
		"\u0004\u00015\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005]\b\u0005"+
		"\n\u0005\f\u0005`\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"q\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007u\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0005\bz\b\b\n\b\f\b}\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u0082"+
		"\b\t\n\t\f\t\u0085\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u008a\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0090\b\u000b\n"+
		"\u000b\f\u000b\u0093\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0098\b\f"+
		"\n\f\f\f\u009b\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a0\b\r\n\r\f\r\u00a3"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ad\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e\n\u000e\f\u000e"+
		"\u00b6\t\u000e\u0003\u000e\u00b8\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c0\b\u000e\n"+
		"\u000e\f\u000e\u00c3\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cb\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00d3"+
		"\b\u000f\u000b\u000f\f\u000f\u00d4\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00dd\b\u000f\n\u000f"+
		"\f\u000f\u00e0\t\u000f\u0003\u000f\u00e2\b\u000f\u0001\u000f\u0003\u000f"+
		"\u00e5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00f2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00f8\b\u0013\n\u0013\f\u0013\u00fb\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u010b\b\u0014\n\u0014\f\u0014\u010e\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0115\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0127\b\u0016"+
		"\n\u0016\f\u0016\u012a\t\u0016\u0003\u0016\u012c\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0002\u0001\u0000"+
		"\u001e\u001f\u0002\u0000 #%%\u0158\u00004\u0001\u0000\u0000\u0000\u0002"+
		">\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006J\u0001"+
		"\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000"+
		"\fp\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0089\u0001\u0000"+
		"\u0000\u0000\u0016\u008b\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000"+
		"\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00ca\u0001\u0000"+
		"\u0000\u0000\u001e\u00e4\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000\u0000"+
		"\u0000\"\u00ea\u0001\u0000\u0000\u0000$\u00f1\u0001\u0000\u0000\u0000"+
		"&\u00f3\u0001\u0000\u0000\u0000(\u00fe\u0001\u0000\u0000\u0000*\u0116"+
		"\u0001\u0000\u0000\u0000,\u011c\u0001\u0000\u0000\u0000.\u0132\u0001\u0000"+
		"\u0000\u000003\u0003\u0002\u0001\u000013\u0005\u0003\u0000\u000020\u0001"+
		"\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001\u0001"+
		"\u0000\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0002\u0000\u0000"+
		";?\u0001\u0000\u0000\u0000<?\u0003$\u0012\u0000=?\u0005\u0002\u0000\u0000"+
		">9\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000?\u0003\u0001\u0000\u0000\u0000@C\u0003\n\u0005\u0000AC\u0003\u000e"+
		"\u0007\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0005"+
		"\u0001\u0000\u0000\u0000DF\u0005\b\u0000\u0000EG\u0003\u000e\u0007\u0000"+
		"FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GK\u0001\u0000\u0000"+
		"\u0000HK\u0005\t\u0000\u0000IK\u0005\n\u0000\u0000JD\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0007\u0001"+
		"\u0000\u0000\u0000LV\u0005\u0012\u0000\u0000MV\u0005\u0013\u0000\u0000"+
		"NV\u0005\u0014\u0000\u0000OV\u0005\u0016\u0000\u0000PQ\u0005\u0015\u0000"+
		"\u0000QR\u0005.\u0000\u0000RS\u0003\b\u0004\u0000ST\u0005/\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000"+
		"\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UP\u0001\u0000"+
		"\u0000\u0000V\t\u0001\u0000\u0000\u0000W^\u0005\u001c\u0000\u0000XY\u0005"+
		".\u0000\u0000YZ\u0003\u0018\f\u0000Z[\u0005/\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\X\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0005$\u0000\u0000bc\u0003\u000e\u0007\u0000"+
		"cd\u00054\u0000\u0000de\u0003\b\u0004\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fq\u0005&\u0000\u0000gq\u0005\'\u0000\u0000hq\u0005*\u0000\u0000iq\u0005"+
		"+\u0000\u0000jq\u0005)\u0000\u0000kq\u0005(\u0000\u0000lq\u0005\f\u0000"+
		"\u0000mq\u0005\u000e\u0000\u0000no\u0005\r\u0000\u0000oq\u0005\u000e\u0000"+
		"\u0000pf\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000ph\u0001\u0000"+
		"\u0000\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pk\u0001"+
		"\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000ru\u0003\u0018\f"+
		"\u0000su\u0003\u0010\b\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000u\u000f\u0001\u0000\u0000\u0000v{\u0003\u0012\t\u0000wx\u0005\u000f"+
		"\u0000\u0000xz\u0003\u0012\t\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0011"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0083\u0003\u0014"+
		"\n\u0000\u007f\u0080\u0005\u0010\u0000\u0000\u0080\u0082\u0003\u0014\n"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u008a\u0003\u0014\n\u0000"+
		"\u0088\u008a\u0003\u0016\u000b\u0000\u0089\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0015\u0001\u0000\u0000\u0000"+
		"\u008b\u0091\u0003\u0018\f\u0000\u008c\u008d\u0003\f\u0006\u0000\u008d"+
		"\u008e\u0003\u0018\f\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008c"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0017"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0099"+
		"\u0003\u001a\r\u0000\u0095\u0096\u0007\u0000\u0000\u0000\u0096\u0098\u0003"+
		"\u001a\r\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u00a1\u0003\u001c\u000e\u0000\u009d\u009e\u0007\u0001"+
		"\u0000\u0000\u009e\u00a0\u0003\u001c\u000e\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001b\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00cb\u0005\u001a"+
		"\u0000\u0000\u00a5\u00cb\u0005\u001b\u0000\u0000\u00a6\u00cb\u0005\u0017"+
		"\u0000\u0000\u00a7\u00cb\u0005\u0018\u0000\u0000\u00a8\u00cb\u0005\u0019"+
		"\u0000\u0000\u00a9\u00ac\u0005\u001c\u0000\u0000\u00aa\u00ab\u00053\u0000"+
		"\u0000\u00ab\u00ad\u0005\u001c\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b7\u0005,\u0000\u0000\u00af\u00b4\u0003\u000e\u0007\u0000"+
		"\u00b0\u00b1\u0005\u001d\u0000\u0000\u00b1\u00b3\u0003\u000e\u0007\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00cb\u0005-\u0000\u0000\u00ba"+
		"\u00c1\u0005\u001c\u0000\u0000\u00bb\u00bc\u0005.\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0018\f\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c2\u00cb\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005,\u0000\u0000\u00c5\u00c6\u0003\u000e"+
		"\u0007\u0000\u00c6\u00c7\u0005-\u0000\u0000\u00c7\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0003\u001e\u000f\u0000\u00c9\u00cb\u0003\"\u0011\u0000"+
		"\u00ca\u00a4\u0001\u0000\u0000\u0000\u00ca\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ca\u00a6\u0001\u0000\u0000\u0000\u00ca\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00a8\u0001\u0000\u0000\u0000\u00ca\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ca\u00ba\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005.\u0000\u0000\u00cd"+
		"\u00d2\u0003\u000e\u0007\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000\u00cf"+
		"\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0005\u000e\u0000\u0000\u00d1"+
		"\u00d3\u0003\u000e\u0007\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005/\u0000\u0000\u00d7\u00e5\u0001\u0000\u0000\u0000\u00d8\u00e1"+
		"\u0005.\u0000\u0000\u00d9\u00de\u0003\u000e\u0007\u0000\u00da\u00db\u0005"+
		"\u001d\u0000\u0000\u00db\u00dd\u0003\u000e\u0007\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0005/\u0000\u0000\u00e4\u00cc\u0001\u0000"+
		"\u0000\u0000\u00e4\u00d8\u0001\u0000\u0000\u0000\u00e5\u001f\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0003\u000e\u0007\u0000\u00e7\u00e8\u00050\u0000"+
		"\u0000\u00e8\u00e9\u0003\u000e\u0007\u0000\u00e9!\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0001\u0000\u0000\u00eb\u00ec\u0005\u001b\u0000\u0000"+
		"\u00ec#\u0001\u0000\u0000\u0000\u00ed\u00f2\u0003(\u0014\u0000\u00ee\u00f2"+
		"\u0003*\u0015\u0000\u00ef\u00f2\u0003.\u0017\u0000\u00f0\u00f2\u0003,"+
		"\u0016\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2%\u0001\u0000\u0000\u0000\u00f3\u00f4\u00051\u0000\u0000"+
		"\u00f4\u00f9\u0005\u0002\u0000\u0000\u00f5\u00f8\u0003\u0002\u0001\u0000"+
		"\u00f6\u00f8\u0003\u0006\u0003\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u00052\u0000\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0004\u0000\u0000\u00ff\u0100\u0003\u0010\b\u0000\u0100\u0101"+
		"\u00050\u0000\u0000\u0101\u0102\u0005\u0002\u0000\u0000\u0102\u010c\u0003"+
		"&\u0013\u0000\u0103\u0104\u0005\u0002\u0000\u0000\u0104\u0105\u0005\u0005"+
		"\u0000\u0000\u0105\u0106\u0003\u0010\b\u0000\u0106\u0107\u00050\u0000"+
		"\u0000\u0107\u0108\u0005\u0002\u0000\u0000\u0108\u0109\u0003&\u0013\u0000"+
		"\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0103\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0114\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000"+
		"\u0110\u0111\u0005\u0006\u0000\u0000\u0111\u0112\u00050\u0000\u0000\u0112"+
		"\u0113\u0005\u0002\u0000\u0000\u0113\u0115\u0003&\u0013\u0000\u0114\u010f"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115)\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0005\u000b\u0000\u0000\u0117\u0118\u0003"+
		"\u0010\b\u0000\u0118\u0119\u00050\u0000\u0000\u0119\u011a\u0005\u0002"+
		"\u0000\u0000\u011a\u011b\u0003&\u0013\u0000\u011b+\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\u0007\u0000\u0000\u011d\u011e\u0005\u001c\u0000\u0000"+
		"\u011e\u012b\u0005,\u0000\u0000\u011f\u0120\u0005\u001c\u0000\u0000\u0120"+
		"\u0121\u00054\u0000\u0000\u0121\u0128\u0003\b\u0004\u0000\u0122\u0123"+
		"\u0005\u001d\u0000\u0000\u0123\u0124\u0005\u001c\u0000\u0000\u0124\u0125"+
		"\u00054\u0000\u0000\u0125\u0127\u0003\b\u0004\u0000\u0126\u0122\u0001"+
		"\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u011f\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005-\u0000\u0000\u012e\u012f\u00050\u0000"+
		"\u0000\u012f\u0130\u0005\u0002\u0000\u0000\u0130\u0131\u0003&\u0013\u0000"+
		"\u0131-\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0011\u0000\u0000\u0133"+
		"\u0134\u0005\u001c\u0000\u0000\u0134\u0135\u0005\u000e\u0000\u0000\u0135"+
		"\u0136\u0003\u000e\u0007\u0000\u0136\u0137\u00050\u0000\u0000\u0137\u0138"+
		"\u0005\u0002\u0000\u0000\u0138\u0139\u0003&\u0013\u0000\u0139/\u0001\u0000"+
		"\u0000\u0000 24>BFJU^pt{\u0083\u0089\u0091\u0099\u00a1\u00ac\u00b4\u00b7"+
		"\u00c1\u00ca\u00d4\u00de\u00e1\u00e4\u00f1\u00f7\u00f9\u010c\u0114\u0128"+
		"\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}