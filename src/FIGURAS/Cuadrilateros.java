package FIGURAS;

import java.sql.SQLOutput;

public class Cuadrilateros extends Dos_D{

    public Cuadrilateros() {
    }

    public double getBase() {
        return super.getBase();
    }

    public double getArea(){
        return super.getArea();
    }

    public double calcularDatosCuadrado() {
        area = base*base;
        perimetro = base*4;

        return area;
    }
    public void imprimirdATOSCuadrado() {
        System.out.println("EL area del cuadrado es: " + getArea());
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }

    public double calcularDatosRectangulo(){
        area = 0;
        perimetro = 0;
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        return area;
    }
    public void imprimirDatosRectangulo() {
        System.out.println("EL area del rectangulo es: " + getArea());
        System.out.println("El perimetro del rectangulo es: " + getPerimetro());
    }
}
