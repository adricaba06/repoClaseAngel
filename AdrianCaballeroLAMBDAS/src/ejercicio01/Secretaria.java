package ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Secretaria {

    private List<Alumno> lista;

    public Secretaria(List<Alumno> lista) {
        this.lista = lista;
    }

    public List<Alumno> getLista() {
        return lista;
    }

    public void setLista(List<Alumno> lista) {
        this.lista = lista;
    }

    public void getAllAlumnos() {
        lista.stream()
                .forEach(a -> System.out.println(a));
    }

    public List<Alumno> getAlumnosThatStartsWith(String letter) {
        return lista.stream()
                .filter(a -> a.getNombre()
                        .startsWith(letter))
                .collect(Collectors
                        .toList());

    }

    public Long getListSize(){ //Recordar: count devuelve un long
        return lista.stream().count();
    }

    public List<Alumno> getAlumnoWhoseGradesAreAbove(double grade){
        return lista.stream()
                .filter(a -> a.getNota_media() > grade)
                .collect(Collectors.toList());
    }

    public List<Alumno> getSomeStudents(int quantity){
        return lista.stream()
                .limit(quantity)
                .collect(Collectors
                        .toList());

    }

    public Alumno getYoungestStudent() {
        Alumno alumnoMasJoven = lista.stream()
                .min(Comparator.comparingInt(a -> a.getEdad()))
                .orElse(null);

      return alumnoMasJoven;

    }

    public Alumno getFristAlumno(List<Alumno> lista) {
        return lista.stream().findFirst().orElse(null);

    }

    public List<Alumno> getAlumnosNombreMayorA(List<Alumno> lista, int n) {
        return lista.stream()
                .filter(a -> a.getNombre().length() > n)
                .toList();  //preguntar a angel
    }

    public List<Alumno> getAlumnosConAyLongitudMax(List<Alumno> lista, int maxLength) {
        return lista.stream()
                .filter(a -> a.getNombre().startsWith("A") && a.getNombre().length() <= maxLength)
                .toList();
    }



}
