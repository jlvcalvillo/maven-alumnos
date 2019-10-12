package com.automation.alumnos;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    private ArrayList<Mascota> mascotas;

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.mascotas = new ArrayList<Mascota>();
    }

    public void setMascotas(Mascota mascota){
        this.mascotas.add(mascota);
    }

    public String toString(){
        String aux = "";
        aux = "----------------------------------------------------------------------------------------\n";
        aux += "Alumno: " + this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno + "\n";
        aux += "Mascotas: \n";
        for ( Mascota m : mascotas) {
            aux += m.toString();
        }
        aux += "----------------------------------------------------------------------------------------";
        return aux;
    }

}
