package org.alvarowau.ejercicios;

import java.util.Scanner;

/**
 * ENUNCIADO:
 *
 * Queremos mostrar tablas de multiplicar realizando los cálculos utilizando las sumas en vez de
 * multiplicaciones (por ejemplo: 3 x 2 = 3 + 3). No se puede usar el símbolo de multiplicar.
 * -Escribir un subprograma que reciba un número y muestre por pantalla su tabla de multiplicar del 1 al 10
 * mediante sumas sucesivas. (1,5 puntos)
 * - Escribir un programa que, haciendo uso del subprograma desarrollado en el punto anterior, muestre varias
 * tablas de multiplicar que le indique el usuario. Para ello, se le solicitará la primera y la última, y se mostrarán
 * todas las comprendidas entre esos valores límite. (1 punto)
 */
public class Ejercicio1 {

    /**
     * Método principal que inicia el ejercicio de generar y mostrar tablas de multiplicar.
     */
    public static void empezarEjercicio() {
        // Solicitar al usuario la cantidad de tablas que desea generar
        int cantidadTablas = recogerPorTeclado("Digite la cantidad de tablas que desea generar:");

        // Crear un arreglo de arreglos de cadenas para almacenar las tablas de multiplicar
        String[][] tablas = new String[cantidadTablas][11];

        // Generar y almacenar las tablas de multiplicar en el arreglo de arreglos
        for (int i = 0; i < cantidadTablas; i++) {
            // Solicitar al usuario el número para la tabla actual
            int numero = recogerPorTeclado("Digite el número de la tabla " + (i + 1) + ":");
            // Generar la tabla de multiplicar para el número dado y almacenarla en el arreglo
            tablas[i] = tablasMultiplicar(numero);
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < cantidadTablas; i++) {
            // Imprimir cada fila de la tabla de multiplicar actual --> pongo 11 porque la tabla viene con título
            for (int j = 0; j < 11; j++) {
                System.out.println(tablas[i][j]);
            }
            System.out.println(); // Agregar una línea en blanco entre cada tabla de multiplicar
        }
    }


    /**
     * Recoge un número desde la entrada de consola.
     *
     * @param txt El mensaje que se muestra para solicitar el número.
     * @return El número recogido desde la entrada de consola.
     */
    private static int recogerPorTeclado(String txt) {
        // Inicialización de un objeto Scanner para la entrada de consola
        Scanner entrada = new Scanner(System.in);
        // Variable para almacenar la entrada del usuario
        String recogido = "";
        do {
            // Muestra el mensaje para solicitar el número
            System.out.println(txt);
            // Lee la entrada del usuario
            recogido = entrada.nextLine();
        } while (!isNumero(recogido)); // Repite el proceso mientras la entrada no sea un número válido
        return Integer.parseInt(recogido); // Devuelve el número convertido de la cadena ingresada por el usuario
    }


    /**
     * Verifica si una cadena representa un número entero mayor que 0.
     *
     * @param recogido La cadena a verificar.
     * @return true si la cadena es un número entero mayor que 0, de lo contrario false.
     */
    private static boolean isNumero(String recogido) {
        int numero; // Variable para almacenar el número convertido de la cadena
        try {
            // Intenta convertir la cadena a un entero
            numero = Integer.parseInt(recogido);
            // Devuelve true si el número es mayor que 0
            return numero > 0;
        } catch (NumberFormatException e) {
            // Si ocurre una excepción al convertir la cadena, imprime un mensaje de error
            System.out.println("Debe ser un número entero mayor a 0.");
            // Devuelve false ya que la cadena no representa un número entero mayor que 0
            return false;
        }
    }


    /**
     * Genera las tablas de multiplicar para un número dado.
     *
     * @param numero El número para el que se generará la tabla de multiplicar.
     * @return Un arreglo de cadenas que representa la tabla de multiplicar del número dado.
     */
    private static String[] tablasMultiplicar(int numero) {
        // Crear un arreglo para almacenar las cadenas de la tabla de multiplicar
        String[] tabla = new String[11];
        tabla[0] = "La tabla del numero: " + numero;

        // Iterar sobre los números del 1 al 10 para generar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            int p = 0;

            // Calcular el resultado de la multiplicación mediante sumas sucesivas
            for (int j = 1; j <= i; j++) {
                p = p + numero;
            }

            // Crear un String con el resultado de la multiplicación y almacenarlo en el arreglo

            tabla[i] = numero + " por " + i + " es " + p;
        }

        // Devolver el arreglo de tablas generado
        return tabla;
    }

}
