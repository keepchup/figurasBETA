import FIGURAS.Figuras;
import FIGURAS.Cuadrilateros;
import FIGURAS.Circunferencias;
import FIGURAS.Triangulos;
import FIGURAS.Nlados;
import FIGURAS.Figuras_2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //CUADRILATEROS
        Cuadrilateros c1 = new Cuadrilateros();

        Cuadrilateros c2 = new Cuadrilateros();

        c1.setLados(4);
        c1.setBase(3);
        c1.calcularDatosCuadrado();
        c1.imprimirdATOSCuadrado();

        System.out.println("\n");

        c2.setLados(4);
        c2.setBase(3);
        c2.setAltura(5);
        c2.calcularDatosRectangulo();
        c2.imprimirDatosRectangulo();


        //CIRCUNFERENCIAS
        System.out.println("\n");
        Circunferencias ciculo1 = new Circunferencias();

        ciculo1.setRadio(3);
        ciculo1.calcularAreaCiruclo();
        ciculo1.imprimirDatosCirculo();

        System.out.println("\n");

        Circunferencias elipse1 = new Circunferencias();
        elipse1.setRadio(3);
        elipse1.setRadioSecundario(5);
        elipse1.calcularAreaElipse();
        elipse1.imprimirDatosElipse();


        //TRIANGULOS
        System.out.println("\n");
        Triangulos t1 = new Triangulos();

        t1.setLados(3);
        t1.setBase(3);
        t1.setAltura(6);

        t1.calcularDatosTriangulosIsoceles();
        t1.imprimirDatosTrianguloIsoceles();

        System.out.println("\n");

        Triangulos t2 = new Triangulos();
        t2.setLados(3);
        t2.setBase(3);
        t2.setAltura(3);
        t2.calcularDatosTrianguloEquilatero();
        t2.imprimirDatosTrianguloEquilatero();

        System.out.println("\n");
        Triangulos t3 = new Triangulos();
        t3.setLados(3);
        t3.setLado1(4);
        t3.setLado2(3);
        t3.setLado3(5);
        t3.calcularDatosTrianguloEscaleno();
        t3.imprimirDatosTrianguloEscaleno();


        //HEPTAGONO
        System.out.println("\n");
        Nlados heptagono1 = new Nlados();
        heptagono1.setTamlado(5);
        heptagono1.calcularDatosHeptagono();
        heptagono1.imprimirDatosHeptagono();

        //OCTAGONO
        System.out.println("\n");
        Nlados octagono1 = new Nlados();
        octagono1.setTamlado(8);
        octagono1.calcularDatosOctagono();
        octagono1.imprimirDatosOctagono();

        //ENDECAGONO
        System.out.println("\n");
        Nlados endecagono1 = new Nlados();
        endecagono1.setTamlado(4);
        endecagono1.calcularDatosendecagono();
        endecagono1.imprimirDatosEndecagono();

        //DODECAGONO
        System.out.println("\n");
        Nlados dodecagono1= new Nlados();
        dodecagono1.setTamlado(3);
        dodecagono1.calcularDatosdodecagono();
        dodecagono1.imprimirDatosDodecagono();

        //ESFERA
        System.out.println("\n");
        Figuras_2D esfera1 = new Figuras_2D();
        esfera1.setRadio(3.1);
        esfera1.calcularDatosEsfera();
        esfera1.imprimirDatosEsfera();

        //CILINDRO
        System.out.println("\n");
        Figuras_2D cilindro1 = new Figuras_2D();
        cilindro1.setRadio(4.1);
        cilindro1.setAltura(5);
        cilindro1.calcularDatosCilindro();
        cilindro1.imprimirDatosCilindro();

        //CUBO
        System.out.println("\n");
        Figuras_2D cubo1 = new Figuras_2D();
        cubo1.setArea(5);
        cubo1.calcularDatosCubo();
        cubo1.imprimirDatosCubo();

        //PIRAMIDE
        System.out.println("\n");
        Figuras_2D piramide1 = new Figuras_2D();
        piramide1.setArea(23);
        piramide1.setAltura(5);
        piramide1.calcularDatosPiramide();
        piramide1.imprimirDatosPiramide();

        //PRISMA
        System.out.println("\n");
        Figuras_2D prisma1 = new Figuras_2D();
        prisma1.setArea(14);
        prisma1.setAltura(7);
        prisma1.calcularDatosPrisma();
        prisma1.imprimirDatosPrisma();
    }
}