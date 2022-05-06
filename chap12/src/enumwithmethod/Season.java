package enumwithmethod;
public enum Season{
    WINTER(1) {
        public String getHours(){
            return "cold";
        }
    },
    SPRING(2){
        public String getHours(){
            return "warm";
        }
    },
    SUMMER(3){
        public String getHours(){
            return "hot";
        }
    }
    ;
    // public int rank = 1;
    // private final int rank;
    Season(int rank){
        // this.rank = rank;
        System.out.println("build enum with rank " + rank);
    }

    public abstract String getHours();
}