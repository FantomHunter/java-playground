package overriding;

class CrestedPenguin extends Penguin {
    public static int getHeight(){return 8;}
    public static void main(String[] args) {
        new CrestedPenguin().printInfo();
    }
}