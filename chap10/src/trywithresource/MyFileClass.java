package trywithresource;

class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num){this.num = num;}
    public void close(){
        System.out.println("Closing: " + num);
    }

    public static void main(String[] args) throws Exception{
        try(
            MyFileClass m1 = new MyFileClass(1);
            MyFileClass m2 = new MyFileClass(2);
        ){
            throw new RuntimeException();
        }catch(RuntimeException ex){
            System.out.println("ex: " + ex.getMessage());
        }finally{
            System.out.println("finally");
            throw new Exception("finally ex:");
        }
    }
}