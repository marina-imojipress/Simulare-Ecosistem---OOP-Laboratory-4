public class Planta extends Entitate_Ecosistem {
    private int rataCrestere;

    public Planta(String nume, int energie, int x, int y, int rataCrestere) {
        super(nume, energie, x, y, 0.8);
        this.rataCrestere = rataCrestere;
    }

    @Override
    public void actioneaza() {
        energie += rataCrestere; // Planta crește
    }
}
