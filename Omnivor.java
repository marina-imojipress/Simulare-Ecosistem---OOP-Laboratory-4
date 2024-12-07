public class Omnivor extends Animal {
    public Omnivor(String nume, int energie, int x, int y, int viteza) {
        super(nume, energie, x, y, viteza, "ambele");
    }

    @Override
    public void mananca(Entitate_Ecosistem hrana) {
        if (hrana instanceof Planta || hrana instanceof Animal) {
            energie += hrana.energie;
        }
    }

    @Override
    public void actioneaza() {
        // Exemplu de logică: Omnivorul caută hrană și se deplasează
        deplaseaza(-1, 1);
    }
}
