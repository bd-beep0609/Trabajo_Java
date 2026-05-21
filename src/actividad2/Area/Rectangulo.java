package actividad2.Area;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
