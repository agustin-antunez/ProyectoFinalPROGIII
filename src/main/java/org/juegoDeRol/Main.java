package org.juegoDeRol;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {

    private static final String[] nombres = {"Agustin", "Sofia","Gabriel", "Tomas", "Valentina", "Rodrigo", "Nicanor", "Bellatrix", "Bart", "Luly"};
    private static final String[] apodos = {"Dark Night", "Whiplash", "Razor", "Storm Crow", "Highlander", "Night Wolf", "Zeus", "Notoryu","Magnus",
            "Noxius","Immortal","Fallen","Hunter","Ragnar","Mog","Seth","Namish","Maxthon","Pantheon","Siegfried","Aphelion","BlitzWolf","Asesino de noobs",
            "Thorn","Fear","Arrow","Rising","Slayer","Infinite","Huck","Ironfist","Slade","BloodFlare","Krayvhus","Lord Gravius","Executor","Khulhan","Menfis",
            "Nemat", "Se7en", "Sirius", "Divine", "Haddes", "Reaper", "Baldur"};

    public static void main(String[] args) {

        PersonajeFactory[] fabricas = {new HumanoFactory(), new OrcoFactory(), new ElfoFactory()};

        Random rnd = new Random();

        int indiceRandom = rnd.nextInt(fabricas.length);

        PersonajeFactory fabrica = fabricas[indiceRandom];

        Personaje personaje = fabrica.crearPersonaje();


        personaje.setNombre(nombreAleatorio());
        personaje.setApodo(apodoAleatorio());
        personaje.setEdad(rnd.nextInt(40)+1);
        personaje.setNivel(rnd.nextInt(100)+1);
        personaje.setFechaNacimiento(fechaAleatoria());
        personaje.setSalud(saludAleatoria());
        personaje.setArmadura(28);
        personaje.setVelocidad(65);
        personaje.setFuerza(76);
        personaje.setDestreza(35);

        personaje.mostrarInfo();

    }

    public static String nombreAleatorio(){
        Random rnd = new Random();
        int indiceRandom = rnd.nextInt(nombres.length);
        String nombre = nombres[indiceRandom];
        return nombre;
    }

    public static String apodoAleatorio(){
        Random rnd = new Random();
        int indiceRandom = rnd.nextInt(apodos.length);
        String apodo = apodos[indiceRandom];
        return apodo;
    }

    public static String fechaAleatoria(){
        Random rnd = new Random();
        int anio = rnd.nextInt(2023 - 1970 + 1)+1970;
        int mes = rnd.nextInt(12);
        int dia = rnd.nextInt(28)+1;
        Calendar calendario = new GregorianCalendar(anio, mes, dia);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formatoFecha = formatter.format(calendario.getTime());

        return formatoFecha;
    }

    public static int saludAleatoria(){
        Random rnd = new Random();

        Personaje personaje = null;

        if (personaje.getNivel() < 10){
            int saludAleatoria = rnd.nextInt(750)+650;
            return saludAleatoria;
        }
        else if (personaje.getNivel() >= 10 && personaje.getNivel() < 30){
            int saludAleatoria = rnd.nextInt(850)+750;
            return saludAleatoria;
        }
        else if (personaje.getNivel() > 30 && personaje.getNivel() <= 50){
            int saludAleatoria = rnd.nextInt(951)+850;
            return saludAleatoria;
        }
        else if (personaje.getNivel() > 50){
            int saludAleatoria = rnd.nextInt(1200)+951;
            return saludAleatoria;
        }
        return 0;
    }

}