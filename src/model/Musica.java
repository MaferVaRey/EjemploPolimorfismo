package model;

public class Musica {
    protected String cancion;

    public void asignarNombreCancion(String nombreCancion) {
        this.cancion = nombreCancion;
    }

    public String obtenerDescripcion() {
        return "Canción: " + cancion;
    }
}
