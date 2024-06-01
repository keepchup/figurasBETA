package FIGURAS;

public class Figuras_2D extends Figuras{
    int num_caras;
    double aristas;
    double volumen;

    public Figuras_2D() {
    }
    public Figuras_2D(int num_caras, double aristas) {
        this.num_caras = num_caras;
        this.aristas = aristas;
        this.volumen = volumen;
    }

    public int getNum_caras() {
        return num_caras;
    }

    public void setNum_caras(int num_caras) {
        this.num_caras = num_caras;
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }

    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double calcularVolumen() {
        System.out.println("Calculando volumen de Figuras 2D");
        return volumen;
    }
}
