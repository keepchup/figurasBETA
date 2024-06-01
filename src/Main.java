import FIGURAS.Figuras;
import FIGURAS.Cuadrilateros;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cuadrilateros c1 = new Cuadrilateros();

        Cuadrilateros c2 = new Cuadrilateros();

        c1.setLados(4);
        c1.setBase(3);
        c1.calcularDatosCuadrado();
        c1.imprimirdATOSCuadrado();

        c2.setLados(4);
        c2.setBase(3);
        c2.setAltura(5);
        c2.calcularDatosRectangulo();
        c2.imprimirDatosRectangulo();



    }

}