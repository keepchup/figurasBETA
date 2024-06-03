import FIGURAS.Figuras;
import FIGURAS.Cuadrilateros;
import FIGURAS.Circunferencias;
import FIGURAS.Triangulos;
import FIGURAS.Nlados;
import FIGURAS.Figuras_2D;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n\tCALCULADORA DE FIGURAS\n");
            System.out.println("¡Hola, bienvenido a tu calculadora favorita!\n\nSelecciona una categoria\n");
            System.out.println("\t1. Figuras 2D\n\t2. Figuras 3D\n\t3. Salir\n");
            System.out.print("Ingresa una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nFiguras 2D\n");
                    figuras2D();
                    break;
                case 2:
                    System.out.println("\nFiguras 3D\n");
                    figuras3D();
                    break;
                case 3:
                    System.out.println("¡Gracias por preferirnos!");
                    break;
                default:
                    System.out.println("Ingrese un número válido (1, 2 o 3).");
            }
        } while (op != 3);
    }

    public static void figuras2D() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Circunferencias\n\t2. Triangulos\n\t3. Cuadrilateros\n\t4. Nlados\n\t5. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Circunferencias");
                    break;
                case 2:
                    System.out.println("Triangulos");
                    break;
                case 3:
                    System.out.println("Cuadrilateros");
                    cuadrilateros();
                    break;
                case 4:
                    System.out.println("Figuras de N lados");
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...\n");
                    return;
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4 o 5).");
            }
        } while (op != 5);
    }

    public static void figuras3D() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
            System.out.println("\t1. Esferas\n\t2. Cubos\n\t3. Piramides\n\t4. Prismas\n\t5. Regresar\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Esferas");
                    break;
                case 2:
                    System.out.println("Cubos");
                    break;
                case 3:
                    System.out.println("Piramides");
                    break;
                case 4:
                    System.out.println("Prismas");
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...\n");
                    return;
                default:
                    System.out.println("Ingrese un número válido (1, 2, 3, 4 o 5).");
            }
        } while (op != 5);
    }

    public static void cuadrilateros() {
        Scanner sc = new Scanner(System.in);
        Cuadrilateros c1 = new Cuadrilateros();
        int op;
        do {
            System.out.println("Seleccione que quiere calcular\n");
            System.out.println("\t1. Area\n\t2.Perimetro\n");
            System.out.print("Ingrese el numero de la opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Debe ingresar un número entero.");
                sc.next();
            }
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("\tArea");
                    System.out.println("Ingrese la logitud de un lado del cuadrado");
                    double lado = sc.nextDouble();
                    c1.setBase(lado);
                    c1.calcularDatosCuadrado();
                    c1.imprimirdATOSCuadrado();
                    break;
                case 2:
                    System.out.println("\tPerimetro");
                    break;
                case 3:
                    System.out.println("Regresando al menú...\n");
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1, 2 o 3).");
            }
        } while (op!=3);


    }
}
