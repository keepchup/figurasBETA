package FIGURAS;

public class Nlados extends Otras_Figuras{
    double apotema;

    public Nlados() {
    }

    public Nlados(double apotema) {
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    private static double calcularApotema (double lado) {
        return lado / (2 * Math.tan(Math.toRadians(180.0 / 5)));
    }
    public double calcularArea(){
        double area = (calcularPerimetro() * calcularApotema(lado))/2;
        return (float) area;
    }


}
