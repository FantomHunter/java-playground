package testsuper;
class Main{
    public static void main(String... args){
        System.out.println("create root");
        Root root = new Root();
        System.out.println("create lvl1");
        Level1 level1 = new Level1();
        System.out.println("create lvl2");
        Level2 level2 = new Level2();
    }
    public void fakeMain(){
        Root root = new Root();
        Level1 level1 = new Level1();
        Level2 level2 = new Level2();
    }

}