# Wellcome to java

## Fields and Method

- member of class = methods + fields

- method signature = method name + method parameter

- method declaration = methed return type

## Comments

``` java
// comment 1 line
/*
    comment multi lines
    comment second line
*/
/**
    java doc comment
    @author hvhai
*/

```

## Class and File

- normally 1 class one file

- if have more than 1 class, the public class must be the same with file name. And only 1 public class in file. (Inner class not be consider here)

- if the file contain main method, the main method will need to store in **public** class

## create main method

``` java
// all are allowed
public static void main(String[] args) {}
public static void main(String args []) {}
public static void main(String... args) {}
```

## package and inport

``` java
// not commpile, wildcard only for class name not file.Files
import java.nio.*;
// not compile
import java.*.*; 
// complile but don't do anything
import java.util.Random.*;
```

## compile and running code with package

### compile

``` bash
javac -d classes packagea/*.java packageb/*.java
```

### run

``` bash
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB
```
