package com.automation.alumnos;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Programa de alumnos y mascotas");
        Alumno Samuel = new Alumno("Samuel", "Montiel", "Santos");
        Mascota mascota1 = new Mascota("Snopy", 4);
        Mascota mascota2 = new Mascota("Felix el gato", 6);
        Samuel.setMascotas(mascota1);
        Samuel.setMascotas(mascota2);
        System.out.println(Samuel.toString());
    }
}
