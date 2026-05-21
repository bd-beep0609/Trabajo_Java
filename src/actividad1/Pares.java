package actividad1;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR");
        } else {
            System.out.println("El número " + numero + " es IMPAR");
        }
    }
}