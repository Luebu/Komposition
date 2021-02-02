public class Main {

    public static void main(String[] args) {
        Mannschaft m1 = new Mannschaft();
        Mannschaft m2 = new Mannschaft();
        Spiel sp = new Spiel(m1,m2);
        m1.setAktuellesSpiel(sp);
        m2.setAktuellesSpiel(sp);
    }
}
