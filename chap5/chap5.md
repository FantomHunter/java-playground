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

### comparing

for each value of arrays

- negative number means the first is smaller than the second
- zero means equal
- positive number means the first is larger than the sencond

for all arrays

- if same length and same value in the same order return zero
- if all elements are the same but the sencond array has extra element at the end, return negative
- if all elements are the same but the first array has extra element at the end, return positive
- if the first element that differs is smaller in the first arrays, return a negative number
- if the first element that dffers is the larger in the first arrays, return a positive number.

what is smaller means

- null is smallest value
- for number, normal numeric order applies
- for string, one is smaller if it a prefix of the other
- for string/character, number are smaller than letter
- for string/character, uppercase is smaller than lowercase

|first|second|result|
|---|---|---|
|new int[]{1,2}|new int[]{1}|positive number|
|new int[]{1,2}|new int[]{1,2}|zero|
|new String[]{"a"}|new String[]{"aa"}|negative number|
|new String[]{"a"}|new String[]{"A"}|positive number|
|new String[]{"a"}|null|positive number|

### multidimentional arrays

``` java
int[][] vars1; // 2D array
int vars2 [][]; // 2D array
int[] vars3[]; // 2D array
int[] vars4 [], space [][]; // a 2D AND a 3D array
String [][] rectangle = new String[3][2];
int[][] differentSizes = {{1, 4}, {3}, {9,8,7}};
// define first dimention, then other
int [][] args = new int[4][];
args[0] = new int[5];
args[1] = new int[3];
```
