/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclooperacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class CicloOperacionesBasicas {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("Menú de Operaciones");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción deseada:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }

    private static void realizarSuma(Scanner scanner) {
        System.out.println("Ingrese la cantidad de números a sumar:");
        int cantidadNumeros = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("El resultado de la suma es: " + suma);
    }

    private static void realizarResta(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        int resta = numero1 - numero2;

        System.out.println("El resultado de la resta es: " + resta);
    }

    private static void realizarMultiplicacion(Scanner scanner) {
        System.out.println("Ingrese la cantidad de números a multiplicar:");
        int cantidadNumeros = scanner.nextInt();

        int multiplicacion = 1;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            multiplicacion *= numero;
        }

        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }

    private static void realizarDivision(Scanner scanner) {
        System.out.println("Ingrese el dividendo:");
        double dividendo = scanner.nextDouble();

        System.out.println("Ingrese el divisor:");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double division = dividendo / divisor;
            System.out.println("El resultado de la división es: " + division);
        } else {
            System.out.println("No es posible dividir entre cero.");
        }
    }
}