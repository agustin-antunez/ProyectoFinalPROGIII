package org.juegoDeRol;

public class Humano extends Personaje{

    @Override
    public void mostrarInfo() {
        System.out.println("Raza: Humano");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apodo: " + getApodo());
        System.out.println("Fecha de nacimiento: " + getFechaNacimiento());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salud: " + getSalud());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Destreza: " + getDestreza());
        System.out.println("Fuerza: " + getFuerza());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Armadura: " + getArmadura());
    }
}
