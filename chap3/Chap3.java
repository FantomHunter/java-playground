class Chap3 {
    public static void main(String[] arg){
        int a[];
        int[] b;
        Chap3 chap3 = new Chap3();
        chap3.arithmeticOperator();
        chap3.promote();
        // float c =2.0/9;
        chap3.compoundOperator();
    }

    public void arithmeticOperator() {
        int a = 5;
        int b = a++*2/--a;
        int c = ++a*2/a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
    public void promote(){
        short a = 5;
        float b = 10;
        double c = 4;
        var z = a*b/c;
        System.out.println(z);
    }

    public void compoundOperator() {
        long goat = 10;
        int sheep = 5;
        // sheep = sheep*goat // not compiled
        sheep *=goat; // compiled 
        System.out.println(sheep);
    }
}