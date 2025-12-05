package setEjemplos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Producto> productosSet = new HashSet<>();
        Producto p1 = new Producto(1, "katana mata alumnos", 100, true);
        Producto p2 = new Producto(2, "Cuaderno", 6, false);
        Producto p3 = new Producto(3, "Naranja", 0.7, false);

        productosSet.add(p1);
        productosSet.add(p2);
        productosSet.add(p3);

        Gestion gestion = new Gestion(productosSet);

        int opcion;
        int id;
        String nombre;
        double precio;
        int contadorId = 3;

        boolean repetir = true;

        System.out.println("Bienvenido a la app de gestion de productos");

        while (repetir) {

            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por ID");
            System.out.println("3. Editar precio por ID");
            System.out.println("4. Borrar producto por ID");
            System.out.println("5. Listar productos");
            System.out.println("6. Comprar producto");
            System.out.println("7. Mostrar todos");
            System.out.println("8. Calcular recaudado");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    contadorId += 1;
                    System.out.print("Nombre del producto: ");
                    nombre = sc.next();

                    System.out.print("Precio del producto: ");
                    precio = sc.nextDouble();
                    while(precio <= 0){
                        System.out.println("Invalido, introduzca el precio otra vez");
                        precio = sc.nextDouble();
                    }
                    gestion.agregarProducto(new Producto(contadorId, nombre, precio, false));

                    System.out.println("Producto agregado.");
                    break;

                case 2:
                    System.out.print("id del producto a buscar: ");
                    id = sc.nextInt();
                    Producto pBuscar = gestion.buscarProducto(id);

                    if (pBuscar != null) {
                        System.out.println("Producto encontrado: " + pBuscar);

                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("id del producto a editar: ");
                    id = sc.nextInt();

                    System.out.print("nuevo precio: ");
                    precio = sc.nextDouble();

                    if (gestion.editarPrecioPorId(id, precio)) {
                        System.out.println("Precio actualizado correctamente.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("id del producto a borrar: ");
                    id = sc.nextInt();

                    if (gestion.borrarPorId(id)) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Lista de productos:");
                    for (Producto prod : gestion.getProductos()) {
                        System.out.println(prod);
                    }
                    break;

                case 6:
                    System.out.println("Indique el id del producto");
                    id = sc.nextInt();

                    if(gestion.comprarProducto(id)){
                        gestion.comprarProducto(id);
                        System.out.println("Producto comprado");
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 7:
                    gestion.imprimirLista();
                    break;

                case 8:
                    System.out.println("Dinero recaudado:");
                    System.out.println(gestion.calcularRecaudado());
                    break;

                case 9:
                    repetir = false;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
