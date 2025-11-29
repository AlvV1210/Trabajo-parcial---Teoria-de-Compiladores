// Generated from Recipes.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RecipesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RecipesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RecipesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RecipesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#recipeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipeStmt(RecipesParser.RecipeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RecipesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#ingredientStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientStmt(RecipesParser.IngredientStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#stepStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepStmt(RecipesParser.StepStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#totalCaloriesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalCaloriesStmt(RecipesParser.TotalCaloriesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#stepParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepParams(RecipesParser.StepParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#stepModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepModifiers(RecipesParser.StepModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#parallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel(RecipesParser.ParallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#dependsOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependsOn(RecipesParser.DependsOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipesParser#totalCostStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalCostStmt(RecipesParser.TotalCostStmtContext ctx);
}