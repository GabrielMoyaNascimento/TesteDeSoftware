package teste.pvai.lanche;

public class Lanche {
    private static final double XBACON = 5;
    public static double calcularValorFinal(int codigo, int quantidade) {
        switch (codigo){
            case 3:
                return quantidade * XBACON;
        }
        return 0;
    }
}