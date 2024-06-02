package FIGURAS;

public class Triangulos extends Dos_D {

    public Triangulos() {
    }

    public double getBase() {
        return super.getBase();
    }

    public double getAltura () {return super.getAltura();}

    public double getArea(){
        return super.getArea();
    }

    public double calcularDatosTriangulosIsoceles() {
        area = (base * altura) /2;
        perimetro = (altura * 2) + base;
        return area;
    }

    public void imprimirDatosTrianguloIsoceles() {
        System.out.println("EL area del triangulo es: " + getArea());
        System.out.println("El perimetro del triangulo es: " + getPerimetro());
    }

    public double calcularDatosTrianguloEquilatero () {
        area = (base * base) /2;
        perimetro = (base * 3);
        return area;
    }

    public void imprimirDatosTrianguloEquilatero() {
        System.out.println("EL area del triangulo es: " + getArea());
        System.out.println("El perimetro del triangulo es: " + getPerimetro());
    }
}
