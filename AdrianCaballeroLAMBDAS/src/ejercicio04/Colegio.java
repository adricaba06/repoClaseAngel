package ejercicio04;

import java.util.List;
import java.util.Optional;

public class Colegio {

    private List<Empleado> lista;

    public Colegio(List<Empleado> lista) {
        this.lista = lista;
    }

    public List<Empleado> getLista() {
        return lista;
    }

    public void setLista(List<Empleado> lista) {
        this.lista = lista;
    }

    public List<Empleado> getEmpleadosActivos(){
        return lista.stream().filter(a -> a.isActivo()).toList();
    }

    public Optional<Empleado> findByName(String name){
        return lista.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(name)).findFirst();
    }





}
