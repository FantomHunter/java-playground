package packageb;

import packagea.ClassA;

public class ClassB{
    public static void main(String... arg) {
        ClassA classA = new ClassA();
        System.out.println("Class B in package b");
    }
}