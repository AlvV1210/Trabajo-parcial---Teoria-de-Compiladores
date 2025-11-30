grammar Recipes;

program
    : recipeStmt statement+ EOF
    ;

recipeStmt
    : 'recipe' STRING ';'
    ;

statement
    : ingredientStmt
    | stepStmt
    | totalCostStmt
    | totalCaloriesStmt
    ;

ingredientStmt
    : 'ingredient' ID AMOUNT ('costPerUnit' FLOAT)? ('calories' INT)? ';'
    ;

stepStmt
    : 'step' ID stepParams? (stepModifiers | 'time' AMOUNT)* ';'
    ;

totalCaloriesStmt: 'totalCalories' ';';

stepParams : (ID | AMOUNT | FLOAT)+ ;

stepModifiers: (parallel | dependsOn)+;

parallel: 'parallel';

dependsOn: 'dependsOn' ID;

totalCostStmt: 'totalCost' ';';

ID      : [a-zA-Z_][a-zA-Z_0-9]* ;

AMOUNT
    : [0-9]+ ('g' | 'kg' | 'ml' | 'l' | 'min' | 'h' | 'C' | 'piece' | 'cup' | 'tbsp' | 'tsp')
    ;

STRING : '"' (~["\\\r\n])* '"' ;

INT : [0-9]+ ;

FLOAT   : [0-9]+ ('.' [0-9]+)? ;
WS      : [ \t\r\n]+ -> skip ;
