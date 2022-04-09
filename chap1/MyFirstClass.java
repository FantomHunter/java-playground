import java.util.Random;
/**
    Java class structure
    @author hvhai
 */
public class MyFirstClass {
    // Fields
    public int myIntField;
    String name;

    public static void main(String... arg) {
        System.out.println("Hello world"); // Display the string
        // Random
        Random random = new Random();
        System.out.println("Random int: " + random.nextInt(10)); 
    }

    public String getName() {
        return this.name;
    }

    /*
    Method signature =  method name + method parameter
    */
    public void setName(String name) {
        this.name = name;
    }
    // /* check */
    /* check 
    // 1 line comment insde multiline comment 
    */

    ///// check
    /**
        // comment in java dock
    */

    /** // comment in java dock
    */

}