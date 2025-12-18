package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre, apellidos, nombreCurso;
    private double nota_media;
    private int edad;


    public Alumno(String nombre, String apellidos, String nombreCurso, double nota_media, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreCurso = nombreCurso;
        this.nota_media = nota_media;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", nota_media=" + nota_media +
                ", edad=" + edad +
                '}';
    }
}
