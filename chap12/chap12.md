# Chapter 12: Java fundamentals

## enum

All enum constructors are implicitly `private`, with the modifier being optional.
Enum constructor only run once

## Creating nested class

- inner class
- static nested class
- local class
- anonymous class

### inner class

- Can be declared public, protected, package‐private (default), or private
- Can extend any class and implement interfaces
- Can be marked abstract or final
- Cannot declare static fields or methods, except for static final fields
- Can access members of the outer class including private members

### static nested class

- The nesting creates a namespace because the enclosing class name must be used to refer to it.
- It can be made private or use one of the other access modifiers to encapsulate it.
- The enclosing class can refer to the fields and methods of the static nested class.

### local class

- They do not have an access modifier.
- They cannot be declared static and cannot declare static fields or methods, except for static final fields.
- They have access to all fields and methods of the enclosing class (when defined in an instance method).
- They can access local variables if the variables are final or effectively final.

### modifier in nested class

|Permitted modifier|Inner class|static nested class|local class|annonymous class|
|--|--|--|--|--|
|access modifier|all|all|none|none|
|`abstract`|yes|yes|yes|no|
|`final`|yes|yes|yes|no|

### member in nested class

|Permitted member|Inner class|static nested class|local class|annonymous class|
|--|--|--|--|--|
|instance method|yes|yes|yes|yes|
|instance variable|yes|yes|yes|yes|
|`static` method|no|yes|no|yes|
|`static` variable|yes (if final)|yes|yes (if final)|yes (if final)|

### nested class access rule

||Inner class|static nested class|local class|annonymous class|
|--|--|--|--|--|
|Can extend any class or implement any number of interfaces|yes|yes|yes|No—must have exactly one superclass or one interface|
|Can access instance members of enclosing class without a reference|yes|no|Yes (if declared in an instance method)|Yes (if declared in an instance method)|
|Can access local variables of enclosing method |N/A|N/A|Yes (if final or effectively final)|Yes (if final or effectively final)|

## interface
#### default interface method

1. A default method may be declared only within an interface.
2. A default method must be marked with the default keyword and include a method body.
3. A default method is assumed to be public.
4. A default method cannot be marked abstract, final, or static.
5. A default method may be overridden by a class that implements the interface.
6. If a class inherits two or more default methods with the same method signature, then the class must override the method.

### static interface method

1. A static method must be marked with the static keyword and include a method body.
2. A static method without an access modifier is assumed to be public.
3. A static method cannot be marked abstract or final.
4. A static method is not inherited and cannot be accessed in a class implementing the interface without a reference to the interface name.

## Funtional programming
