package actividad2.Area;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el cateto A: ");
        double catetoA = entrada.nextDouble();
        System.out.print("Ingrese el cateto B: ");
        double catetoB = entrada.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
