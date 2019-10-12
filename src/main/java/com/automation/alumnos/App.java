package com.automation.alumnos;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Programa de alumnos y mascotas");
        Alumno Samuel = new Alumno("Samuel", "Montiel", "Santos");
        Alumno Ulises = new Alumno("Ulises", "","");
        Alumno Monica = new Alumno("Monica", "", "Luna");
        Alumno Sandra = new Alumno("Sandra", "", "Peralta");
        Alumno Karen = new Alumno("Karen", "", "");
        Alumno Abi = new Alumno("Abigail", "","");
        Mascota mascota1 = new Mascota("Snopy", 4);
        Mascota mascota2 = new Mascota("Felix el gato", 6);
        Mascota mascota3 = new Mascota("bugs bunny", 3);
        Mascota mascota4 = new Mascota("Porky", 9);
        Mascota mascota5 = new Mascota("Piolin", 1);
        Mascota mascota6 = new Mascota("Lucas", 3);
        Mascota mascota7 = new Mascota("Claudio", 5);

        Samuel.setMascotas(mascota1);
        Samuel.setMascotas(mascota7);
        Ulises.setMascotas(mascota2);
        Monica.setMascotas(mascota3);
        Sandra.setMascotas(mascota4);
        Karen.setMascotas(mascota5);
        Abi.setMascotas(mascota6);

        System.out.println(Monica.toString());
        System.out.println(Sandra.toString());
        System.out.println(Karen.toString());
        System.out.println(Abi.toString());
        System.out.println(Samuel.toString());
        System.out.println(Ulises.toString());
    }
}
