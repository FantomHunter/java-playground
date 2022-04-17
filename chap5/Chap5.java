class Chap5 {
    public static void main(String[] args){
        String a = "  1 a 3     ";
        String b = a.trim().toUpperCase().replace("3", "b");
        System.out.println(b);
        concat();
        concatByStringBuilder();
    }

    public static void concat(){
        String str = "";
        for(char i = 'a'; i<= 'z'; i++) {
            str += i;
        }
        System.out.println(str);
    }
    public static void concatByStringBuilder(){
        StringBuilder builder = new StringBuilder();
        for(char i = 'a'; i<= 'z'; i++) {
            builder.append(i);
        }
        System.out.println(builder.toString());
    }
    public static void arrays(){
        int[] a ={1,2},b = {3,4};
        int c[] = {2,3}, d = 5;
        int e[], f[];
    }
}