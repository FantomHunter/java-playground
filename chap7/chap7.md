# Chapter 7: Method and encapsulation

private > default > protected > public

## static

### static import

``` java
import static statics.A.TYPE;
import static statics.B.TYPE; // DOES NOT COMPILE
```

## passing data among method

Java is **pass by value** language. This means that a copy of the variable
is made and the method receives that copy.

``` java
public static void main(String[] args) {
    int num = 4;
    newNumber(num);
    System.out.println(num); // 4
}
public static void newNumber(int num) {
    num = 8;
}
```

### overload order

|Rule|example method `glide(1,2)`|
|---|---|
|Exact match by type|glide(int i, int j)|
|Larger primitive type|glide(long i, long j)|
|Autobox Type|glide(Integer i, Integer j)|
|Varags|glide(int... nums)|
