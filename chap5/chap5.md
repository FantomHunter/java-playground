# Chapter 5: Core Java APIs

## String

### concatenation

``` java
System.out.println(1 + 2); // 3
System.out.println("a" + "b"); // ab
System.out.println("a" + "b" + 3); // ab3
System.out.println(1 + 2 + "c"); // 3c
System.out.println("c" + 1 + 2); // c12
```

## Arrays

### create arrays of primitives

``` java
// all code belows is valid
int[] numbers = new int[3];
int[] number = new int[]{1, 3, 5};
int[] numAnimals;
int [] numAnimals2;
int []numAnimals3;
int numAnimals4[];
int numAnimals5 [];
String [] bugs = { "cricket", "beetle", "ladybug" };
```

### searching

Java provide searching but **only if the array is *sorted***

|Scenario|Result|
|---|---|
|target found in *sorted* arrays| index of the target|
|target not found in *sorted* arrays| Negative value showing one smaller than the negative of the index, where a match needs to be inserted to preserve sorted order|
|unsorted arrays| **unpredictable** :man_facepalming:|

``` java
int[] numbers = {2,4,6,8};
System.out.println(Arrays.binarySearch(numbers, 2)); // 0
System.out.println(Arrays.binarySearch(numbers, 4)); // 1
System.out.println(Arrays.binarySearch(numbers, 1)); // -1
System.out.println(Arrays.binarySearch(numbers, 3)); // -2
System.out.println(Arrays.binarySearch(numbers, 9)); // -5
```
