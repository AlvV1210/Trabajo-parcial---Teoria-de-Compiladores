// Generated from Recipes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RecipesParser}.
 */
public interface RecipesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RecipesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RecipesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RecipesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#recipeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRecipeStmt(RecipesParser.RecipeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#recipeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRecipeStmt(RecipesParser.RecipeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RecipesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RecipesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#ingredientStmt}.
	 * @param ctx the parse tree
	 */
	void enterIngredientStmt(RecipesParser.IngredientStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#ingredientStmt}.
	 * @param ctx the parse tree
	 */
	void exitIngredientStmt(RecipesParser.IngredientStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#stepStmt}.
	 * @param ctx the parse tree
	 */
	void enterStepStmt(RecipesParser.StepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#stepStmt}.
	 * @param ctx the parse tree
	 */
	void exitStepStmt(RecipesParser.StepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#totalCaloriesStmt}.
	 * @param ctx the parse tree
	 */
	void enterTotalCaloriesStmt(RecipesParser.TotalCaloriesStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#totalCaloriesStmt}.
	 * @param ctx the parse tree
	 */
	void exitTotalCaloriesStmt(RecipesParser.TotalCaloriesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#stepParams}.
	 * @param ctx the parse tree
	 */
	void enterStepParams(RecipesParser.StepParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#stepParams}.
	 * @param ctx the parse tree
	 */
	void exitStepParams(RecipesParser.StepParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#stepModifiers}.
	 * @param ctx the parse tree
	 */
	void enterStepModifiers(RecipesParser.StepModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#stepModifiers}.
	 * @param ctx the parse tree
	 */
	void exitStepModifiers(RecipesParser.StepModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#parallel}.
	 * @param ctx the parse tree
	 */
	void enterParallel(RecipesParser.ParallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#parallel}.
	 * @param ctx the parse tree
	 */
	void exitParallel(RecipesParser.ParallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#dependsOn}.
	 * @param ctx the parse tree
	 */
	void enterDependsOn(RecipesParser.DependsOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#dependsOn}.
	 * @param ctx the parse tree
	 */
	void exitDependsOn(RecipesParser.DependsOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipesParser#totalCostStmt}.
	 * @param ctx the parse tree
	 */
	void enterTotalCostStmt(RecipesParser.TotalCostStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipesParser#totalCostStmt}.
	 * @param ctx the parse tree
	 */
	void exitTotalCostStmt(RecipesParser.TotalCostStmtContext ctx);
}