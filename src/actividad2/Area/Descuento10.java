package actividad2.Area;

import java.util.Scanner;

public class Descuento10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        double compra = entrada.nextDouble();
        double descuento = compra * 0.10;
        double total = compra - descuento;
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}