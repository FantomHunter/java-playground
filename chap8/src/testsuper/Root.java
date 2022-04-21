package testsuper;

class Root{
    protected int a = 0;
    protected int b = 0;
    public Root(){
        System.out.println("Root");
        System.out.println("Root this.a = " + this.a);
        System.out.println("Root this.b = " + this.b);
    }
}