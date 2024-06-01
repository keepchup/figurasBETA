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

    public double calcularAreaCuadrado() {
        area = base*base;
        return area;
    }

    public double calcularPerimetroCuadrado() {
        perimetro = base*4;
        return perimetro;
    }

    public void imprimirdATOSCuadrado() {
        System.out.println("EL area del cuadrado es: " + getArea());
        System.out.println("El perimetro del cuadrado es: " + getPerimetro());
    }
}
