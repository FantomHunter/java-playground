package chap2;
class MyTestSimple2{
      
    private static int sum;
      
    public static int getSum()
    {
        initialize();
        return sum;
    }
  
    private static boolean initialized = false;
  
    static
    {
        initialize();
    }
    private static void initialize()
    {
        if (!initialized) {
            for (int i = 0; i < 100; i++)
                sum += i;
            initialized = true;
        }
    }
}