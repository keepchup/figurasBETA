package FIGURAS;

public class Nlados extends Otras_Figuras{
    double apotema;
    double tamlado;

    public Nlados() {
    }

    public Nlados(double apotema, double tamlado) {
        this.apotema = apotema;
        this.tamlado = tamlado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getTamlado() {
        return tamlado;
    }

    public void setTamlado(double tamlado) {
        this.tamlado = tamlado;
    }



    public double calculaDatosPentagono() {
        return area;
    }
    public double calcularDatosHexagono(){
        return area;
    }
    public double calcularDatosHeptagono() {
        apotema = tamlado*1.0382060698;
        perimetro = tamlado * 7;
        area = ((perimetro * apotema)/2);
        return area;
    }
    public void imprimirDatosHeptagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del heptagono es: " + getArea());
        System.out.println("El perimetro del heptagono es: " + getPerimetro());
    }

    public double calcularDatosOctagono() {
        apotema = ((tamlado*2.41421)/2);
        perimetro = tamlado * 8;
        area = 4*apotema*tamlado;
        return area;
    }
    public void imprimirDatosOctagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del octagono es: " + getArea());
        System.out.println("El perimetro del octagono es: " + getPerimetro());
    }
    public double calcularDatosnonagono() {
        return area;
    }
    public double calcularDatosdecagono() {
        return area;
    }
    public double calcularDatosendecagono() {
        return area;
    }
    public double calcularDatosdodecagono() {
        return area;
    }
}
