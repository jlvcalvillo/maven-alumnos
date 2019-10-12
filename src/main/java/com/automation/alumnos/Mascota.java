package com.automation.alumnos;

public class Mascota {

    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString(){
        return "Nombre: " + this.nombre + ", edad: " + this.edad + "\n";
    }
}
