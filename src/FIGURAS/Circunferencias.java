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
        return Math.PI * radio * radio;
    }
}
