package org.iesalandalus.programacion.reservashotel.dominio;

public enum TipoHabitacion {
    SUITE(),SIMPLE(),DOBLE(),TRIPLE();

    private String cadenaAMostrar;
    private int numeroMaximoPersonas;

    private TipoHabitacion(String cadenaAMostrar, int numeroMaximoPersonas){

        this.cadenaAMostrar=cadenaAMostrar;
        this.numeroMaximoPersonas=numeroMaximoPersonas;
    }

    public int getNumeroMaximoPersonas() {
        return numeroMaximoPersonas;
    }

    @Override
    public String toString() {
        return "TipoHabitacion{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                ", numeroMaximoPersonas=" + numeroMaximoPersonas +
                '}';
    }
}
