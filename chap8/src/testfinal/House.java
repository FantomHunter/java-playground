class House {
    private final Integer a;
    {
        a = null;
    }

    public House(){
        this(null);
    }
    public House(Integer a) {
        this.a = a;
    }
    
}