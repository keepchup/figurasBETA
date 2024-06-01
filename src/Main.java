import FIGURAS.Figuras;
import FIGURAS.Cuadrilateros;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cuadrilateros c1 = new Cuadrilateros();

        c1.setLados(4);
        c1.setBase(3);
        c1.calcularAreaCuadrado();
        c1.imprimirdATOSCuadrado();
    }
}