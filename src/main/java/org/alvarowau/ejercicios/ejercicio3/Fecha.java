package org.alvarowau.ejercicios.ejercicio3;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "La fecha es: " + dia + " de " + mes + " del " + anio;
    }

    public boolean igual_a_mi(Fecha f) {
        return dia == f.dia && mes == f.mes && anio == f.anio;
    }

    public boolean anterior_a_mi(Fecha f) {
        return (anio < f.anio) || (anio == f.anio && mes < f.mes) || (anio == f.anio && mes == f.mes && dia < f.dia);
    }

    public void incrementa_dias(int nd) {
        int totalDias = dia + nd;
        dia = (totalDias - 1) % 30 + 1;
        int totalMeses = mes + (totalDias - 1) / 30;
        mes = (totalMeses - 1) % 12 + 1;
        anio = anio + (totalMeses - 1) / 12;
    }

    public int dias_hasta_fecha(Fecha f) {
        int dias = 360 * anio + 30 * mes + dia;
        int diasF = 360 * f.anio + 30 * f.mes + f.dia;
        return diasF - dias;
    }
}
