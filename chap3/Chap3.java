class Chap3 {
    public static void main(String[] args){
        int value = 0;
        System.out.println(value);
        System.out.println(value++);
        System.out.println(++value);
        System.out.println(value);
        System.out.println(--value);
        System.out.println(value);
        System.out.println(value--);
        int lion =3;
        int tiger = ++lion*5/lion;

        System.out.println("lion is: " + lion);
        System.out.println("tiger is: " + tiger);
        test();

    }

    public static void test(){
        int bear = 5;
        int dragon = ++bear + bear--;
        System.out.println("bear is: " + bear);
        System.out.println("dragon is: " + dragon);
    }

    public int add(int a, int b){
        return a + b;
    }
    public void runAdd(){
        int result = add(5,6);
        System.out.println("5 + 6: " + result);
    }
}