package testsuper;

class Level1 extends Root{
    protected int a=1;

    public Level1(){
        System.out.println("Level1");
        System.out.println("Level1 this.a = " + this.a);
        System.out.println("Level1 super.a = " + super.a);
    }
}