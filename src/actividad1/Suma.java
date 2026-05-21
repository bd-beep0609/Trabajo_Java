package actividad1;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Escribe el segundo número: ");
        int num2 = entrada.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }
}