# Chapter 6: Lambdas and Function Interfaces

**Function Interface** is the interface that has only one abstract method

Some function interface: `Predicate, Consumer, Supplier, Comparator`

## Variables referenced from lamda body

Lamda can access an instance variable, method parameter, or local variable in certain condition. Instance variables (and class variables) are always allowed. Method parameters and local variables are allowed to be referenced if they are effectively final.

``` java
public class Crow {
    private String color;
    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
            System.out.println(name + " says " + volume + " that she is " + color); 
   }
}
```

|Variable type|Rule|
|---|---|
|instance variable|allowed|
|static variable|allowed|
|local variable|allowed if effectively final|
|method parameter|allowed if effectively final|
|lambda parameter|allowed|
