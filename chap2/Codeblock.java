
/**
    Chapter 2:
    Example code block
    @author hvhai
 */
class CodeBlock {
    int val =  1;
    {
        System.out.println("Instance initializer block");
        val = 2;
        System.out.println("call from instance initializer block val1 = " + val);
    }
    String classAttribute;

    public CodeBlock() {
        System.out.println("Class definition block");
        val = 3;
        System.out.println("call from constructor val1 = " + val);
    }

    public void methodBlock() {
        System.out.println("Method block");
        val = 4;
        System.out.println("Call from method block val = " + val);

    }

    public static void main(String[] args) {
        CodeBlock codeBlock = new CodeBlock();
        codeBlock.methodBlock();
    }

}