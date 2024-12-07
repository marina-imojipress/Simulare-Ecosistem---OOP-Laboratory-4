public abstract class Animal extends Entitate_Ecosistem {
    protected int viteza;
    protected String tipHrana; // "plante", "carne", "ambele"

    public Animal(String nume, int energie, int x, int y, int viteza, String tipHrana) {
        super(nume, energie, x, y, 0.6);
        this.viteza = viteza;
        this.tipHrana = tipHrana;
    }

    public abstract void mananca(Entitate_Ecosistem hrana);

    public void deplaseaza(int dx, int dy) {
        x += dx * viteza;
        y += dy * viteza;
    }
}
