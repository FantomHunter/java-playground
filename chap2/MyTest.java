package chap2;
class MyTest{
    static{
        System.out.println("static block 0");
        readSum();
        readInitialized();
    }

    static
    {
        System.out.println("static block");
        initialize();
    }

    static{
        System.out.println("static block 1");
        readSum();
        readInitialized();
    }
      
    private static int sum;

    static{
        System.out.println("static block 2");
        readSum();
        readInitialized();
    }
    MyTest(){
        System.out.println("MyTest constructor");
    }
      
    public static int getSum()
    {
        System.out.println("getSum()");
        initialize();
        return sum;
    }
  
    static{
        System.out.println("static block 3");
        readSum();
        readInitialized();
    }
    private static boolean initialized = false;
    static{
        System.out.println("static block 4");
        readSum();
        readInitialized();
    }
  
    private static void initialize()
    {
        System.out.println("initialize() initialized before: " + initialized);
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
        System.out.println("initialize() initialized after: " + initialized);
    }
    static{
        System.out.println("static block 5");
        readSum();
        readInitialized();
    }
    private static void readSum(){
        System.out.println("readSum(): " + sum);
    }
    private static void readInitialized(){
        System.out.println("readInitialized(): " + initialized);
    }
}