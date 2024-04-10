package org.alvarowau.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ENUNCIADO:
 *
 * Se desea escribir un programa que permita operar con números naturales entre 1 y 999 ingresados
 * por el usuario. Se estará leyendo números hasta que el usuario pulse un número no valido (menor que 1 o
 * mayor de 999. Ese número que termina el proceso no debe procesarse).
 * Al finalizar (después de que el usuario haya pulsado un valor no válido) debe mostrarnos los siguientes
 * resultados: si se ha procesado algún número perfecto o no (mostrará “si” hay perfectos o “no” hay perfectos,
 * usando el operador condicional), cuántos números pares se han procesado, la suma de los impares procesados
 * y cuales son el mayor y el menor de los números procesados.
 * Un número es perfecto y es igual a la suma de sus divisores. Por ejemplo, el 4 no lo es (4 <> 1+2) pero
 * el 6 si (6 == 1+2+3). Se debe definir un subprograma que nos diga si un número es perfecto, y utilizarlo en el
 * programa principal. (1 punto el subprograma y 1,5 puntos el resto del programa)
 */
public class Ejercicio2 {

    /**
     * Método principal para iniciar el ejercicio.
     * Se encarga de recoger números ingresados por el usuario, hasta que se ingrese un número no válido,
     * y luego llama al método para calcular si los números son perfectos.
     */
    public static void empezarEjercicio() {
        // Lista para almacenar los números ingresados por el usuario
        ArrayList<Integer> listanumeros = new ArrayList<>();
        int indice;
        // Bucle para recoger números hasta que se ingrese un número no válido
        do {
            indice = recogerNumeros();
            // Si el número es válido (entre 1 y 999), se agrega a la lista
            if (indice >= 1 && indice <= 999) {
                listanumeros.add(indice);
            } else {
                System.out.println("calculado...");
                break; // Se sale del bucle si se ingresa un número no válido
            }
        } while (true);
        // Se llama al método para calcular si los números son perfectos
        cacularNumeros(listanumeros);
    }

    /**
     * Calcula si los números de la lista son perfectos o no, y muestra los resultados.
     * @param listanumeros La lista de números ingresados por el usuario.
     */
    private static void cacularNumeros(ArrayList<Integer> listanumeros) {
        // Lista para almacenar la solución (si el número es perfecto o no)
        ArrayList<String> listasolucion = new ArrayList<>();
        // Agrega el resultado de si el número es perfecto o no a la lista de soluciones
        for(Integer numero : listanumeros) listasolucion.add("El número " + numero + (esNumeroPerfecto(numero) ? " es perfecto" : " no es perfecto"));

        // Imprime las soluciones en la consola
        for(String a: listasolucion) System.out.println(a);

    }


    /**
     * Verifica si un número es perfecto.
     * @param numero El número que se va a verificar.
     * @return true si el número es perfecto, false de lo contrario.
     */
    private static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = calcularSumaDivisores(numero);
        return sumaDivisores == numero;
    }

    /**
     * Calcula la suma de los divisores de un número.
     * @param numero El número del cual se calculará la suma de los divisores.
     * @return La suma de los divisores del número.
     */
    private static int calcularSumaDivisores(int numero) {
        int suma = 0;
        // Iteramos hasta la mitad del número para encontrar los divisores
        for (int i = 1; i <= numero / 2; i++) {
            // Verificamos si 'i' es un divisor de 'numero'
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }



    /**
     * Recoge un número ingresado por el usuario.
     * @return El número ingresado por el usuario.
     */
    private static int recogerNumeros() {
        Scanner entrada = new Scanner(System.in);
        String numeroTxt;
        do {
            System.out.println("Ingrese un numero entre 1 y 999: (si mete uno que no sea entre estos valores terminara el programa)");
            numeroTxt = entrada.nextLine();
        } while (!isNumero(numeroTxt));
        return Integer.parseInt(numeroTxt);
    }

    /**
     * Verifica si una cadena es un número válido.
     * @param numeroTxt La cadena que se desea verificar.
     * @return true si la cadena representa un número válido, false de lo contrario.
     */
    private static boolean isNumero(String numeroTxt) {
        try {
            Integer.parseInt(numeroTxt);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Digite un numero valido");
            return false;
        }
    }
}
