package org.alvarowau;

import org.alvarowau.ejercicios.Ejercicio1;
import org.alvarowau.ejercicios.Ejercicio2;
import org.alvarowau.ejercicios.ejercicio3.GestionFechas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            // Leer la opción del usuario
            opcion = sc.nextInt();

            // Ejecutar el ejercicio seleccionado
            switch (opcion) {
                case 1:
                    Ejercicio1.empezarEjercicio();
                    break;
                case 2:
                    Ejercicio2.empezarEjercicio();
                    break;
                case 3:
                    GestionFechas.empezarEjercicio();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
