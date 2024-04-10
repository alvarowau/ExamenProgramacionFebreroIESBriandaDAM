package org.alvarowau.ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 * ENUNCIADO
 *
 * Crea en un paquete una clase pública Fecha que incluya lo normal, es decir, los 3 atributos día, mes y
 * año (el mes puede ser enum (como en la tarea) o no), un constructor que los reciba como parámetro, los 3
 * métodos set y los 3 get, y un toString que nos muestre la fecha. (1 punto).
 * Además, debe tener los métodos siguientes: (1 punto)
 * • igual_a_mi: Recibe una fecha y nos dice si es igual a la del objeto que ejecuta el método o no.
 * • anterior_a_mi: Recibe una fecha y nos dice si es anterior a la del objeto que ejecuta el método o no.
 * • incrementar_dias: Recibe un número de días y traslada la fecha del objeto que ejecuta el método esa
 * cantidad de días. Podemos suponer meses de 30 días.
 * • dias_hasta_fecha: Reciba una fecha y nos dice cuantos días faltan desde la fecha del objeto que la ejecuta
 * hasta la que se recibe.
 * Crea en el mismo paquete una clase GestionFechas que incluya un programa principal que cree 3
 * fechas de días, meses y años diferentes (inventa los datos), y usando las funciones anteriores: (1 punto)
 * - Las muestre por pantalla ordenadas cronológicamente.
 * - Nos muestre los días que faltan para llegar a la fecha mayor desde la fecha menor.
 * - Incremente esa cantidad de días la fecha menor.
 * - Nos diga si después del incremento anterior ambas son iguales o no
 */
public class GestionFechas {

    /**
     * Método principal para iniciar el ejercicio.
     */
    public static void empezarEjercicio() {
        // Crear una lista para almacenar las fechas
        List<Fecha> fechas = new ArrayList<>();
        fechas.add(new Fecha(13, 1, 2015));
        fechas.add(new Fecha(15, 7, 2012));
        fechas.add(new Fecha(19, 6, 2011));

        // Imprimir las fechas creadas
        System.out.println("Fechas:");
        for (Fecha fecha : fechas) {
            System.out.println(fecha);
        }

        // Obtener la fecha menor y la fecha mayor
        Fecha menor = obtenerMenor(fechas);
        Fecha mayor = obtenerMayor(fechas);

        // Imprimir las fechas ordenadas
        System.out.println("\nOrdenadas:");
        System.out.println("Fecha anterior:\n" + menor);
        System.out.println("Fecha posterior:\n" + mayor);

        // Calcular la diferencia de días entre las fechas
        int diasDiferencia = menor.dias_hasta_fecha(mayor);
        System.out.println("\nDiferencia de días entre fechas: " + diasDiferencia);

        // Incrementar la fecha menor y verificar si es igual a la fecha mayor
        menor.incrementa_dias(diasDiferencia);
        if (menor.igual_a_mi(mayor))
            System.out.println("Las fechas son iguales después del incremento.");
        else
            System.out.println("Las fechas son distintas después del incremento.");
    }

    /**
     * Método para obtener la fecha menor de una lista de fechas.
     *
     * @param fechas Lista de fechas.
     * @return La fecha menor.
     */
    private static Fecha obtenerMenor(List<Fecha> fechas) {
        Fecha menor = fechas.get(0); // Inicializar con la primera fecha
        for (Fecha fecha : fechas) {
            if (fecha.anterior_a_mi(menor)) {
                menor = fecha; // Actualizar si encontramos una fecha menor
            }
        }
        return menor;
    }

    /**
     * Método para obtener la fecha mayor de una lista de fechas.
     *
     * @param fechas Lista de fechas.
     * @return La fecha mayor.
     */
    private static Fecha obtenerMayor(List<Fecha> fechas) {
        Fecha mayor = fechas.get(0); // Inicializar con la primera fecha
        for (Fecha fecha : fechas) {
            if (fecha.anterior_a_mi(mayor)) {
                mayor = fecha; // Actualizar si encontramos una fecha mayor
            }
        }
        return mayor;
    }
}

