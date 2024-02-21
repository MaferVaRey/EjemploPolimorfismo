package model;

public class Pop extends Musica{
    private String cantante;

    public Pop(String cantante) {
        this.cantante = cantante;
    }

    public Pop() {
    }

    @Override
    public String obtenerDescripcion() {
        return "Cantante: " + cantante + ", " + super.obtenerDescripcion();
    }
}
