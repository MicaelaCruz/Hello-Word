package pt.uma.tpsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int perimeter = calculaterPerimeter( 2, 4 );
        System.out.println("O comprimeto do retangulo é:" + perimeter);
        int volume = calculateVolume( 2, 4,6 );
        System.out.println("O volume do retangulo é:" + volume);

    }

    private static double celcius (double C) {
        double t = 9 * C / 5 + 32;
        return t;
    }

    private static int calculateVolume(int comprimento, int altura, int largura) {
        int volume = comprimento * altura * largura;
        return volume;
    }

    private static int calculaterPerimeter(int base, int altura ) {
        int perimeter = 2 * (base + altura);
        return perimeter;
    }
}
