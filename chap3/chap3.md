# Chapter 3: Operators

## Working with Binary Arithmetic Operators

For integer values, division results in the *floor value* of the
nearest integer that fulfills the operation, whereas modulus is the
remainder value.

### Numeric promotion

1. If 2 value has difference types, java auto promote to the larger one
2. If one is integral and the other is floating-point, java will promote the intergral to the floating-point
3. In binary arithmetic operator, *byte, short, char* alway promote to int.
4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.
