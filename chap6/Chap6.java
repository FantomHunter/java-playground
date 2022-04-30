import java.util.HashMap;

class Chap6 {
    public static void main(String... args) {
        var map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.forEach((k,v)-> System.out.println("key: " + k + "| value: " + v));
    }
}