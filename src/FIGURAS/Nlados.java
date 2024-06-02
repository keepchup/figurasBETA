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
        apotema = tamlado / (2.0 * Math.tan(Math.toRadians(36.0)));
        perimetro = tamlado * 5;
        area = (perimetro * apotema)/2;
        return area;
    }

    public void imprimirDatosPentagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del pentagono es: " + getArea());
        System.out.println("El perimetro del pentagono es: " + getPerimetro());
    }
    public double calcularDatosHexagono(){
        apotema = (tamlado * Math.sqrt(3))/ 2;
        perimetro = tamlado * 6;
        area = (perimetro * area)/2;
        return area;
    }

    public void imprimirDatosHexagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del hexagono es: " + getArea());
        System.out.println("El perimetro del hexagono es: " + getPerimetro());
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
        apotema = ((tamlado/2)*(Math.sin((9*Math.PI)/22)/Math.sin(Math.PI/11)));
        perimetro = tamlado * 11;
        area = ((11*apotema*tamlado)/2);
        return area;
    }
    public void imprimirDatosEndecagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del endecagono es: " + getArea());
        System.out.println("El perimetro del endecagono es: " + getPerimetro());
    }

    public double calcularDatosdodecagono() {
        apotema = (tamlado*((2+Math.sqrt(3))/2));
        perimetro = tamlado * 12;
        area = 6*apotema*tamlado;
        return area;
    }
    public void imprimirDatosDodecagono(){
        System.out.println("Apotema: "+ getApotema());
        System.out.println("Tamlado: "+ getTamlado());
        System.out.println("El area del dodecagono es: " + getArea());
        System.out.println("El perimetro del dodecagono es: " + getPerimetro());
    }
}
