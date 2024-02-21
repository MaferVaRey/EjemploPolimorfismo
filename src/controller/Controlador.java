package controller;

import model.*;
import view.Vista;

public class Controlador {
    private Vista vista = new Vista();

    public void asignarNombreCancion(Musica musica, String nombreCancion) {
        musica.asignarNombreCancion(nombreCancion);
    }

    public void mostrarDescripcion(Musica musica) {
        String descripcion = musica.obtenerDescripcion();
        vista.imprimirCancion(descripcion);
    }

    public void funcionar() {

        Musica metal = new Metal("Nightwish");
        Musica pop = new Pop("Michael Jackson");


        asignarNombreCancion(metal, "She is my sin");
        asignarNombreCancion(pop, "Thriller");


        mostrarDescripcion(metal);
        mostrarDescripcion(pop);
    }
}