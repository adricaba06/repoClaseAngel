package mapEjemplo;

import java.util.HashMap;
import java.util.Map;

public class Gestion {

    private Map<Alumno, Double> listado; // alumno y nota media


    public Gestion(Map<Alumno, Double> listado) {
        this.listado = listado;
    }

    public Map<Alumno, Double> getListado() {
        return listado;
    }

    public void setListado(Map<Alumno, Double> listado) {
        this.listado = listado;
    }

    //---------------------

    public Alumno buscarPorId(int id){

        for(Map.Entry<Alumno, Double> entry : listado.entrySet()){
            if(entry.getKey().getId() == id){
                return entry.getKey();
            }
        }
    return null;
    } //https://codegym.cc/es/groups/posts/es.797.como-iterar-un-mapa-en-java

    public void agregarAlumno(Alumno a, double nota){
        listado.put(a, nota);
    }

    public boolean deleteAlumno(int id){
        Alumno a = buscarPorId(id);

        if(a != null){
            listado.remove(a);
            return true;
        }else {
            return false;
        }

    }

    public boolean editarNotaAlumno(int id, double nuevaNota){
        Alumno a = buscarPorId(id);

        if(a != null){
            listado.replace(a, nuevaNota);
            return true;
        }else{
            return false;
        }
    }// https://docs.vultr.com/java/standard-library/java/util/HashMap/replace


    public Map<Alumno, Double> listarAlumnosAprobados(){
        Map<Alumno, Double> aprobados = new HashMap<>();

        for(Map.Entry<Alumno, Double> entry: listado.entrySet()){
            if(entry.getValue() >= 5){
                aprobados.put(entry.getKey(), entry.getValue());
            }
        }
        return aprobados;
    }

    public void listarTodos(){
        for(Map.Entry<Alumno, Double> entry: listado.entrySet()){
            System.out.println("Alumno: " + entry.getKey());
            System.out.println("Notas:" + entry.getValue());
            System.out.println("---------------------------");
        }
    }


    @Override
    public String toString() {
        return "Gestion{" +
                "listado=" + listado +
                '}';
    }
}
