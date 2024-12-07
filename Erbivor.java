public class Erbivor extends Animal {
    public Erbivor(String nume, int energie, int x, int y, int viteza) {
        super(nume, energie, x, y, viteza, "plante");
    }

    @Override
    public void mananca(Entitate_Ecosistem hrana) {
        if (hrana instanceof Planta) {
            energie += hrana.energie;
        }
    }

    @Override
    public void actioneaza() {
        // Exemplu de logică: Erbivorul mănâncă sau se deplasează
        deplaseaza(1, 0);
    }
}
