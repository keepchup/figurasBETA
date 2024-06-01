package FIGURAS;

public class Circunferencias extends Otras_Figuras{
    double radio;

    public Circunferencias() {
    }

    public Circunferencias(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCiruclo() {
        area= Math.PI * radio * radio;
        perimetro = 2 * Math.PI * radio;
        return area;
    }

    public void imprimirDatosCirculo(){
        System.out.println("Circulo: " + getArea());
        System.out.println("Perimetro: " + getPerimetro());
    }
}
