package FIGURAS;

public class Dos_D extends Figuras {

    double area;
    double perimetro;

    public Dos_D() {
    }

    public Dos_D(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double calcularArea() {
        return area * perimetro;
    }

    public double calcularPerimetro() {
        System.out.println("Hola");
        return perimetro;
    }
}
