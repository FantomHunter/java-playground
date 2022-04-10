# Chapter 2: Java building block

## constructor

- The name of the constructor match with the class name
- no return type.

## code block

- instance initializer
- class definition
- method declaration
- inner block

### order of initialization

- field and instance initializer block are run in order in which they appear in file. (cannot refer to the variable befor it has been defined)
- the constructor run after all fields and instance initializer block have run.

## data types

### primitive types

boolean -> byte -> short -> int -> long -> float -> double -> char
when value is set out of range the compiler will report an error.

### writing literal

When a number is present in code, it is called a *literal*
By default all number literal will be known as int, for the orther type need add L (long), F (float), D (double)

~~~ java
long max = 3123456789; // Does not commpile
long max = 3123456789L; // commpile
long max = 300; // compile
~~~

### literal and underscore

~~~ java
int million = 1_000_000; // compile
double notAtStart = _1000.00; // DOES NOT COMPILE
double notAtEnd = 1000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
double reallyUgly = 1__________2; // Also compiles
~~~

### reference types

A refference type refer to an object (instace of a class). A value is assigned to reference in one of the 2 ways:

1. a reference can be assigned to another object of the same or compatible type.
2. a reference can be assigned to a new object using the **new** keyword

## identifier

An *idendifier* is the name of the variable, method, class, interface or package.

1. must be begin by a letter, a **$** symbol or a **_** symbol
2. canbe include number but cannot start with them
3. since Java9, underscore _ is not allow as an identifier
4. cannot use the *reserver word*

~~~ java
// legal
long okidentifier;
float $OK2Identifier;
boolean _alsoOK1d3ntifi3r;
char __SStillOkbutKnotsonice$;
// illegal
int 3DPointClass; // identifiers cannot begin with a number
byte hollywood@vine; // @ is not a letter, digit, $ or _
String *$coffee; // * is not a letter, digit, $ or _
double public; // public is a reserved word
short _; // a single underscore is not allowed

~~~

## variables

- A *local variable* is a variable defined within a constructor, a method or intitializer block.
- An *instance variable*, often called a field, is
a value defined within a specific instance of an object
- a *class variable* is one that is defined on the class level and shared among all instances of the class

Instance and class variables do not require you to initialize them.

Local variable *var* does not allow multiple declarations.

~~~ java
var a=2, b=3; // does not compiled
var m = null; // does not compiled
//but 
var o = (String)null; // compiled
~~~

*var* is not a reserver word. But it is consider a reserver type name. A *reserve type name* mean it cannot be used to define a type like class, interface or enum.

~~~ java
class var{} // does not compile

 // compiled
class Var{
    public void var(){
        var var = 1;
    }
}
~~~
