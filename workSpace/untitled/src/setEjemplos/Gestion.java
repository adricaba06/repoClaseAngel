package setEjemplos;

import java.util.HashSet;
import java.util.Set;

public class Gestion {

    Set<Producto> productos;

    public Gestion(Set<Producto> productos) {
        this.productos = productos;
    }


    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public Producto buscarProducto(int id) {

        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public boolean borrarPorId(int id){
        Producto p = buscarProducto(id);

        if(p != null){
            productos.remove(p);
            return true;
        }else{
            return false;
        }

    }

    public boolean editarPrecioPorId(int id, double precio){
        Producto p = buscarProducto(id);

        if(p != null){
            p.setPrecio(precio);
            return true;
        }else{
            return false;
        }
    }

    public double calcularRecaudado(){
        return productos.stream().filter(p -> p.isComprado())
                .mapToDouble(p -> p.getPrecio()).sum();
    }

    public boolean comprarProducto(int id){
        Producto p = buscarProducto(id);

        if(p != null){
            p.setComprado(true);
            return true;
        }else{
            return false;
        }
    }


    public void imprimirLista(){
        for(Producto p: productos){
            System.out.println(p);
        }
    }







}
