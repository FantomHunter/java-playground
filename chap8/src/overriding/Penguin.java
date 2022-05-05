package overriding;
class Penguin {
    public static int getHeight() {return 3;}
    public void printInfo(){
        System.out.println(this.getHeight());
    }
}