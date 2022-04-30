# Chapter 3: Operators

## Order of operator

|Operator|Symbol|
|---------|------|
|post-unary| expression++ , expression--|
|pre-unary| ++expression , --expression|
|other unary| -, !, ~, +, (type)|
|Muliplication/division/module|*,/,%|
|addtion, substraction|+,-|
|shift operator|<<, >>, >>>|
|reational operator|<, >, <=, >=, instanceof|
|==|!=|
|logical operator|&, ^, \||
|short-circuit operator| &&, \|\||
|ternary operator| *boolean expresstion?expresstion1:expression2*|
|assignment operator|=, +=, -=, *=, /=, %=, &=, ^=, \|=, <<=, >>=, >>>=|
|||
## Working with Binary Arithmetic Operators

For integer values, division results in the *floor value* of the
nearest integer that fulfills the operation, whereas modulus is the
remainder value.

### Numeric promotion

1. If 2 value has difference types, java auto promote to the larger one
2. If one is integral and the other is floating-point, java will promote the intergral to the floating-point
3. In binary arithmetic operator, *byte, short, char* alway promote to int.
4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

## Relational operator

|Operator|Description|
|----|----|
|<| less than|
|<=| less than or equal|
|>| greater than|
|>=| greater than or equal|
|a instance of b| if a and b has an instance of class, subclass of or implement of same interface|

## Logical operator

|Operator|Description|
|----|----|
|&| AND *true* only if both are *true*|
|\|| OR *true* if one of the values is *true*|
|^| XOR *true* only one value is *true* and the other is *false*|

## Short circuit operator

|Operator|Description|
|----|----|
|&&| AND *true* only if both are *true*, if the left value is *false*, the right value will not be evaluated|
|\|\|| OR *true* if one of the values is *true*, if the left value is *true*, the righ value will not be evaluated |
