public class Main {
    public static void main(String[] args) {
        Planta iarba = new Planta("Iarba", 10, 0, 0, 2);
        Erbivor iepure = new Erbivor("Iepure", 20, 1, 1, 1);
        Carnivor lup = new Carnivor("Lup", 30, 2, 2, 2);
        Omnivor urs = new Omnivor("Urs", 40, 3, 3, 3);

        iarba.actioneaza();
        System.out.println("Energia plantei dupa crestere: " + iarba.energie);

        iepure.mananca(iarba);
        System.out.println("Energia iepurelui dupa hranire: " + iepure.energie);

        lup.mananca(iepure);
        System.out.println("Energia lupului dupa hranire: " + lup.energie);

        urs.mananca(iarba);
        System.out.println("Energia ursului dupa hranire: " + urs.energie);
    }
}
