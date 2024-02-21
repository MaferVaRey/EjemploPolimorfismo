package model;

public class Metal extends Musica {
    private String banda;

    public Metal(String banda) {
        this.banda = banda;
    }

    public Metal() {
    }

    @Override
    public String obtenerDescripcion() {
        return "Banda: " + banda + ", " + super.obtenerDescripcion();
    }
}
