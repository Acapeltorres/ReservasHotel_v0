package org.iesalandalus.programacion.reservashotel.dominio;

import java.time.LocalDate;

public class Huesped {
    private static final String ER_TELEFONO="[0-9] {9}";
    private static final String ER_CORREO;
    private static final String ER_DNI="([0-9]{8}) ([a-zA-Z])";
    public static final String FORMATO_FECHA;
    private String nombre;
    private String telefono;
    private String correo;
    private String dni;
    private LocalDate fechaNacimiento;

    public Huesped(String nombre, String dni, String correo, String telefono, LocalDate fechaNacimiento){

        setNombre(nombre);
        setDni(dni);
        setCorreo(correo);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);

    }


    public Huesped(Huesped huesped){

        if (huesped==null){
            throw new NullPointerException("ERROR: no puede haber un huesped nulo");
        }

        setNombre(huesped.getNombre());
        setDni(huesped.getDni());
        setCorreo(huesped.getCorreo());
        setTelefono(huesped.getTelefono());
        setFechaNacimiento(huesped.getFechaNacimiento());

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private String formateaNombre(String nombre){



    }


}
