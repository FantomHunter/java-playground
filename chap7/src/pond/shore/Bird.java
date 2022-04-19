package pond.shore;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println("Bird" + text);
    }
    public void eat() {
        System.out.println("Bird is eating");
    }
}