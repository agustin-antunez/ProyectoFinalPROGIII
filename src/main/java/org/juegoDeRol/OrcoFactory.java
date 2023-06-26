package org.juegoDeRol;

public class OrcoFactory implements PersonajeFactory{
    @Override
    public Personaje crearPersonaje() {
        return new Orco();
    }
}
