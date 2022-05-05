package inheriting;

class Meerkat extends Carnivoire {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivoire c = m;

        System.out.println(m.hasFur);
        System.out.println(c.hasFur);

    }
}