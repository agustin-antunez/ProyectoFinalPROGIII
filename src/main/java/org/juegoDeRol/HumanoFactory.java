package org.juegoDeRol;

public class HumanoFactory implements PersonajeFactory {
    @Override
    public Personaje crearPersonaje() {
        return new Humano();
    }
}
