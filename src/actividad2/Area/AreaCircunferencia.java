package actividad2.Area;


import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = entrada.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es: " + area);
    }
}