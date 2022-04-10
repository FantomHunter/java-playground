class LocalVariable {
    
    public void methodWithLocalVariable() {
        var a = 1L;
        a = 5;
        a = 6L;
        var apple = (short) 10;
        apple = (byte) 5;
        // apple = 5_000_000; // not compiled

    }
    
    void block(int a){

        var isValid = true;
        if (isValid) {
            int b = 1, c = 2;
            {
                int d = 5;
                System.out.println(d);
            }

        }

    }


}