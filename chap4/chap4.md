# Chapter 4: Making decisions

## **switch** statement

Support type: `int, byte, short, char, String, emum, var` (if resovle one of the precedent types)

### numeric promote casting

``` java
short size = 4;
final int small = 15;
final int big = 1_000_000;
switch(size) {
    case small:
    case 1+2 :
    case big: // DOES NOT COMPILE
}
```

## **for** loops

1. Infinitive loop

    ``` java
    for (;;) {
        System.out.println("Hello world!");
    }
    ```

2. Adding multiple term

    ``` java
    // this code print: 0 1 2 3 4 5 
    int x = 0;
    for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) { 
        System.out.print(y + " "); 
    }
    System.out.print(x + " ");
    ```

3. Redeclare variable

    ``` java
    int x = 0;
    for(int x = 4; x < 5; x++) { // DOES NOT COMPILE
        System.out.print(x + " ");
    }
    ```

4. Using incompatible data type

    ``` java
    int x = 0;
    for(long y = 0, int z = 4; x < 5; x++) { // DOES NOT COMPILE
        System.out.print(y + " ");
    }
    ```

5. Using loop variale ouside the loop

    ``` java
    for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
        System.out.print(y + " ");
    }
    System.out.print(x); // DOES NOT COMPILE
    ```
