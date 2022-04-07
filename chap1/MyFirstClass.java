/**
    Java class structure
    @author hvhai
 */
class MyFirstClass {
    // Fields
    public int myIntField;
    String name;

    public static void main(String... arg) {
        System.out.println("Hello world"); // Display the string
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