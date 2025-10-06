from antlr4 import *
import re

if __name__ is not None and "." in __name__:
    from RecipesParser import RecipesParser
    from RecipesVisitor import RecipesVisitor
else:
    from RecipesParser import RecipesParser
    from RecipesVisitor import RecipesVisitor

class EvalVisitor(RecipesVisitor):
    def __init__(self):
        self.recipe_name = ""
        self.ingredients = {}
        self.total_cost = 0.0
        self.total_calories = 0
        self.steps = []

    def visitProgram(self, ctx):
        self.visit(ctx.recipeStmt())
        for st in ctx.statement():
            self.visit(st)
        return {
        "recipe_name": self.recipe_name,
        "ingredients": self.ingredients,
        "steps": self.steps,
        "total_cost": self.total_cost,
        "total_calories": self.total_calories
        }

    def visitRecipeStmt(self, ctx):
        # Obtener el nombre sin las comillas
        raw_name = ctx.STRING().getText()
        self.recipe_name = raw_name[1:-1]  # Remover comillas
        print(f"{'='*50}")
        print(f"Receta: {self.recipe_name}")
        print(f"{'='*50}")

    def visitIngredientStmt(self, ctx):
      name   = ctx.ID().getText()
      amount = ctx.AMOUNT().getText()    # ejemplo: '200g'
      # separa numero y unidad con regex
      m = re.match(r'(\d+)([a-zA-Z]+)', amount)
      if m:
        qty  = int(m.group(1))         # 200
        unit = m.group(2)              # g
      else:
        qty, unit = 0, ''
      cost = float(ctx.FLOAT().getText()) if ctx.FLOAT() else 0.0
      calories = int(ctx.INT().getText()) if ctx.INT() else 0

      self.ingredients[name] = (qty, unit, cost)
      self.total_cost += cost
      self.total_calories += calories

    def visitStepStmt(self, ctx):
      step_name = ctx.ID().getText()

      # Parámetros (ingredientes o insumos del paso)
      params = [p.getText() for p in ctx.stepParams().children] if ctx.stepParams() else []

      # Tiempo
      time = None
      if ctx.AMOUNT():
          for a in ctx.AMOUNT():
              val = a.getText()
              if val.endswith("min") or val.endswith("h"):
                  time = val
                  break

      # Dependencias
      depends = []
      if ctx.stepModifiers():
          for mod in ctx.stepModifiers():
              if mod.dependsOn():
                  for dep in mod.dependsOn():
                      depends.append(dep.ID().getText())

      # Guardar
      step_info = {
          "step": step_name,
          "params": params,
          "time": time,
          "depends_on": depends
      }
      self.steps.append(step_info)

      # Imprimir más detallado
      msg = f"Paso: {step_name}"
      if params:
          msg += f" ({'mezclando ' + ', '.join(params) if step_name == 'mezclar' else 'usando ' + ', '.join(params)})"
      if time:
          msg += f" (tiempo: {time})"
      if depends:
          msg += f" (depende de: {', '.join(depends)})"
      print(msg)


    def visitTotalCostStmt(self, ctx):
      print("Costo total:", self.total_cost)

    def visitTotalCaloriesStmt(self, ctx):
      print("Calorías totales:", self.total_calories)
