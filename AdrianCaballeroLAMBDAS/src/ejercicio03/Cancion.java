package ejercicio03;

public class Cancion {

    private String nombre, autor, genero;
    private double duracionMin;

    public Cancion(String nombre, String autor, String genero, double duracionMin) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", duracionMin=" + duracionMin +
                '}';
    }
}
