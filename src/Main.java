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
        System.out.println("\n\tCALCULADORA DE FIGURAS\n");
        System.out.println("¡Hola, bienvenido a tu calculadora favorita!\n\nSelecciona una categoria\n");
        System.out.println("\t1. Figuras_2D\n\t2. Figuras_3D\n\t3. Salir\n");
        int op = sc.nextInt();
        do {
            switch (op){
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
            }
        } while (op!=3);
    }

    public static void figuras2D(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
        System.out.println("\t1. Circunferencias\n\t2. Triangulos\n\t3. Cuadrilateros\n\t4. Nlados\n\t5. Regresar\n");
        int op = sc.nextInt();

        do {
            switch (op){
                case 1:
                    System.out.println("Circunferencias");
                    break;
                case 2:
                    System.out.println("Triangulos");
                    break;
                case 3:
                    System.out.println("Cuadrilateros");
                    break;
                case 4:
                    System.out.println("Figuras de N lados");
                    break;
                case 5:
                    System.out.println("Regresando");
                    return;
            }
        } while (op!=5);

    }

    public static void figuras3D(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeleccione la figura de la cual quieras calcular\n");
        System.out.println("\t1. Esferas\n\t2. Cubos\n\t3. Piramides\n\t4. Prismas\n\t5. Regresar\n");
        int op = sc.nextInt();

        do {
            switch (op){
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
                    System.out.println("Regresando");
                    return;
            }
        } while (op!=5);
    }
}