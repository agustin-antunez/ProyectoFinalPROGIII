package org.juegoDeRol;

public class ElfoFactory implements PersonajeFactory{

    @Override
    public Personaje crearPersonaje() {
        return  new Elfo();
    }
}
