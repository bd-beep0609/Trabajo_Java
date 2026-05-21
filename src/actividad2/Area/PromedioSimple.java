package actividad2.Area;

import java.util.Scanner;

public class PromedioSimple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = entrada.nextDouble();
        double promedio = (n1 + n2 + n3) / 3;
        System.out.println("Promedio: " + promedio);
        if (promedio >= 6) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
}
