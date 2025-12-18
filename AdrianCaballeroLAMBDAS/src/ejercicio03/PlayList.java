package ejercicio03;

import java.util.List;

public class PlayList {

    private List<Cancion> lista;

    public PlayList(List<Cancion> lista) {
        this.lista = lista;
    }

    public List<Cancion> getLista() {
        return lista;
    }

    public void setLista(List<Cancion> lista) {
        this.lista = lista;
    }

    public Cancion findByName(String name) {
        return lista.stream()
                .filter(c -> c.getNombre()
                        .equalsIgnoreCase(name))
                .findFirst().orElse(null);

    }

    public List<Cancion> findByGenero(String genero) {
        return lista.stream()
                .filter(c -> c.getGenero().equalsIgnoreCase(genero))
                .toList();
    }


    public List<Cancion> findByAuthor(String autor) {
        return lista.stream()
                .filter(c -> c.getAutor().equalsIgnoreCase(autor))
                .toList();
    }


    public List<Cancion> getSongsByDuration(double duration){
        return lista.stream()
                .filter(c -> c.getDuracionMin() >= duration).toList();
    }




}
