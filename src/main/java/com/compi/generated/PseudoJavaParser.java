// Generated from C:/Users/fran-/IdeaProjects/PseudoJava\PseudoJavaParser.g4 by ANTLR 4.9.1
package com.compi.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, IF=2, ELSE=3, RETURN=4, PRINT=5, CLASS=6, BOOLEAN=7, CHAR=8, 
		INT=9, STRING=10, LENGTH=11, TRUE=12, FALSE=13, OR=14, AND=15, CUR_OPEN_BRACE=16, 
		CUR_CLOSE_BRACE=17, OPEN_PARENTHESIS=18, CLOSED_PARENTHESIS=19, SEMICOLON=20, 
		COMMA=21, ASSIGN=22, DOT=23, SUM=24, MINUS=25, NEAGTE=26, NEW=27, OPEN_BRACKET=28, 
		CLOSED_BRACKET=29, LESS_THAN=30, GREATER_THAN=31, EQUAL=32, DISTINCT=33, 
		LESS_OR_EQUAL_THAN=34, GREATER_OR_EQUAL_THAN=35, UNDERSCORE=36, SLASH=37, 
		MULTIPLICATION=38, QUOTATION_MARKS=39, WHITESPACES=40, LINE_COMMENT=41, 
		IDENTIFIER=42, INT_LITERAL=43, REAL_LITERAL=44, STRING_LITERAL=45;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_function_declaration = 3, 
		RULE_formal_params = 4, RULE_formal_param = 5, RULE_while_statement = 6, 
		RULE_if_statement = 7, RULE_return_statement = 8, RULE_print_statement = 9, 
		RULE_class_declaration = 10, RULE_variable_declaration = 11, RULE_type = 12, 
		RULE_simple_type = 13, RULE_array_type = 14, RULE_assignment = 15, RULE_array_assignment = 16, 
		RULE_expression = 17, RULE_simple_expression = 18, RULE_term = 19, RULE_factor = 20, 
		RULE_unary = 21, RULE_allocation_expression = 22, RULE_array_allocation_expression = 23, 
		RULE_sub_expression = 24, RULE_function_call = 25, RULE_actual_params = 26, 
		RULE_array_lookup = 27, RULE_array_length = 28, RULE_relational_op = 29, 
		RULE_additive_op = 30, RULE_multiplicative_op = 31, RULE_literal = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "function_declaration", "formal_params", 
			"formal_param", "while_statement", "if_statement", "return_statement", 
			"print_statement", "class_declaration", "variable_declaration", "type", 
			"simple_type", "array_type", "assignment", "array_assignment", "expression", 
			"simple_expression", "term", "factor", "unary", "allocation_expression", 
			"array_allocation_expression", "sub_expression", "function_call", "actual_params", 
			"array_lookup", "array_length", "relational_op", "additive_op", "multiplicative_op", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'else'", "'return'", "'print'", "'class'", 
			"'boolean'", "'char'", "'int'", "'string'", "'length'", "'true'", "'false'", 
			"'||'", "'&&'", "'{'", "'}'", "'('", "')'", "';'", "','", "'='", "'.'", 
			"'+'", "'-'", "'!'", "'new'", "'['", "']'", "'<'", "'>'", "'=='", "'!='", 
			"'<='", "'>='", "'_'", "'/'", "'*'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "IF", "ELSE", "RETURN", "PRINT", "CLASS", "BOOLEAN", "CHAR", 
			"INT", "STRING", "LENGTH", "TRUE", "FALSE", "OR", "AND", "CUR_OPEN_BRACE", 
			"CUR_CLOSE_BRACE", "OPEN_PARENTHESIS", "CLOSED_PARENTHESIS", "SEMICOLON", 
			"COMMA", "ASSIGN", "DOT", "SUM", "MINUS", "NEAGTE", "NEW", "OPEN_BRACKET", 
			"CLOSED_BRACKET", "LESS_THAN", "GREATER_THAN", "EQUAL", "DISTINCT", "LESS_OR_EQUAL_THAN", 
			"GREATER_OR_EQUAL_THAN", "UNDERSCORE", "SLASH", "MULTIPLICATION", "QUOTATION_MARKS", 
			"WHITESPACES", "LINE_COMMENT", "IDENTIFIER", "INT_LITERAL", "REAL_LITERAL", 
			"STRING_LITERAL"
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
	public String getGrammarFileName() { return "PseudoJavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << CUR_OPEN_BRACE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
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

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PseudoJavaParser.SEMICOLON, 0); }
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variable_declaration();
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				class_declaration();
				setState(76);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				assignment();
				setState(79);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				array_assignment();
				setState(82);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				print_statement();
				setState(85);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				return_statement();
				setState(90);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				function_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode CUR_OPEN_BRACE() { return getToken(PseudoJavaParser.CUR_OPEN_BRACE, 0); }
		public TerminalNode CUR_CLOSE_BRACE() { return getToken(PseudoJavaParser.CUR_CLOSE_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(CUR_OPEN_BRACE);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << PRINT) | (1L << CLASS) | (1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << CUR_OPEN_BRACE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(97);
				statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(CUR_CLOSE_BRACE);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	 
		public Function_declarationContext() { }
		public void copyFrom(Function_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclASTContext extends Function_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Formal_paramsContext formal_params() {
			return getRuleContext(Formal_paramsContext.class,0);
		}
		public FunctionDeclASTContext(Function_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFunctionDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_declaration);
		int _la;
		try {
			_localctx = new FunctionDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(OPEN_PARENTHESIS);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(108);
				formal_params();
				}
			}

			setState(111);
			match(CLOSED_PARENTHESIS);
			setState(112);
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

	public static class Formal_paramsContext extends ParserRuleContext {
		public Formal_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_params; }
	 
		public Formal_paramsContext() { }
		public void copyFrom(Formal_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamsASTContext extends Formal_paramsContext {
		public List<Formal_paramContext> formal_param() {
			return getRuleContexts(Formal_paramContext.class);
		}
		public Formal_paramContext formal_param(int i) {
			return getRuleContext(Formal_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoJavaParser.COMMA, i);
		}
		public FormalParamsASTContext(Formal_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFormalParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramsContext formal_params() throws RecognitionException {
		Formal_paramsContext _localctx = new Formal_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal_params);
		int _la;
		try {
			_localctx = new FormalParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			formal_param();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				formal_param();
				}
				}
				setState(121);
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

	public static class Formal_paramContext extends ParserRuleContext {
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
	 
		public Formal_paramContext() { }
		public void copyFrom(Formal_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamASTContext extends Formal_paramContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public FormalParamASTContext(Formal_paramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFormalParamAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formal_param);
		try {
			_localctx = new FormalParamASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(123);
			match(IDENTIFIER);
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

	public static class While_statementContext extends ParserRuleContext {
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	 
		public While_statementContext() { }
		public void copyFrom(While_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileASTContext extends While_statementContext {
		public TerminalNode WHILE() { return getToken(PseudoJavaParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileASTContext(While_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitWhileAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_statement);
		try {
			_localctx = new WhileASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WHILE);
			setState(126);
			match(OPEN_PARENTHESIS);
			setState(127);
			expression();
			setState(128);
			match(CLOSED_PARENTHESIS);
			setState(129);
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

	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfASTContext extends If_statementContext {
		public TerminalNode IF() { return getToken(PseudoJavaParser.IF, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PseudoJavaParser.ELSE, 0); }
		public IfASTContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitIfAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			_localctx = new IfASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IF);
			setState(132);
			match(OPEN_PARENTHESIS);
			setState(133);
			expression();
			setState(134);
			match(CLOSED_PARENTHESIS);
			setState(135);
			block();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(136);
				match(ELSE);
				setState(137);
				block();
				}
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

	public static class Return_statementContext extends ParserRuleContext {
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	 
		public Return_statementContext() { }
		public void copyFrom(Return_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnASTContext extends Return_statementContext {
		public TerminalNode RETURN() { return getToken(PseudoJavaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnASTContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitReturnAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_statement);
		try {
			_localctx = new ReturnASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(RETURN);
			setState(141);
			expression();
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

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintASTContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(PseudoJavaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintASTContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitPrintAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print_statement);
		try {
			_localctx = new PrintASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(PRINT);
			setState(144);
			expression();
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

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	 
		public Class_declarationContext() { }
		public void copyFrom(Class_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclASTContext extends Class_declarationContext {
		public TerminalNode CLASS() { return getToken(PseudoJavaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode CUR_OPEN_BRACE() { return getToken(PseudoJavaParser.CUR_OPEN_BRACE, 0); }
		public TerminalNode CUR_CLOSE_BRACE() { return getToken(PseudoJavaParser.CUR_CLOSE_BRACE, 0); }
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PseudoJavaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PseudoJavaParser.SEMICOLON, i);
		}
		public ClassDeclASTContext(Class_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_declaration);
		int _la;
		try {
			_localctx = new ClassDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(CLASS);
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(CUR_OPEN_BRACE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(149);
				variable_declaration();
				setState(150);
				match(SEMICOLON);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(CUR_CLOSE_BRACE);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclASTContext extends Variable_declarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PseudoJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclASTContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitVariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable_declaration);
		int _la;
		try {
			_localctx = new VariableDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			type();
			setState(160);
			match(IDENTIFIER);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(161);
				match(ASSIGN);
				setState(162);
				expression();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SmpTypeASTContext extends TypeContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public SmpTypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitSmpTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrTypeASTContext extends TypeContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public ArrTypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdTypeASTContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public IdTypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitIdTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SmpTypeASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				simple_type();
				}
				break;
			case 2:
				_localctx = new ArrTypeASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				array_type();
				}
				break;
			case 3:
				_localctx = new IdTypeASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(IDENTIFIER);
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

	public static class Simple_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PseudoJavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(PseudoJavaParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(PseudoJavaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(PseudoJavaParser.STRING, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Array_typeContext extends ParserRuleContext {
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	 
		public Array_typeContext() { }
		public void copyFrom(Array_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeASTContext extends Array_typeContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PseudoJavaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSED_BRACKET() { return getToken(PseudoJavaParser.CLOSED_BRACKET, 0); }
		public ArrayTypeASTContext(Array_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrayTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_type);
		try {
			_localctx = new ArrayTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			simple_type();
			setState(173);
			match(OPEN_BRACKET);
			setState(174);
			match(CLOSED_BRACKET);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentASTContext extends AssignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PseudoJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentASTContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitAssignmentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			_localctx = new AssignmentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IDENTIFIER);
			setState(177);
			match(ASSIGN);
			setState(178);
			expression();
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
	 
		public Array_assignmentContext() { }
		public void copyFrom(Array_assignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignmentASTContext extends Array_assignmentContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PseudoJavaParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSED_BRACKET() { return getToken(PseudoJavaParser.CLOSED_BRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(PseudoJavaParser.ASSIGN, 0); }
		public ArrayAssignmentASTContext(Array_assignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrayAssignmentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_assignment);
		try {
			_localctx = new ArrayAssignmentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(OPEN_BRACKET);
			setState(182);
			expression();
			setState(183);
			match(CLOSED_BRACKET);
			setState(184);
			match(ASSIGN);
			setState(185);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public List<Relational_opContext> relational_op() {
			return getRuleContexts(Relational_opContext.class);
		}
		public Relational_opContext relational_op(int i) {
			return getRuleContext(Relational_opContext.class,i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			int _alt;
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			simple_expression();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					relational_op();
					setState(189);
					simple_expression();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	 
		public Simple_expressionContext() { }
		public void copyFrom(Simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpASTContext extends Simple_expressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Additive_opContext> additive_op() {
			return getRuleContexts(Additive_opContext.class);
		}
		public Additive_opContext additive_op(int i) {
			return getRuleContext(Additive_opContext.class,i);
		}
		public SimpleExpASTContext(Simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitSimpleExpAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_simple_expression);
		try {
			int _alt;
			_localctx = new SimpleExpASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			term();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					additive_op();
					setState(198);
					term();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Multiplicative_opContext> multiplicative_op() {
			return getRuleContexts(Multiplicative_opContext.class);
		}
		public Multiplicative_opContext multiplicative_op(int i) {
			return getRuleContext(Multiplicative_opContext.class,i);
		}
		public TermASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			int _alt;
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			factor();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					multiplicative_op();
					setState(207);
					factor();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrLengthFactASTContext extends FactorContext {
		public Array_lengthContext array_length() {
			return getRuleContext(Array_lengthContext.class,0);
		}
		public ArrLengthFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrLengthFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryFactASTContext extends FactorContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitUnaryFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpFactASTContext extends FactorContext {
		public Sub_expressionContext sub_expression() {
			return getRuleContext(Sub_expressionContext.class,0);
		}
		public SubExpFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitSubExpFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAllocFactASTContext extends FactorContext {
		public Array_allocation_expressionContext array_allocation_expression() {
			return getRuleContext(Array_allocation_expressionContext.class,0);
		}
		public ArrAllocFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrAllocFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorIDFactASTContext extends FactorContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public FactorIDFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFactorIDFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralFactASTContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitLiteralFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllocFactASTContext extends FactorContext {
		public Allocation_expressionContext allocation_expression() {
			return getRuleContext(Allocation_expressionContext.class,0);
		}
		public AllocFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitAllocFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallFactASTContext extends FactorContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncCallFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFuncCallFactAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrLookUpFactASTContext extends FactorContext {
		public Array_lookupContext array_lookup() {
			return getRuleContext(Array_lookupContext.class,0);
		}
		public ArrLookUpFactASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrLookUpFactAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new LiteralFactASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				literal();
				}
				break;
			case 2:
				_localctx = new FactorIDFactASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new FuncCallFactASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				function_call();
				}
				break;
			case 4:
				_localctx = new ArrLookUpFactASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				array_lookup();
				}
				break;
			case 5:
				_localctx = new ArrLengthFactASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				array_length();
				}
				break;
			case 6:
				_localctx = new SubExpFactASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				sub_expression();
				}
				break;
			case 7:
				_localctx = new ArrAllocFactASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				array_allocation_expression();
				}
				break;
			case 8:
				_localctx = new AllocFactASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				allocation_expression();
				}
				break;
			case 9:
				_localctx = new UnaryFactASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryASTContext extends UnaryContext {
		public TerminalNode SUM() { return getToken(PseudoJavaParser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(PseudoJavaParser.MINUS, 0); }
		public TerminalNode NEAGTE() { return getToken(PseudoJavaParser.NEAGTE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryASTContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitUnaryAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unary);
		int _la;
		try {
			int _alt;
			_localctx = new UnaryASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << MINUS) | (1L << NEAGTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					expression();
					}
					} 
				}
				setState(231);
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

	public static class Allocation_expressionContext extends ParserRuleContext {
		public Allocation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocation_expression; }
	 
		public Allocation_expressionContext() { }
		public void copyFrom(Allocation_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllocASTContext extends Allocation_expressionContext {
		public TerminalNode NEW() { return getToken(PseudoJavaParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public AllocASTContext(Allocation_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitAllocAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Allocation_expressionContext allocation_expression() throws RecognitionException {
		Allocation_expressionContext _localctx = new Allocation_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_allocation_expression);
		try {
			_localctx = new AllocASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NEW);
			setState(233);
			match(IDENTIFIER);
			setState(234);
			match(OPEN_PARENTHESIS);
			setState(235);
			match(CLOSED_PARENTHESIS);
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

	public static class Array_allocation_expressionContext extends ParserRuleContext {
		public Array_allocation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_allocation_expression; }
	 
		public Array_allocation_expressionContext() { }
		public void copyFrom(Array_allocation_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAllocASTContext extends Array_allocation_expressionContext {
		public TerminalNode NEW() { return getToken(PseudoJavaParser.NEW, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PseudoJavaParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_BRACKET() { return getToken(PseudoJavaParser.CLOSED_BRACKET, 0); }
		public ArrayAllocASTContext(Array_allocation_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrayAllocAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_allocation_expressionContext array_allocation_expression() throws RecognitionException {
		Array_allocation_expressionContext _localctx = new Array_allocation_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_allocation_expression);
		try {
			_localctx = new ArrayAllocASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(NEW);
			setState(238);
			simple_type();
			setState(239);
			match(OPEN_BRACKET);
			setState(240);
			expression();
			setState(241);
			match(CLOSED_BRACKET);
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

	public static class Sub_expressionContext extends ParserRuleContext {
		public Sub_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_expression; }
	 
		public Sub_expressionContext() { }
		public void copyFrom(Sub_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubExpASTContext extends Sub_expressionContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public SubExpASTContext(Sub_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitSubExpAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_expressionContext sub_expression() throws RecognitionException {
		Sub_expressionContext _localctx = new Sub_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sub_expression);
		try {
			_localctx = new SubExpASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(OPEN_PARENTHESIS);
			setState(244);
			expression();
			setState(245);
			match(CLOSED_PARENTHESIS);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	 
		public Function_callContext() { }
		public void copyFrom(Function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallASTContext extends Function_callContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(PseudoJavaParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode CLOSED_PARENTHESIS() { return getToken(PseudoJavaParser.CLOSED_PARENTHESIS, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public FunctionCallASTContext(Function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitFunctionCallAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_call);
		int _la;
		try {
			_localctx = new FunctionCallASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(OPEN_PARENTHESIS);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << OPEN_PARENTHESIS) | (1L << SUM) | (1L << MINUS) | (1L << NEAGTE) | (1L << NEW) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << REAL_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(249);
				actual_params();
				}
			}

			setState(252);
			match(CLOSED_PARENTHESIS);
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

	public static class Actual_paramsContext extends ParserRuleContext {
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
	 
		public Actual_paramsContext() { }
		public void copyFrom(Actual_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualParamsASTContext extends Actual_paramsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoJavaParser.COMMA, i);
		}
		public ActualParamsASTContext(Actual_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitActualParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actual_params);
		int _la;
		try {
			_localctx = new ActualParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				expression();
				}
				}
				setState(261);
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

	public static class Array_lookupContext extends ParserRuleContext {
		public Array_lookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_lookup; }
	 
		public Array_lookupContext() { }
		public void copyFrom(Array_lookupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLookupASTContext extends Array_lookupContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PseudoJavaParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSED_BRACKET() { return getToken(PseudoJavaParser.CLOSED_BRACKET, 0); }
		public ArrayLookupASTContext(Array_lookupContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrayLookupAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_lookupContext array_lookup() throws RecognitionException {
		Array_lookupContext _localctx = new Array_lookupContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_lookup);
		try {
			_localctx = new ArrayLookupASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(OPEN_BRACKET);
			setState(264);
			expression();
			setState(265);
			match(CLOSED_BRACKET);
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

	public static class Array_lengthContext extends ParserRuleContext {
		public Array_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_length; }
	 
		public Array_lengthContext() { }
		public void copyFrom(Array_lengthContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLengthASTContext extends Array_lengthContext {
		public TerminalNode IDENTIFIER() { return getToken(PseudoJavaParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(PseudoJavaParser.DOT, 0); }
		public TerminalNode LENGTH() { return getToken(PseudoJavaParser.LENGTH, 0); }
		public ArrayLengthASTContext(Array_lengthContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitArrayLengthAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_lengthContext array_length() throws RecognitionException {
		Array_lengthContext _localctx = new Array_lengthContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_length);
		try {
			_localctx = new ArrayLengthASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFIER);
			setState(268);
			match(DOT);
			setState(269);
			match(LENGTH);
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

	public static class Relational_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(PseudoJavaParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PseudoJavaParser.GREATER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(PseudoJavaParser.EQUAL, 0); }
		public TerminalNode DISTINCT() { return getToken(PseudoJavaParser.DISTINCT, 0); }
		public TerminalNode LESS_OR_EQUAL_THAN() { return getToken(PseudoJavaParser.LESS_OR_EQUAL_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(PseudoJavaParser.GREATER_OR_EQUAL_THAN, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitRelational_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUAL) | (1L << DISTINCT) | (1L << LESS_OR_EQUAL_THAN) | (1L << GREATER_OR_EQUAL_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Additive_opContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(PseudoJavaParser.SUM, 0); }
		public TerminalNode MINUS() { return getToken(PseudoJavaParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PseudoJavaParser.OR, 0); }
		public Additive_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitAdditive_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_opContext additive_op() throws RecognitionException {
		Additive_opContext _localctx = new Additive_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additive_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << SUM) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Multiplicative_opContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(PseudoJavaParser.MULTIPLICATION, 0); }
		public TerminalNode SLASH() { return getToken(PseudoJavaParser.SLASH, 0); }
		public TerminalNode AND() { return getToken(PseudoJavaParser.AND, 0); }
		public Multiplicative_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitMultiplicative_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_opContext multiplicative_op() throws RecognitionException {
		Multiplicative_opContext _localctx = new Multiplicative_opContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicative_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << SLASH) | (1L << MULTIPLICATION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(PseudoJavaParser.INT_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(PseudoJavaParser.REAL_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(PseudoJavaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PseudoJavaParser.FALSE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PseudoJavaParser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoJavaParserVisitor ) return ((PseudoJavaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INT_LITERAL) | (1L << REAL_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3"+
		"\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\5\16\u00ab\n\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23"+
		"\3\24\3\24\3\24\3\24\7\24\u00cb\n\24\f\24\16\24\u00ce\13\24\3\25\3\25"+
		"\3\25\3\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00e2\n\26\3\27\3\27\7\27\u00e6\n\27\f"+
		"\27\16\27\u00e9\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00fd\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\7\34\u0104\n\34\f\34\16\34\u0107\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\2#\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\b\3\2\t"+
		"\f\3\2\32\34\3\2 %\4\2\20\20\32\33\4\2\21\21\'(\4\2\16\17-/\2\u0118\2"+
		"G\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\bk\3\2\2\2\nt\3\2\2\2\f|\3\2\2\2\16\177"+
		"\3\2\2\2\20\u0085\3\2\2\2\22\u008e\3\2\2\2\24\u0091\3\2\2\2\26\u0094\3"+
		"\2\2\2\30\u00a1\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00ae\3\2"+
		"\2\2 \u00b2\3\2\2\2\"\u00b6\3\2\2\2$\u00bd\3\2\2\2&\u00c6\3\2\2\2(\u00cf"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00ea\3\2\2\2\60\u00ef\3\2\2\2"+
		"\62\u00f5\3\2\2\2\64\u00f9\3\2\2\2\66\u0100\3\2\2\28\u0108\3\2\2\2:\u010d"+
		"\3\2\2\2<\u0111\3\2\2\2>\u0113\3\2\2\2@\u0115\3\2\2\2B\u0117\3\2\2\2D"+
		"F\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2"+
		"JK\5\30\r\2KL\7\26\2\2La\3\2\2\2MN\5\26\f\2NO\7\26\2\2Oa\3\2\2\2PQ\5 "+
		"\21\2QR\7\26\2\2Ra\3\2\2\2ST\5\"\22\2TU\7\26\2\2Ua\3\2\2\2VW\5\24\13\2"+
		"WX\7\26\2\2Xa\3\2\2\2Ya\5\20\t\2Za\5\16\b\2[\\\5\22\n\2\\]\7\26\2\2]a"+
		"\3\2\2\2^a\5\b\5\2_a\5\6\4\2`J\3\2\2\2`M\3\2\2\2`P\3\2\2\2`S\3\2\2\2`"+
		"V\3\2\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\5\3\2\2\2"+
		"bf\7\22\2\2ce\5\4\3\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\23\2\2j\7\3\2\2\2kl\5\32\16\2lm\7,\2\2mo\7\24\2\2np\5"+
		"\n\6\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\25\2\2rs\5\6\4\2s\t\3\2\2\2t"+
		"y\5\f\7\2uv\7\27\2\2vx\5\f\7\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\13\3\2\2\2{y\3\2\2\2|}\5\32\16\2}~\7,\2\2~\r\3\2\2\2\177\u0080\7\3\2"+
		"\2\u0080\u0081\7\24\2\2\u0081\u0082\5$\23\2\u0082\u0083\7\25\2\2\u0083"+
		"\u0084\5\6\4\2\u0084\17\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\7\24\2"+
		"\2\u0087\u0088\5$\23\2\u0088\u0089\7\25\2\2\u0089\u008c\5\6\4\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008d\5\6\4\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\21\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\5$\23\2\u0090\23"+
		"\3\2\2\2\u0091\u0092\7\7\2\2\u0092\u0093\5$\23\2\u0093\25\3\2\2\2\u0094"+
		"\u0095\7\b\2\2\u0095\u0096\7,\2\2\u0096\u009c\7\22\2\2\u0097\u0098\5\30"+
		"\r\2\u0098\u0099\7\26\2\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0\27\3\2\2\2\u00a1\u00a2"+
		"\5\32\16\2\u00a2\u00a5\7,\2\2\u00a3\u00a4\7\30\2\2\u00a4\u00a6\5$\23\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00ab"+
		"\5\34\17\2\u00a8\u00ab\5\36\20\2\u00a9\u00ab\7,\2\2\u00aa\u00a7\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad"+
		"\t\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af\5\34\17\2\u00af\u00b0\7\36\2\2\u00b0"+
		"\u00b1\7\37\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\u00b4\7\30\2"+
		"\2\u00b4\u00b5\5$\23\2\u00b5!\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7"+
		"\36\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\7\37\2\2\u00ba\u00bb\7\30\2\2"+
		"\u00bb\u00bc\5$\23\2\u00bc#\3\2\2\2\u00bd\u00c3\5&\24\2\u00be\u00bf\5"+
		"<\37\2\u00bf\u00c0\5&\24\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c6\u00cc\5(\25\2\u00c7\u00c8\5> \2\u00c8\u00c9"+
		"\5(\25\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d5\5*\26\2\u00d0\u00d1\5@!\2\u00d1\u00d2\5*\26\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6)\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00e2\5B\"\2\u00d9"+
		"\u00e2\7,\2\2\u00da\u00e2\5\64\33\2\u00db\u00e2\58\35\2\u00dc\u00e2\5"+
		":\36\2\u00dd\u00e2\5\62\32\2\u00de\u00e2\5\60\31\2\u00df\u00e2\5.\30\2"+
		"\u00e0\u00e2\5,\27\2\u00e1\u00d8\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da"+
		"\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2+\3\2\2\2"+
		"\u00e3\u00e7\t\3\2\2\u00e4\u00e6\5$\23\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8-\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\7\35\2\2\u00eb\u00ec\7,\2\2\u00ec\u00ed\7\24"+
		"\2\2\u00ed\u00ee\7\25\2\2\u00ee/\3\2\2\2\u00ef\u00f0\7\35\2\2\u00f0\u00f1"+
		"\5\34\17\2\u00f1\u00f2\7\36\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\7\37\2"+
		"\2\u00f4\61\3\2\2\2\u00f5\u00f6\7\24\2\2\u00f6\u00f7\5$\23\2\u00f7\u00f8"+
		"\7\25\2\2\u00f8\63\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fc\7\24\2\2\u00fb"+
		"\u00fd\5\66\34\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u00ff\7\25\2\2\u00ff\65\3\2\2\2\u0100\u0105\5$\23\2\u0101"+
		"\u0102\7\27\2\2\u0102\u0104\5$\23\2\u0103\u0101\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\67\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\7\36\2\2\u010a\u010b\5$"+
		"\23\2\u010b\u010c\7\37\2\2\u010c9\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f"+
		"\7\31\2\2\u010f\u0110\7\r\2\2\u0110;\3\2\2\2\u0111\u0112\t\4\2\2\u0112"+
		"=\3\2\2\2\u0113\u0114\t\5\2\2\u0114?\3\2\2\2\u0115\u0116\t\6\2\2\u0116"+
		"A\3\2\2\2\u0117\u0118\t\7\2\2\u0118C\3\2\2\2\22G`foy\u008c\u009c\u00a5"+
		"\u00aa\u00c3\u00cc\u00d5\u00e1\u00e7\u00fc\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}