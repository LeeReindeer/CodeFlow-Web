// Generated from CodeFlow.g4 by ANTLR 4.7.2

package moe.leer.codeflow.core;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeFlowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, STRING=2, INT=3, SHORT=4, DOUBLE=5, FLOAT=6, CHAR=7, LONG=8, BOOLEAN=9, 
		BYTE=10, FINAL=11, ABSTRACT=12, CLASS=13, EXTENDS=14, ENUM=15, IMPLEMENTS=16, 
		NEW=17, PACKAGE=18, PRIVATE=19, PUBLIC=20, PROTECTED=21, INTERFACE=22, 
		INSTANCEOF=23, STATIC=24, THIS=25, SUPER=26, IMPORT=27, FUNCTION=28, BREAK=29, 
		CASE=30, CONTINUE=31, DEFAULT=32, DO=33, ELSE=34, FOR=35, IF=36, GOTO=37, 
		RETURN=38, SWITCH=39, WHILE=40, TRY=41, CATCH=42, THROW=43, FINALLY=44, 
		THROWS=45, DECIMAL_LITERAL=46, HEX_LITERAL=47, OCT_LITERAL=48, BINARY_LITERAL=49, 
		FLOAT_LITERAL=50, HEX_FLOAT_LITERAL=51, BOOL_LITERAL=52, CHAR_LITERAL=53, 
		STRING_LITERAL=54, NULL_LITERAL=55, LPAREN=56, RPAREN=57, LBRACE=58, RBRACE=59, 
		LBRACK=60, RBRACK=61, SEMI=62, COMMA=63, DOT=64, GT=65, LT=66, BANG=67, 
		TILDE=68, QUESTION=69, COLON=70, EQUAL=71, LE=72, GE=73, NOTEQUAL=74, 
		AND=75, OR=76, INC=77, DEC=78, ADD=79, SUB=80, MUL=81, DIV=82, MOD=83, 
		BITAND=84, BITOR=85, CARET=86, LSHIFT=87, RSHIFT=88, URSHIFT=89, ASSIGN=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, ARROW=102, COLONCOLON=103, AT=104, ELLIPSIS=105, WS=106, 
		COMMENT=107, LINE_COMMENT=108, IDENTIFIER=109;
	public static final int
		RULE_functionDeclare = 0, RULE_functionBody = 1, RULE_qualifiedNameList = 2, 
		RULE_formalParams = 3, RULE_formalParamList = 4, RULE_formalParam = 5, 
		RULE_lastFormalParam = 6, RULE_variableModifier = 7, RULE_qualifiedName = 8, 
		RULE_fieldDeclare = 9, RULE_constructorDeclare = 10, RULE_variableDeclarators = 11, 
		RULE_variableDeclarator = 12, RULE_variableDeclaratorId = 13, RULE_variableInitializer = 14, 
		RULE_arrayInitializer = 15, RULE_toplevelStatement = 16, RULE_block = 17, 
		RULE_blockStatements = 18, RULE_blockStatement = 19, RULE_statement = 20, 
		RULE_ifBlock = 21, RULE_forBlock = 22, RULE_whileBlock = 23, RULE_doWhileBlock = 24, 
		RULE_forExpression = 25, RULE_enhancedForExpression = 26, RULE_forInit = 27, 
		RULE_parExpression = 28, RULE_parBooleanExpression = 29, RULE_booleanExpression = 30, 
		RULE_expression = 31, RULE_functionCall = 32, RULE_expressionList = 33, 
		RULE_typeList = 34, RULE_typeType = 35, RULE_classOrInterfaceType = 36, 
		RULE_functionType = 37, RULE_typeTypeOrVoid = 38, RULE_primitiveType = 39, 
		RULE_primary = 40, RULE_literal = 41, RULE_integerLiteral = 42, RULE_floatLiteral = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"functionDeclare", "functionBody", "qualifiedNameList", "formalParams", 
			"formalParamList", "formalParam", "lastFormalParam", "variableModifier", 
			"qualifiedName", "fieldDeclare", "constructorDeclare", "variableDeclarators", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "toplevelStatement", "block", "blockStatements", 
			"blockStatement", "statement", "ifBlock", "forBlock", "whileBlock", "doWhileBlock", 
			"forExpression", "enhancedForExpression", "forInit", "parExpression", 
			"parBooleanExpression", "booleanExpression", "expression", "functionCall", 
			"expressionList", "typeList", "typeType", "classOrInterfaceType", "functionType", 
			"typeTypeOrVoid", "primitiveType", "primary", "literal", "integerLiteral", 
			"floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'string'", "'int'", "'short'", "'double'", "'float'", 
			"'char'", "'long'", "'boolean'", "'byte'", "'final'", "'abstract'", "'class'", 
			"'extends'", "'enum'", "'implements'", "'new'", "'package'", "'private'", 
			"'public'", "'protected'", "'interface'", "'instanceof'", "'static'", 
			"'this'", "'super'", "'import'", "'fun'", "'break'", "'case'", "'continue'", 
			"'default'", "'do'", "'else'", "'for'", "'if'", "'goto'", "'return'", 
			"'switch'", "'while'", "'try'", "'catch'", "'throw'", "'finally'", "'throws'", 
			null, null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", 
			"'<<'", "'>>'", "'>>>'", "'='", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", 
			"'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "STRING", "INT", "SHORT", "DOUBLE", "FLOAT", "CHAR", "LONG", 
			"BOOLEAN", "BYTE", "FINAL", "ABSTRACT", "CLASS", "EXTENDS", "ENUM", "IMPLEMENTS", 
			"NEW", "PACKAGE", "PRIVATE", "PUBLIC", "PROTECTED", "INTERFACE", "INSTANCEOF", 
			"STATIC", "THIS", "SUPER", "IMPORT", "FUNCTION", "BREAK", "CASE", "CONTINUE", 
			"DEFAULT", "DO", "ELSE", "FOR", "IF", "GOTO", "RETURN", "SWITCH", "WHILE", 
			"TRY", "CATCH", "THROW", "FINALLY", "THROWS", "DECIMAL_LITERAL", "HEX_LITERAL", 
			"OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"BITAND", "BITOR", "CARET", "LSHIFT", "RSHIFT", "URSHIFT", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "CodeFlow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FunctionDeclareContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CodeFlowParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(CodeFlowParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public FunctionDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclareContext functionDeclare() throws RecognitionException {
		FunctionDeclareContext _localctx = new FunctionDeclareContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functionDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(FUNCTION);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			formalParams();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(91);
				match(LBRACK);
				setState(92);
				match(RBRACK);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(COLON);
			setState(99);
			typeTypeOrVoid();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(100);
				match(THROWS);
				setState(101);
				qualifiedNameList();
				}
			}

			setState(104);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionBody);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(SEMI);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			qualifiedName();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				qualifiedName();
				}
				}
				setState(117);
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

	public static class FormalParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LPAREN);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << FINAL) | (1L << FUNCTION))) != 0) || _la==IDENTIFIER) {
				{
				setState(119);
				formalParamList();
				}
			}

			setState(122);
			match(RPAREN);
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

	public static class FormalParamListContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public LastFormalParamContext lastFormalParam() {
			return getRuleContext(LastFormalParamContext.class,0);
		}
		public FormalParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamListContext formalParamList() throws RecognitionException {
		FormalParamListContext _localctx = new FormalParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParamList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			formalParam();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					formalParam();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(132);
				match(COMMA);
				setState(133);
				lastFormalParam();
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

	public static class FormalParamContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(136);
				variableModifier();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			typeType();
			setState(143);
			variableDeclaratorId();
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

	public static class LastFormalParamContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(CodeFlowParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterLastFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitLastFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitLastFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParamContext lastFormalParam() throws RecognitionException {
		LastFormalParamContext _localctx = new LastFormalParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lastFormalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL) {
				{
				{
				setState(145);
				variableModifier();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			typeType();
			setState(152);
			match(ELLIPSIS);
			setState(153);
			variableDeclaratorId();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(CodeFlowParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FINAL);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(158);
				match(DOT);
				setState(159);
				match(IDENTIFIER);
				}
				}
				setState(164);
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

	public static class FieldDeclareContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public FieldDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFieldDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFieldDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFieldDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclareContext fieldDeclare() throws RecognitionException {
		FieldDeclareContext _localctx = new FieldDeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			variableDeclarators();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(166);
				match(SEMI);
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

	public static class ConstructorDeclareContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(CodeFlowParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterConstructorDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitConstructorDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitConstructorDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclareContext constructorDeclare() throws RecognitionException {
		ConstructorDeclareContext _localctx = new ConstructorDeclareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructorDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IDENTIFIER);
			setState(170);
			formalParams();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(171);
				match(THROWS);
				setState(172);
				qualifiedNameList();
				}
			}

			setState(175);
			((ConstructorDeclareContext)_localctx).constructorBody = block();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			typeType();
			setState(178);
			variableDeclarator();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				variableDeclarator();
				}
				}
				setState(185);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			variableDeclaratorId();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(187);
				match(ASSIGN);
				setState(188);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENTIFIER);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(192);
				match(LBRACK);
				setState(193);
				match(RBRACK);
				}
				}
				setState(198);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				arrayInitializer();
				}
				break;
			case THIS:
			case SUPER:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(LBRACE);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(204);
				variableInitializer();
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						match(COMMA);
						setState(206);
						variableInitializer();
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(212);
					match(COMMA);
					}
				}

				}
			}

			setState(217);
			match(RBRACE);
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

	public static class ToplevelStatementContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ToplevelStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toplevelStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterToplevelStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitToplevelStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitToplevelStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToplevelStatementContext toplevelStatement() throws RecognitionException {
		ToplevelStatementContext _localctx = new ToplevelStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_toplevelStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			blockStatements();
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
		public TerminalNode LBRACE() { return getToken(CodeFlowParser.LBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CodeFlowParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LBRACE);
			setState(222);
			blockStatements();
			setState(223);
			match(RBRACE);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << BREAK) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(225);
				blockStatement();
				}
				}
				setState(230);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclareContext functionDeclare() {
			return getRuleContext(FunctionDeclareContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockStatement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				variableDeclarators();
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(232);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				functionDeclare();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CodeFlowParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CodeFlowParser.SEMI, 0); }
		public TerminalNode BREAK() { return getToken(CodeFlowParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				ifBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				forBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(RETURN);
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(245);
					expression(0);
					}
					break;
				}
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(248);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(BREAK);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(252);
					match(IDENTIFIER);
					}
					break;
				}
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(255);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(260);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(264);
				match(COLON);
				setState(265);
				statement();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CodeFlowParser.IF, 0); }
		public ParBooleanExpressionContext parBooleanExpression() {
			return getRuleContext(ParBooleanExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CodeFlowParser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IF);
			setState(269);
			parBooleanExpression();
			setState(270);
			statement();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(271);
				match(ELSE);
				setState(272);
				statement();
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

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CodeFlowParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FOR);
			setState(276);
			match(LPAREN);
			setState(277);
			forExpression();
			setState(278);
			match(RPAREN);
			setState(279);
			statement();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CodeFlowParser.WHILE, 0); }
		public ParBooleanExpressionContext parBooleanExpression() {
			return getRuleContext(ParBooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(WHILE);
			setState(282);
			parBooleanExpression();
			setState(283);
			statement();
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

	public static class DoWhileBlockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CodeFlowParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CodeFlowParser.WHILE, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitDoWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DO);
			setState(286);
			statement();
			setState(287);
			match(WHILE);
			setState(288);
			parExpression();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext forCondition;
		public ExpressionListContext forUpdate;
		public EnhancedForExpressionContext enhancedForExpression() {
			return getRuleContext(EnhancedForExpressionContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(CodeFlowParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CodeFlowParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forExpression);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				enhancedForExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << THIS) | (1L << SUPER) | (1L << FUNCTION) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(291);
					forInit();
					}
				}

				setState(294);
				match(SEMI);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(295);
					((ForExpressionContext)_localctx).forCondition = booleanExpression();
					}
				}

				setState(298);
				match(SEMI);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(299);
					((ForExpressionContext)_localctx).forUpdate = expressionList();
					}
				}

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

	public static class EnhancedForExpressionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterEnhancedForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitEnhancedForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitEnhancedForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForExpressionContext enhancedForExpression() throws RecognitionException {
		EnhancedForExpressionContext _localctx = new EnhancedForExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enhancedForExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			typeType();
			setState(305);
			variableDeclaratorId();
			setState(306);
			match(COLON);
			setState(307);
			expression(0);
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

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forInit);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(LPAREN);
			setState(314);
			expression(0);
			setState(315);
			match(RPAREN);
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

	public static class ParBooleanExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ParBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterParBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitParBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitParBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParBooleanExpressionContext parBooleanExpression() throws RecognitionException {
		ParBooleanExpressionContext _localctx = new ParBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LPAREN);
			setState(318);
			booleanExpression();
			setState(319);
			match(RPAREN);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public Token bop;
		public TerminalNode BOOL_LITERAL() { return getToken(CodeFlowParser.BOOL_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CodeFlowParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CodeFlowParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CodeFlowParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CodeFlowParser.GT, i);
		}
		public TerminalNode LE() { return getToken(CodeFlowParser.LE, 0); }
		public TerminalNode GE() { return getToken(CodeFlowParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(CodeFlowParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CodeFlowParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(CodeFlowParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeFlowParser.OR, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_booleanExpression);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(BOOL_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				expression(0);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(324);
					match(LT);
					setState(325);
					match(LT);
					}
					break;
				case 2:
					{
					setState(326);
					match(GT);
					setState(327);
					match(GT);
					setState(328);
					match(GT);
					}
					break;
				case 3:
					{
					setState(329);
					match(GT);
					setState(330);
					match(GT);
					}
					break;
				}
				setState(333);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				expression(0);
				setState(336);
				((BooleanExpressionContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GT - 65)) | (1L << (LT - 65)) | (1L << (LE - 65)) | (1L << (GE - 65)))) != 0)) ) {
					((BooleanExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				expression(0);
				setState(340);
				((BooleanExpressionContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
					((BooleanExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(343);
				expression(0);
				setState(344);
				((BooleanExpressionContext)_localctx).bop = match(AND);
				setState(345);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				expression(0);
				setState(348);
				((BooleanExpressionContext)_localctx).bop = match(OR);
				setState(349);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public TerminalNode ADD() { return getToken(CodeFlowParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CodeFlowParser.SUB, 0); }
		public TerminalNode INC() { return getToken(CodeFlowParser.INC, 0); }
		public TerminalNode DEC() { return getToken(CodeFlowParser.DEC, 0); }
		public TerminalNode BANG() { return getToken(CodeFlowParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CodeFlowParser.TILDE, 0); }
		public TerminalNode MUL() { return getToken(CodeFlowParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CodeFlowParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CodeFlowParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(CodeFlowParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CodeFlowParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CodeFlowParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CodeFlowParser.GT, i);
		}
		public TerminalNode LE() { return getToken(CodeFlowParser.LE, 0); }
		public TerminalNode GE() { return getToken(CodeFlowParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(CodeFlowParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(CodeFlowParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(CodeFlowParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(CodeFlowParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(CodeFlowParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(CodeFlowParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeFlowParser.OR, 0); }
		public TerminalNode COLON() { return getToken(CodeFlowParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(CodeFlowParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeFlowParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(CodeFlowParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(CodeFlowParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(CodeFlowParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(CodeFlowParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(CodeFlowParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(CodeFlowParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(CodeFlowParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(CodeFlowParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(CodeFlowParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(CodeFlowParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(CodeFlowParser.MOD_ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(CodeFlowParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CodeFlowParser.RBRACK, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(354);
				primary();
				}
				break;
			case 2:
				{
				setState(355);
				functionCall();
				}
				break;
			case 3:
				{
				setState(356);
				match(LPAREN);
				setState(357);
				expression(0);
				setState(358);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(360);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (INC - 77)) | (1L << (DEC - 77)) | (1L << (ADD - 77)) | (1L << (SUB - 77)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(361);
				expression(14);
				}
				break;
			case 5:
				{
				setState(362);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(363);
				expression(13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(367);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (MUL - 81)) | (1L << (DIV - 81)) | (1L << (MOD - 81)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(370);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(380);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(373);
							match(LT);
							setState(374);
							match(LT);
							}
							break;
						case 2:
							{
							setState(375);
							match(GT);
							setState(376);
							match(GT);
							setState(377);
							match(GT);
							}
							break;
						case 3:
							{
							setState(378);
							match(GT);
							setState(379);
							match(GT);
							}
							break;
						}
						setState(382);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(384);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (GT - 65)) | (1L << (LT - 65)) | (1L << (LE - 65)) | (1L << (GE - 65)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(385);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(387);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(388);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(390);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(391);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(393);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(394);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(396);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(397);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(399);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(400);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(402);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(403);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(405);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(406);
						expression(0);
						setState(407);
						match(COLON);
						setState(408);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(410);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(411);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (ASSIGN - 90)) | (1L << (ADD_ASSIGN - 90)) | (1L << (SUB_ASSIGN - 90)) | (1L << (MUL_ASSIGN - 90)) | (1L << (DIV_ASSIGN - 90)) | (1L << (AND_ASSIGN - 90)) | (1L << (OR_ASSIGN - 90)) | (1L << (XOR_ASSIGN - 90)) | (1L << (MOD_ASSIGN - 90)) | (1L << (LSHIFT_ASSIGN - 90)) | (1L << (RSHIFT_ASSIGN - 90)) | (1L << (URSHIFT_ASSIGN - 90)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(412);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(413);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(414);
						match(LBRACK);
						setState(415);
						expression(0);
						setState(416);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(419);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
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
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(CodeFlowParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(CodeFlowParser.SUPER, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionCall);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(IDENTIFIER);
				setState(426);
				match(LPAREN);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(427);
					expressionList();
					}
				}

				setState(430);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(THIS);
				setState(432);
				match(LPAREN);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(433);
					expressionList();
					}
				}

				setState(436);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(SUPER);
				setState(438);
				match(LPAREN);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << SUPER) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					setState(439);
					expressionList();
					}
				}

				setState(442);
				match(RPAREN);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			expression(0);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				match(COMMA);
				setState(447);
				expression(0);
				}
				}
				setState(452);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeFlowParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeFlowParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			typeType();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(454);
				match(COMMA);
				setState(455);
				typeType();
				}
				}
				setState(460);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CodeFlowParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CodeFlowParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CodeFlowParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeFlowParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(461);
				classOrInterfaceType();
				}
				break;
			case FUNCTION:
				{
				setState(462);
				functionType();
				}
				break;
			case STRING:
			case INT:
			case SHORT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case LONG:
			case BOOLEAN:
			case BYTE:
				{
				setState(463);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(466);
				match(LBRACK);
				setState(467);
				match(RBRACK);
				}
				}
				setState(472);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeFlowParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeFlowParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CodeFlowParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CodeFlowParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(IDENTIFIER);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(474);
				match(DOT);
				setState(475);
				match(IDENTIFIER);
				}
				}
				setState(480);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CodeFlowParser.FUNCTION, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CodeFlowParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeFlowParser.RPAREN, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(FUNCTION);
			setState(482);
			typeTypeOrVoid();
			setState(483);
			match(LPAREN);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE) | (1L << FUNCTION))) != 0) || _la==IDENTIFIER) {
				{
				setState(484);
				typeList();
				}
			}

			setState(487);
			match(RPAREN);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CodeFlowParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitTypeTypeOrVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitTypeTypeOrVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeTypeOrVoid);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case SHORT:
			case DOUBLE:
			case FLOAT:
			case CHAR:
			case LONG:
			case BOOLEAN:
			case BYTE:
			case FUNCTION:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(VOID);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CodeFlowParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(CodeFlowParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(CodeFlowParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CodeFlowParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(CodeFlowParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CodeFlowParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(CodeFlowParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CodeFlowParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(CodeFlowParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << SHORT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << LONG) | (1L << BOOLEAN) | (1L << BYTE))) != 0)) ) {
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

	public static class PrimaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CodeFlowParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primary);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(IDENTIFIER);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(CodeFlowParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CodeFlowParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(CodeFlowParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(CodeFlowParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(CodeFlowParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CodeFlowParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(CodeFlowParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CodeFlowParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(CodeFlowParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(CodeFlowParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CodeFlowListener ) ((CodeFlowListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CodeFlowVisitor ) return ((CodeFlowVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u0202\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\3\2"+
		"\5\2i\n\2\3\2\3\2\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13\4"+
		"\3\5\3\5\5\5{\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u0082\n\6\f\6\16\6\u0085\13"+
		"\6\3\6\3\6\5\6\u0089\n\6\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\7\3\7"+
		"\3\7\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\5\13\u00aa\n\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r"+
		"\16\r\u00bb\13\r\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\7\17\u00c5"+
		"\n\17\f\17\16\17\u00c8\13\17\3\20\3\20\5\20\u00cc\n\20\3\21\3\21\3\21"+
		"\3\21\7\21\u00d2\n\21\f\21\16\21\u00d5\13\21\3\21\5\21\u00d8\n\21\5\21"+
		"\u00da\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\7\24\u00e5\n"+
		"\24\f\24\16\24\u00e8\13\24\3\25\3\25\5\25\u00ec\n\25\3\25\3\25\5\25\u00f0"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f9\n\26\3\26\5\26\u00fc"+
		"\n\26\3\26\3\26\5\26\u0100\n\26\3\26\5\26\u0103\n\26\3\26\3\26\3\26\5"+
		"\26\u0108\n\26\3\26\3\26\3\26\5\26\u010d\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0114\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0127\n\33\3\33\3\33\5\33\u012b\n"+
		"\33\3\33\3\33\5\33\u012f\n\33\5\33\u0131\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\5\35\u013a\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u014e\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0162\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\5!\u016f\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017f\n!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01a7\n!\f!\16!\u01aa\13"+
		"!\3\"\3\"\3\"\5\"\u01af\n\"\3\"\3\"\3\"\3\"\5\"\u01b5\n\"\3\"\3\"\3\""+
		"\3\"\5\"\u01bb\n\"\3\"\5\"\u01be\n\"\3#\3#\3#\7#\u01c3\n#\f#\16#\u01c6"+
		"\13#\3$\3$\3$\7$\u01cb\n$\f$\16$\u01ce\13$\3%\3%\3%\5%\u01d3\n%\3%\3%"+
		"\7%\u01d7\n%\f%\16%\u01da\13%\3&\3&\3&\7&\u01df\n&\f&\16&\u01e2\13&\3"+
		"\'\3\'\3\'\3\'\5\'\u01e8\n\'\3\'\3\'\3(\3(\5(\u01ee\n(\3)\3)\3*\3*\5*"+
		"\u01f4\n*\3+\3+\3+\3+\3+\3+\5+\u01fc\n+\3,\3,\3-\3-\3-\2\3@.\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2"+
		"\r\4\2CDJK\4\2IILL\3\2OR\3\2EF\3\2SU\3\2QR\3\2\\g\3\2OP\3\2\4\f\3\2\60"+
		"\63\3\2\64\65\2\u022f\2Z\3\2\2\2\4n\3\2\2\2\6p\3\2\2\2\bx\3\2\2\2\n~\3"+
		"\2\2\2\f\u008d\3\2\2\2\16\u0096\3\2\2\2\20\u009d\3\2\2\2\22\u009f\3\2"+
		"\2\2\24\u00a7\3\2\2\2\26\u00ab\3\2\2\2\30\u00b3\3\2\2\2\32\u00bc\3\2\2"+
		"\2\34\u00c1\3\2\2\2\36\u00cb\3\2\2\2 \u00cd\3\2\2\2\"\u00dd\3\2\2\2$\u00df"+
		"\3\2\2\2&\u00e6\3\2\2\2(\u00ef\3\2\2\2*\u010c\3\2\2\2,\u010e\3\2\2\2."+
		"\u0115\3\2\2\2\60\u011b\3\2\2\2\62\u011f\3\2\2\2\64\u0130\3\2\2\2\66\u0132"+
		"\3\2\2\28\u0139\3\2\2\2:\u013b\3\2\2\2<\u013f\3\2\2\2>\u0161\3\2\2\2@"+
		"\u016e\3\2\2\2B\u01bd\3\2\2\2D\u01bf\3\2\2\2F\u01c7\3\2\2\2H\u01d2\3\2"+
		"\2\2J\u01db\3\2\2\2L\u01e3\3\2\2\2N\u01ed\3\2\2\2P\u01ef\3\2\2\2R\u01f3"+
		"\3\2\2\2T\u01fb\3\2\2\2V\u01fd\3\2\2\2X\u01ff\3\2\2\2Z[\7\36\2\2[\\\7"+
		"o\2\2\\a\5\b\5\2]^\7>\2\2^`\7?\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bd\3\2\2\2ca\3\2\2\2de\7H\2\2eh\5N(\2fg\7/\2\2gi\5\6\4\2hf\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\5\4\3\2k\3\3\2\2\2lo\5$\23\2mo\7@\2\2nl\3\2\2\2"+
		"nm\3\2\2\2o\5\3\2\2\2pu\5\22\n\2qr\7A\2\2rt\5\22\n\2sq\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\7\3\2\2\2wu\3\2\2\2xz\7:\2\2y{\5\n\6\2zy\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|}\7;\2\2}\t\3\2\2\2~\u0083\5\f\7\2\177\u0080\7"+
		"A\2\2\u0080\u0082\5\f\7\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7A\2\2\u0087\u0089\5\16\b\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u008c\5\20\t\2\u008b\u008a\3\2\2"+
		"\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5H%\2\u0091\u0092\5\34\17\2\u0092"+
		"\r\3\2\2\2\u0093\u0095\5\20\t\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2"+
		"\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009a\5H%\2\u009a\u009b\7k\2\2\u009b\u009c\5\34\17\2\u009c"+
		"\17\3\2\2\2\u009d\u009e\7\r\2\2\u009e\21\3\2\2\2\u009f\u00a4\7o\2\2\u00a0"+
		"\u00a1\7B\2\2\u00a1\u00a3\7o\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00aa\7@\2\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00af\5\b\5\2"+
		"\u00ad\u00ae\7/\2\2\u00ae\u00b0\5\6\4\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5$\23\2\u00b2\27\3\2\2\2\u00b3"+
		"\u00b4\5H%\2\u00b4\u00b9\5\32\16\2\u00b5\u00b6\7A\2\2\u00b6\u00b8\5\32"+
		"\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\5\34\17"+
		"\2\u00bd\u00be\7\\\2\2\u00be\u00c0\5\36\20\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c6\7o\2\2\u00c2\u00c3\7>\2\2"+
		"\u00c3\u00c5\7?\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\35\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\5 \21\2\u00ca\u00cc\5@!\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\37\3\2\2\2\u00cd\u00d9\7<\2\2\u00ce\u00d3\5\36\20\2\u00cf\u00d0"+
		"\7A\2\2\u00d0\u00d2\5\36\20\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d8\7A\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\7=\2\2\u00dc!\3\2\2\2\u00dd\u00de\5&\24\2\u00de#\3\2"+
		"\2\2\u00df\u00e0\7<\2\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\7=\2\2\u00e2%"+
		"\3\2\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\'\3\2\2\2\u00e8\u00e6\3\2\2\2"+
		"\u00e9\u00eb\5\30\r\2\u00ea\u00ec\7@\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00f0\5*\26\2\u00ee\u00f0\5\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0)\3\2\2\2"+
		"\u00f1\u010d\5$\23\2\u00f2\u010d\5,\27\2\u00f3\u010d\5.\30\2\u00f4\u010d"+
		"\5\60\31\2\u00f5\u010d\5\62\32\2\u00f6\u00f8\7(\2\2\u00f7\u00f9\5@!\2"+
		"\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc"+
		"\7@\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u010d\3\2\2\2\u00fd"+
		"\u00ff\7\37\2\2\u00fe\u0100\7o\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u0103\7@\2\2\u0102\u0101\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u010d\3\2\2\2\u0104\u010d\7@\2\2\u0105\u0107\5@!"+
		"\2\u0106\u0108\7@\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010d"+
		"\3\2\2\2\u0109\u010a\7o\2\2\u010a\u010b\7H\2\2\u010b\u010d\5*\26\2\u010c"+
		"\u00f1\3\2\2\2\u010c\u00f2\3\2\2\2\u010c\u00f3\3\2\2\2\u010c\u00f4\3\2"+
		"\2\2\u010c\u00f5\3\2\2\2\u010c\u00f6\3\2\2\2\u010c\u00fd\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0109\3\2\2\2\u010d+\3\2\2\2"+
		"\u010e\u010f\7&\2\2\u010f\u0110\5<\37\2\u0110\u0113\5*\26\2\u0111\u0112"+
		"\7$\2\2\u0112\u0114\5*\26\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"-\3\2\2\2\u0115\u0116\7%\2\2\u0116\u0117\7:\2\2\u0117\u0118\5\64\33\2"+
		"\u0118\u0119\7;\2\2\u0119\u011a\5*\26\2\u011a/\3\2\2\2\u011b\u011c\7*"+
		"\2\2\u011c\u011d\5<\37\2\u011d\u011e\5*\26\2\u011e\61\3\2\2\2\u011f\u0120"+
		"\7#\2\2\u0120\u0121\5*\26\2\u0121\u0122\7*\2\2\u0122\u0123\5:\36\2\u0123"+
		"\63\3\2\2\2\u0124\u0131\5\66\34\2\u0125\u0127\58\35\2\u0126\u0125\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7@\2\2\u0129"+
		"\u012b\5> \2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012e\7@\2\2\u012d\u012f\5D#\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u0126\3\2\2\2\u0131"+
		"\65\3\2\2\2\u0132\u0133\5H%\2\u0133\u0134\5\34\17\2\u0134\u0135\7H\2\2"+
		"\u0135\u0136\5@!\2\u0136\67\3\2\2\2\u0137\u013a\5\30\r\2\u0138\u013a\5"+
		"D#\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a9\3\2\2\2\u013b\u013c"+
		"\7:\2\2\u013c\u013d\5@!\2\u013d\u013e\7;\2\2\u013e;\3\2\2\2\u013f\u0140"+
		"\7:\2\2\u0140\u0141\5> \2\u0141\u0142\7;\2\2\u0142=\3\2\2\2\u0143\u0162"+
		"\7\66\2\2\u0144\u0162\7o\2\2\u0145\u014d\5@!\2\u0146\u0147\7D\2\2\u0147"+
		"\u014e\7D\2\2\u0148\u0149\7C\2\2\u0149\u014a\7C\2\2\u014a\u014e\7C\2\2"+
		"\u014b\u014c\7C\2\2\u014c\u014e\7C\2\2\u014d\u0146\3\2\2\2\u014d\u0148"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\5@!\2\u0150"+
		"\u0162\3\2\2\2\u0151\u0152\5@!\2\u0152\u0153\t\2\2\2\u0153\u0154\5@!\2"+
		"\u0154\u0162\3\2\2\2\u0155\u0156\5@!\2\u0156\u0157\t\3\2\2\u0157\u0158"+
		"\5@!\2\u0158\u0162\3\2\2\2\u0159\u015a\5@!\2\u015a\u015b\7M\2\2\u015b"+
		"\u015c\5@!\2\u015c\u0162\3\2\2\2\u015d\u015e\5@!\2\u015e\u015f\7N\2\2"+
		"\u015f\u0160\5@!\2\u0160\u0162\3\2\2\2\u0161\u0143\3\2\2\2\u0161\u0144"+
		"\3\2\2\2\u0161\u0145\3\2\2\2\u0161\u0151\3\2\2\2\u0161\u0155\3\2\2\2\u0161"+
		"\u0159\3\2\2\2\u0161\u015d\3\2\2\2\u0162?\3\2\2\2\u0163\u0164\b!\1\2\u0164"+
		"\u016f\5R*\2\u0165\u016f\5B\"\2\u0166\u0167\7:\2\2\u0167\u0168\5@!\2\u0168"+
		"\u0169\7;\2\2\u0169\u016f\3\2\2\2\u016a\u016b\t\4\2\2\u016b\u016f\5@!"+
		"\20\u016c\u016d\t\5\2\2\u016d\u016f\5@!\17\u016e\u0163\3\2\2\2\u016e\u0165"+
		"\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u01a8\3\2\2\2\u0170\u0171\f\16\2\2\u0171\u0172\t\6\2\2\u0172\u01a7\5"+
		"@!\17\u0173\u0174\f\r\2\2\u0174\u0175\t\7\2\2\u0175\u01a7\5@!\16\u0176"+
		"\u017e\f\f\2\2\u0177\u0178\7D\2\2\u0178\u017f\7D\2\2\u0179\u017a\7C\2"+
		"\2\u017a\u017b\7C\2\2\u017b\u017f\7C\2\2\u017c\u017d\7C\2\2\u017d\u017f"+
		"\7C\2\2\u017e\u0177\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u01a7\5@!\r\u0181\u0182\f\13\2\2\u0182\u0183\t\2"+
		"\2\2\u0183\u01a7\5@!\f\u0184\u0185\f\n\2\2\u0185\u0186\t\3\2\2\u0186\u01a7"+
		"\5@!\13\u0187\u0188\f\t\2\2\u0188\u0189\7V\2\2\u0189\u01a7\5@!\n\u018a"+
		"\u018b\f\b\2\2\u018b\u018c\7X\2\2\u018c\u01a7\5@!\t\u018d\u018e\f\7\2"+
		"\2\u018e\u018f\7W\2\2\u018f\u01a7\5@!\b\u0190\u0191\f\6\2\2\u0191\u0192"+
		"\7M\2\2\u0192\u01a7\5@!\7\u0193\u0194\f\5\2\2\u0194\u0195\7N\2\2\u0195"+
		"\u01a7\5@!\6\u0196\u0197\f\4\2\2\u0197\u0198\7G\2\2\u0198\u0199\5@!\2"+
		"\u0199\u019a\7H\2\2\u019a\u019b\5@!\5\u019b\u01a7\3\2\2\2\u019c\u019d"+
		"\f\3\2\2\u019d\u019e\t\b\2\2\u019e\u01a7\5@!\3\u019f\u01a0\f\24\2\2\u01a0"+
		"\u01a1\7>\2\2\u01a1\u01a2\5@!\2\u01a2\u01a3\7?\2\2\u01a3\u01a7\3\2\2\2"+
		"\u01a4\u01a5\f\21\2\2\u01a5\u01a7\t\t\2\2\u01a6\u0170\3\2\2\2\u01a6\u0173"+
		"\3\2\2\2\u01a6\u0176\3\2\2\2\u01a6\u0181\3\2\2\2\u01a6\u0184\3\2\2\2\u01a6"+
		"\u0187\3\2\2\2\u01a6\u018a\3\2\2\2\u01a6\u018d\3\2\2\2\u01a6\u0190\3\2"+
		"\2\2\u01a6\u0193\3\2\2\2\u01a6\u0196\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6"+
		"\u019f\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9A\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac"+
		"\7o\2\2\u01ac\u01ae\7:\2\2\u01ad\u01af\5D#\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01be\7;\2\2\u01b1\u01b2\7\33"+
		"\2\2\u01b2\u01b4\7:\2\2\u01b3\u01b5\5D#\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01be\7;\2\2\u01b7\u01b8\7\34\2\2\u01b8"+
		"\u01ba\7:\2\2\u01b9\u01bb\5D#\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\7;\2\2\u01bd\u01ab\3\2\2\2\u01bd\u01b1"+
		"\3\2\2\2\u01bd\u01b7\3\2\2\2\u01beC\3\2\2\2\u01bf\u01c4\5@!\2\u01c0\u01c1"+
		"\7A\2\2\u01c1\u01c3\5@!\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5E\3\2\2\2\u01c6\u01c4\3\2\2\2"+
		"\u01c7\u01cc\5H%\2\u01c8\u01c9\7A\2\2\u01c9\u01cb\5H%\2\u01ca\u01c8\3"+
		"\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"G\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d3\5J&\2\u01d0\u01d3\5L\'\2\u01d1"+
		"\u01d3\5P)\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d3\u01d8\3\2\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d7\7?\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"I\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01e0\7o\2\2\u01dc\u01dd\7B\2\2\u01dd"+
		"\u01df\7o\2\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1K\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4"+
		"\7\36\2\2\u01e4\u01e5\5N(\2\u01e5\u01e7\7:\2\2\u01e6\u01e8\5F$\2\u01e7"+
		"\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7;"+
		"\2\2\u01eaM\3\2\2\2\u01eb\u01ee\5H%\2\u01ec\u01ee\7\3\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeO\3\2\2\2\u01ef\u01f0\t\n\2\2\u01f0"+
		"Q\3\2\2\2\u01f1\u01f4\5T+\2\u01f2\u01f4\7o\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4S\3\2\2\2\u01f5\u01fc\5V,\2\u01f6\u01fc\5X-\2\u01f7"+
		"\u01fc\7\67\2\2\u01f8\u01fc\78\2\2\u01f9\u01fc\7\66\2\2\u01fa\u01fc\7"+
		"9\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01f7\3\2\2\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcU\3\2\2\2"+
		"\u01fd\u01fe\t\13\2\2\u01feW\3\2\2\2\u01ff\u0200\t\f\2\2\u0200Y\3\2\2"+
		"\2\67ahnuz\u0083\u0088\u008d\u0096\u00a4\u00a9\u00af\u00b9\u00bf\u00c6"+
		"\u00cb\u00d3\u00d7\u00d9\u00e6\u00eb\u00ef\u00f8\u00fb\u00ff\u0102\u0107"+
		"\u010c\u0113\u0126\u012a\u012e\u0130\u0139\u014d\u0161\u016e\u017e\u01a6"+
		"\u01a8\u01ae\u01b4\u01ba\u01bd\u01c4\u01cc\u01d2\u01d8\u01e0\u01e7\u01ed"+
		"\u01f3\u01fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}