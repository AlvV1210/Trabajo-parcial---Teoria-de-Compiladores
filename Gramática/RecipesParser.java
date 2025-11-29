// Generated from Recipes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RecipesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, AMOUNT=13, STRING=14, INT=15, FLOAT=16, WS=17;
	public static final int
		RULE_program = 0, RULE_recipeStmt = 1, RULE_statement = 2, RULE_ingredientStmt = 3, 
		RULE_stepStmt = 4, RULE_totalCaloriesStmt = 5, RULE_stepParams = 6, RULE_stepModifiers = 7, 
		RULE_parallel = 8, RULE_dependsOn = 9, RULE_totalCostStmt = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "recipeStmt", "statement", "ingredientStmt", "stepStmt", "totalCaloriesStmt", 
			"stepParams", "stepModifiers", "parallel", "dependsOn", "totalCostStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'recipe'", "';'", "'ingredient'", "'costPerUnit'", "'calories'", 
			"'step'", "'time'", "'totalCalories'", "'parallel'", "'dependsOn'", "'totalCost'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "AMOUNT", "STRING", "INT", "FLOAT", "WS"
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
	public String getGrammarFileName() { return "Recipes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RecipesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public RecipeStmtContext recipeStmt() {
			return getRuleContext(RecipeStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RecipesParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			recipeStmt();
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				statement();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__10))) != 0) );
			setState(28);
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

	public static class RecipeStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RecipesParser.STRING, 0); }
		public RecipeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitRecipeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeStmtContext recipeStmt() throws RecognitionException {
		RecipeStmtContext _localctx = new RecipeStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_recipeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(STRING);
			setState(32);
			match(T__1);
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
		public IngredientStmtContext ingredientStmt() {
			return getRuleContext(IngredientStmtContext.class,0);
		}
		public StepStmtContext stepStmt() {
			return getRuleContext(StepStmtContext.class,0);
		}
		public TotalCostStmtContext totalCostStmt() {
			return getRuleContext(TotalCostStmtContext.class,0);
		}
		public TotalCaloriesStmtContext totalCaloriesStmt() {
			return getRuleContext(TotalCaloriesStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				ingredientStmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				stepStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				totalCostStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				totalCaloriesStmt();
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

	public static class IngredientStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RecipesParser.ID, 0); }
		public TerminalNode AMOUNT() { return getToken(RecipesParser.AMOUNT, 0); }
		public TerminalNode FLOAT() { return getToken(RecipesParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(RecipesParser.INT, 0); }
		public IngredientStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitIngredientStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientStmtContext ingredientStmt() throws RecognitionException {
		IngredientStmtContext _localctx = new IngredientStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ingredientStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__2);
			setState(41);
			match(ID);
			setState(42);
			match(AMOUNT);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(43);
				match(T__3);
				setState(44);
				match(FLOAT);
				}
			}

			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(47);
				match(T__4);
				setState(48);
				match(INT);
				}
			}

			setState(51);
			match(T__1);
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

	public static class StepStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RecipesParser.ID, 0); }
		public StepParamsContext stepParams() {
			return getRuleContext(StepParamsContext.class,0);
		}
		public List<StepModifiersContext> stepModifiers() {
			return getRuleContexts(StepModifiersContext.class);
		}
		public StepModifiersContext stepModifiers(int i) {
			return getRuleContext(StepModifiersContext.class,i);
		}
		public List<TerminalNode> AMOUNT() { return getTokens(RecipesParser.AMOUNT); }
		public TerminalNode AMOUNT(int i) {
			return getToken(RecipesParser.AMOUNT, i);
		}
		public StepStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitStepStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepStmtContext stepStmt() throws RecognitionException {
		StepStmtContext _localctx = new StepStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stepStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__5);
			setState(54);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << AMOUNT) | (1L << FLOAT))) != 0)) {
				{
				setState(55);
				stepParams();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
					{
					setState(58);
					stepModifiers();
					}
					break;
				case T__6:
					{
					setState(59);
					match(T__6);
					setState(60);
					match(AMOUNT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__1);
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

	public static class TotalCaloriesStmtContext extends ParserRuleContext {
		public TotalCaloriesStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalCaloriesStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitTotalCaloriesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalCaloriesStmtContext totalCaloriesStmt() throws RecognitionException {
		TotalCaloriesStmtContext _localctx = new TotalCaloriesStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_totalCaloriesStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__7);
			setState(69);
			match(T__1);
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

	public static class StepParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RecipesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RecipesParser.ID, i);
		}
		public List<TerminalNode> AMOUNT() { return getTokens(RecipesParser.AMOUNT); }
		public TerminalNode AMOUNT(int i) {
			return getToken(RecipesParser.AMOUNT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(RecipesParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(RecipesParser.FLOAT, i);
		}
		public StepParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepParams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitStepParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepParamsContext stepParams() throws RecognitionException {
		StepParamsContext _localctx = new StepParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stepParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << AMOUNT) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << AMOUNT) | (1L << FLOAT))) != 0) );
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

	public static class StepModifiersContext extends ParserRuleContext {
		public List<ParallelContext> parallel() {
			return getRuleContexts(ParallelContext.class);
		}
		public ParallelContext parallel(int i) {
			return getRuleContext(ParallelContext.class,i);
		}
		public List<DependsOnContext> dependsOn() {
			return getRuleContexts(DependsOnContext.class);
		}
		public DependsOnContext dependsOn(int i) {
			return getRuleContext(DependsOnContext.class,i);
		}
		public StepModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitStepModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepModifiersContext stepModifiers() throws RecognitionException {
		StepModifiersContext _localctx = new StepModifiersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stepModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(78);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(76);
						parallel();
						}
						break;
					case T__9:
						{
						setState(77);
						dependsOn();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParallelContext extends ParserRuleContext {
		public ParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitParallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelContext parallel() throws RecognitionException {
		ParallelContext _localctx = new ParallelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parallel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__8);
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

	public static class DependsOnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RecipesParser.ID, 0); }
		public DependsOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependsOn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitDependsOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependsOnContext dependsOn() throws RecognitionException {
		DependsOnContext _localctx = new DependsOnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dependsOn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__9);
			setState(85);
			match(ID);
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

	public static class TotalCostStmtContext extends ParserRuleContext {
		public TotalCostStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalCostStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipesVisitor ) return ((RecipesVisitor<? extends T>)visitor).visitTotalCostStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalCostStmtContext totalCostStmt() throws RecognitionException {
		TotalCostStmtContext _localctx = new TotalCostStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_totalCostStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__10);
			setState(88);
			match(T__1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\5\5\64\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\5\6;\n\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\6\bK\n\b\r\b\16\bL\3\t\3\t\6\tQ\n\t\r\t\16\tR\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3"+
		"\4\2\16\17\22\22\2]\2\30\3\2\2\2\4 \3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\67"+
		"\3\2\2\2\fF\3\2\2\2\16J\3\2\2\2\20P\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26"+
		"Y\3\2\2\2\30\32\5\4\3\2\31\33\5\6\4\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 !\7\3"+
		"\2\2!\"\7\20\2\2\"#\7\4\2\2#\5\3\2\2\2$)\5\b\5\2%)\5\n\6\2&)\5\26\f\2"+
		"\')\5\f\7\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\7\5"+
		"\2\2+,\7\16\2\2,/\7\17\2\2-.\7\6\2\2.\60\7\22\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\63\3\2\2\2\61\62\7\7\2\2\62\64\7\21\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\3\2\2\2\65\66\7\4\2\2\66\t\3\2\2\2\678\7\b\2\28:\7\16\2\29"+
		";\5\16\b\2:9\3\2\2\2:;\3\2\2\2;A\3\2\2\2<@\5\20\t\2=>\7\t\2\2>@\7\17\2"+
		"\2?<\3\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2"+
		"\2DE\7\4\2\2E\13\3\2\2\2FG\7\n\2\2GH\7\4\2\2H\r\3\2\2\2IK\t\2\2\2JI\3"+
		"\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NQ\5\22\n\2OQ\5\24\13"+
		"\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TU\7\13"+
		"\2\2U\23\3\2\2\2VW\7\f\2\2WX\7\16\2\2X\25\3\2\2\2YZ\7\r\2\2Z[\7\4\2\2"+
		"[\27\3\2\2\2\f\34(/\63:?ALPR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}