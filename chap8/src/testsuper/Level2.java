package testsuper;

class Level2 extends Level1{
    protected int a = 2;
    protected int b = -1;

    public Level2(){
        System.out.println("Level2 ");
        System.out.println("Level2 this.a = " + this.a);
        System.out.println("Level2 super.a = " +  super.a);
        System.out.println("Level2 this.b = " + this.b);
        System.out.println("Level2 super.b = " +  super.b);
    }

}