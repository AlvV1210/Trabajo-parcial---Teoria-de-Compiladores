# Generated from Recipes.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .RecipesParser import RecipesParser
else:
    from RecipesParser import RecipesParser

# This class defines a complete generic visitor for a parse tree produced by RecipesParser.

class RecipesVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RecipesParser#program.
    def visitProgram(self, ctx:RecipesParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#recipeStmt.
    def visitRecipeStmt(self, ctx:RecipesParser.RecipeStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#statement.
    def visitStatement(self, ctx:RecipesParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#ingredientStmt.
    def visitIngredientStmt(self, ctx:RecipesParser.IngredientStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#stepStmt.
    def visitStepStmt(self, ctx:RecipesParser.StepStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#totalCaloriesStmt.
    def visitTotalCaloriesStmt(self, ctx:RecipesParser.TotalCaloriesStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#stepParams.
    def visitStepParams(self, ctx:RecipesParser.StepParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#stepModifiers.
    def visitStepModifiers(self, ctx:RecipesParser.StepModifiersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#parallel.
    def visitParallel(self, ctx:RecipesParser.ParallelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#dependsOn.
    def visitDependsOn(self, ctx:RecipesParser.DependsOnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RecipesParser#totalCostStmt.
    def visitTotalCostStmt(self, ctx:RecipesParser.TotalCostStmtContext):
        return self.visitChildren(ctx)



del RecipesParser