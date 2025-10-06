# Generated from Recipes.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23")
        buf.write("]\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\6\2\33")
        buf.write("\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3")
        buf.write("\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\5\5")
        buf.write("\64\n\5\3\5\3\5\3\6\3\6\3\6\5\6;\n\6\3\6\3\6\3\6\7\6@")
        buf.write("\n\6\f\6\16\6C\13\6\3\6\3\6\3\7\3\7\3\7\3\b\6\bK\n\b\r")
        buf.write("\b\16\bL\3\t\3\t\6\tQ\n\t\r\t\16\tR\3\n\3\n\3\13\3\13")
        buf.write("\3\13\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26")
        buf.write("\2\3\4\2\16\17\22\22\2]\2\30\3\2\2\2\4 \3\2\2\2\6(\3\2")
        buf.write("\2\2\b*\3\2\2\2\n\67\3\2\2\2\fF\3\2\2\2\16J\3\2\2\2\20")
        buf.write("P\3\2\2\2\22T\3\2\2\2\24V\3\2\2\2\26Y\3\2\2\2\30\32\5")
        buf.write("\4\3\2\31\33\5\6\4\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32")
        buf.write("\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\2\2\3\37")
        buf.write("\3\3\2\2\2 !\7\3\2\2!\"\7\20\2\2\"#\7\4\2\2#\5\3\2\2\2")
        buf.write("$)\5\b\5\2%)\5\n\6\2&)\5\26\f\2\')\5\f\7\2($\3\2\2\2(")
        buf.write("%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*+\7\5\2\2+,")
        buf.write("\7\16\2\2,/\7\17\2\2-.\7\6\2\2.\60\7\22\2\2/-\3\2\2\2")
        buf.write("/\60\3\2\2\2\60\63\3\2\2\2\61\62\7\7\2\2\62\64\7\21\2")
        buf.write("\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\4")
        buf.write("\2\2\66\t\3\2\2\2\678\7\b\2\28:\7\16\2\29;\5\16\b\2:9")
        buf.write("\3\2\2\2:;\3\2\2\2;A\3\2\2\2<@\5\20\t\2=>\7\t\2\2>@\7")
        buf.write("\17\2\2?<\3\2\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2")
        buf.write("\2\2BD\3\2\2\2CA\3\2\2\2DE\7\4\2\2E\13\3\2\2\2FG\7\n\2")
        buf.write("\2GH\7\4\2\2H\r\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2")
        buf.write("LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2NQ\5\22\n\2OQ\5\24\13")
        buf.write("\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S")
        buf.write("\21\3\2\2\2TU\7\13\2\2U\23\3\2\2\2VW\7\f\2\2WX\7\16\2")
        buf.write("\2X\25\3\2\2\2YZ\7\r\2\2Z[\7\4\2\2[\27\3\2\2\2\f\34(/")
        buf.write("\63:?ALPR")
        return buf.getvalue()


class RecipesParser ( Parser ):

    grammarFileName = "Recipes.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'recipe'", "';'", "'ingredient'", "'costPerUnit'", 
                     "'calories'", "'step'", "'time'", "'totalCalories'", 
                     "'parallel'", "'dependsOn'", "'totalCost'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "ID", "AMOUNT", "STRING", "INT", "FLOAT", "WS" ]

    RULE_program = 0
    RULE_recipeStmt = 1
    RULE_statement = 2
    RULE_ingredientStmt = 3
    RULE_stepStmt = 4
    RULE_totalCaloriesStmt = 5
    RULE_stepParams = 6
    RULE_stepModifiers = 7
    RULE_parallel = 8
    RULE_dependsOn = 9
    RULE_totalCostStmt = 10

    ruleNames =  [ "program", "recipeStmt", "statement", "ingredientStmt", 
                   "stepStmt", "totalCaloriesStmt", "stepParams", "stepModifiers", 
                   "parallel", "dependsOn", "totalCostStmt" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    ID=12
    AMOUNT=13
    STRING=14
    INT=15
    FLOAT=16
    WS=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def recipeStmt(self):
            return self.getTypedRuleContext(RecipesParser.RecipeStmtContext,0)


        def EOF(self):
            return self.getToken(RecipesParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RecipesParser.StatementContext)
            else:
                return self.getTypedRuleContext(RecipesParser.StatementContext,i)


        def getRuleIndex(self):
            return RecipesParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = RecipesParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self.recipeStmt()
            self.state = 24 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 23
                self.statement()
                self.state = 26 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RecipesParser.T__2) | (1 << RecipesParser.T__5) | (1 << RecipesParser.T__7) | (1 << RecipesParser.T__10))) != 0)):
                    break

            self.state = 28
            self.match(RecipesParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RecipeStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(RecipesParser.STRING, 0)

        def getRuleIndex(self):
            return RecipesParser.RULE_recipeStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRecipeStmt" ):
                return visitor.visitRecipeStmt(self)
            else:
                return visitor.visitChildren(self)




    def recipeStmt(self):

        localctx = RecipesParser.RecipeStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_recipeStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 30
            self.match(RecipesParser.T__0)
            self.state = 31
            self.match(RecipesParser.STRING)
            self.state = 32
            self.match(RecipesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ingredientStmt(self):
            return self.getTypedRuleContext(RecipesParser.IngredientStmtContext,0)


        def stepStmt(self):
            return self.getTypedRuleContext(RecipesParser.StepStmtContext,0)


        def totalCostStmt(self):
            return self.getTypedRuleContext(RecipesParser.TotalCostStmtContext,0)


        def totalCaloriesStmt(self):
            return self.getTypedRuleContext(RecipesParser.TotalCaloriesStmtContext,0)


        def getRuleIndex(self):
            return RecipesParser.RULE_statement

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = RecipesParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 38
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [RecipesParser.T__2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 34
                self.ingredientStmt()
                pass
            elif token in [RecipesParser.T__5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 35
                self.stepStmt()
                pass
            elif token in [RecipesParser.T__10]:
                self.enterOuterAlt(localctx, 3)
                self.state = 36
                self.totalCostStmt()
                pass
            elif token in [RecipesParser.T__7]:
                self.enterOuterAlt(localctx, 4)
                self.state = 37
                self.totalCaloriesStmt()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IngredientStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(RecipesParser.ID, 0)

        def AMOUNT(self):
            return self.getToken(RecipesParser.AMOUNT, 0)

        def FLOAT(self):
            return self.getToken(RecipesParser.FLOAT, 0)

        def INT(self):
            return self.getToken(RecipesParser.INT, 0)

        def getRuleIndex(self):
            return RecipesParser.RULE_ingredientStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIngredientStmt" ):
                return visitor.visitIngredientStmt(self)
            else:
                return visitor.visitChildren(self)




    def ingredientStmt(self):

        localctx = RecipesParser.IngredientStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_ingredientStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(RecipesParser.T__2)
            self.state = 41
            self.match(RecipesParser.ID)
            self.state = 42
            self.match(RecipesParser.AMOUNT)
            self.state = 45
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RecipesParser.T__3:
                self.state = 43
                self.match(RecipesParser.T__3)
                self.state = 44
                self.match(RecipesParser.FLOAT)


            self.state = 49
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==RecipesParser.T__4:
                self.state = 47
                self.match(RecipesParser.T__4)
                self.state = 48
                self.match(RecipesParser.INT)


            self.state = 51
            self.match(RecipesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StepStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(RecipesParser.ID, 0)

        def stepParams(self):
            return self.getTypedRuleContext(RecipesParser.StepParamsContext,0)


        def stepModifiers(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RecipesParser.StepModifiersContext)
            else:
                return self.getTypedRuleContext(RecipesParser.StepModifiersContext,i)


        def AMOUNT(self, i:int=None):
            if i is None:
                return self.getTokens(RecipesParser.AMOUNT)
            else:
                return self.getToken(RecipesParser.AMOUNT, i)

        def getRuleIndex(self):
            return RecipesParser.RULE_stepStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStepStmt" ):
                return visitor.visitStepStmt(self)
            else:
                return visitor.visitChildren(self)




    def stepStmt(self):

        localctx = RecipesParser.StepStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_stepStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(RecipesParser.T__5)
            self.state = 54
            self.match(RecipesParser.ID)
            self.state = 56
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RecipesParser.ID) | (1 << RecipesParser.AMOUNT) | (1 << RecipesParser.FLOAT))) != 0):
                self.state = 55
                self.stepParams()


            self.state = 63
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RecipesParser.T__6) | (1 << RecipesParser.T__8) | (1 << RecipesParser.T__9))) != 0):
                self.state = 61
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [RecipesParser.T__8, RecipesParser.T__9]:
                    self.state = 58
                    self.stepModifiers()
                    pass
                elif token in [RecipesParser.T__6]:
                    self.state = 59
                    self.match(RecipesParser.T__6)
                    self.state = 60
                    self.match(RecipesParser.AMOUNT)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 65
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 66
            self.match(RecipesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TotalCaloriesStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return RecipesParser.RULE_totalCaloriesStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTotalCaloriesStmt" ):
                return visitor.visitTotalCaloriesStmt(self)
            else:
                return visitor.visitChildren(self)




    def totalCaloriesStmt(self):

        localctx = RecipesParser.TotalCaloriesStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_totalCaloriesStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(RecipesParser.T__7)
            self.state = 69
            self.match(RecipesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StepParamsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(RecipesParser.ID)
            else:
                return self.getToken(RecipesParser.ID, i)

        def AMOUNT(self, i:int=None):
            if i is None:
                return self.getTokens(RecipesParser.AMOUNT)
            else:
                return self.getToken(RecipesParser.AMOUNT, i)

        def FLOAT(self, i:int=None):
            if i is None:
                return self.getTokens(RecipesParser.FLOAT)
            else:
                return self.getToken(RecipesParser.FLOAT, i)

        def getRuleIndex(self):
            return RecipesParser.RULE_stepParams

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStepParams" ):
                return visitor.visitStepParams(self)
            else:
                return visitor.visitChildren(self)




    def stepParams(self):

        localctx = RecipesParser.StepParamsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_stepParams)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 71
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RecipesParser.ID) | (1 << RecipesParser.AMOUNT) | (1 << RecipesParser.FLOAT))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 74 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << RecipesParser.ID) | (1 << RecipesParser.AMOUNT) | (1 << RecipesParser.FLOAT))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StepModifiersContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def parallel(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RecipesParser.ParallelContext)
            else:
                return self.getTypedRuleContext(RecipesParser.ParallelContext,i)


        def dependsOn(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RecipesParser.DependsOnContext)
            else:
                return self.getTypedRuleContext(RecipesParser.DependsOnContext,i)


        def getRuleIndex(self):
            return RecipesParser.RULE_stepModifiers

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStepModifiers" ):
                return visitor.visitStepModifiers(self)
            else:
                return visitor.visitChildren(self)




    def stepModifiers(self):

        localctx = RecipesParser.StepModifiersContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_stepModifiers)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 78
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [RecipesParser.T__8]:
                        self.state = 76
                        self.parallel()
                        pass
                    elif token in [RecipesParser.T__9]:
                        self.state = 77
                        self.dependsOn()
                        pass
                    else:
                        raise NoViableAltException(self)


                else:
                    raise NoViableAltException(self)
                self.state = 80 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParallelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return RecipesParser.RULE_parallel

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParallel" ):
                return visitor.visitParallel(self)
            else:
                return visitor.visitChildren(self)




    def parallel(self):

        localctx = RecipesParser.ParallelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_parallel)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(RecipesParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DependsOnContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(RecipesParser.ID, 0)

        def getRuleIndex(self):
            return RecipesParser.RULE_dependsOn

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDependsOn" ):
                return visitor.visitDependsOn(self)
            else:
                return visitor.visitChildren(self)




    def dependsOn(self):

        localctx = RecipesParser.DependsOnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_dependsOn)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(RecipesParser.T__9)
            self.state = 85
            self.match(RecipesParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TotalCostStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return RecipesParser.RULE_totalCostStmt

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTotalCostStmt" ):
                return visitor.visitTotalCostStmt(self)
            else:
                return visitor.visitChildren(self)




    def totalCostStmt(self):

        localctx = RecipesParser.TotalCostStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_totalCostStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(RecipesParser.T__10)
            self.state = 88
            self.match(RecipesParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





