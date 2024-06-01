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

    @Override
    public int getLados() {
        return super.getLados();
    }

    private static double calcularApotema(int lados) {
        return lados / (2 * Math.tan(Math.toRadians(180.0 / 5)));
    }

    public double calcularAreaNlados() {
        double area = (calcularPerimetro() * calcularApotema(getLados())) / 2;
        return (float) area;
    }
}
