package classinitialization;

public class Hippo extends Animal {
    static{ System.out.println("Hippo");}

    public static void main(String... args){
        System.out.println("Main");
        new Hippo();
    }
}