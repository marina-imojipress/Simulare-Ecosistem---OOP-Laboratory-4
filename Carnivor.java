public class Carnivor extends Animal {
    public Carnivor(String nume, int energie, int x, int y, int viteza) {
        super(nume, energie, x, y, viteza, "carne");
    }

    @Override
    public void mananca(Entitate_Ecosistem hrana) {
        if (hrana instanceof Animal && !((Animal) hrana).tipHrana.equals("carne")) {
            energie += hrana.energie;
        }
    }

    @Override
    public void actioneaza() {
        // Exemplu de logică: Carnivorul se deplasează
        deplaseaza(1, 1);
    }
}
