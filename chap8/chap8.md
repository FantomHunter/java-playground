# Chapter 8: Class Design

## Calling constructors with *this*

### ***`this`*** vs ***`this()`***

Despite using the same keyword, this and this() are very different. The first, this, refers to an instance of the class, while the second, this(), refers to a constructor call within the class.

## Calling parent constructors with *super*

### ***`super`*** vs ***`super()`***

Like this and this(), super and super() are unrelated in Java. The first, super, is used to reference members of the parent class, while the second, super(), calls a parent constructor

## Oder of the initialization

### class initialization

1. If there is a super class Y of X, then initialize class Y first.
2. Process all `static` variable declaration in order they appear in the class
3. Process all `static` initializer in order they appear in the class

### instance initialization

1. If there is a super callas Y of X, then initialize instance of Y first.
2. Process all instance variable declarartion in order they apprear in the class
3. Process all instance initializer in order they appear in the class
4. Initialize the constructor including any overload constructor reference with `this()`
