package treeMapEjemplo;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {


        int respuesta = 0;
        boolean repetir = true;

        String firstLetter;
        String secondLetter;

        String ciudad, descripcion;
        double temperatura;

        Scanner sc = new Scanner(System.in);


        TreeMap<String, TemperatureRegister> mapa = new TreeMap<>();

        String ciudadABuscar;

        mapa.put("Madrid", new TemperatureRegister(LocalDate.now(), 18.2, "Calor suave"));
        mapa.put("Barcelona", new TemperatureRegister(LocalDate.now(), 19.4, "Nublado"));
        mapa.put("Bilbao", new TemperatureRegister(LocalDate.now(), 15.8, "Lluvia"));
        mapa.put("Valencia", new TemperatureRegister(LocalDate.now(), 21.3, "Soleado"));

        TemperatureService service = new TemperatureService(mapa);


        System.out.println("Bienvenido al sistema de temperaturas por ciudad");

        while (repetir) {

            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Añadir registro");
            System.out.println("2. Buscar registro por ciudad");
            System.out.println("3. Eliminar registro");
            System.out.println("4. Editar temperatura");
            System.out.println("5. Ver todos");
            System.out.println("6. Buscar por rango");
            System.out.println("7. Salir");

            respuesta = sc.nextInt();

            switch (respuesta) {

                case 1:
                    System.out.println("Introduzca la ciudad:");
                    ciudad = sc.next();

                    System.out.println("Introduzca la temperatura:");
                    temperatura = sc.nextDouble();

                    System.out.println("Introduzca la descripción:");
                    descripcion = sc.next();

                    service.addTemperatureRegister(
                            new TemperatureRegister(LocalDate.now(), temperatura, descripcion),
                            ciudad
                    );

                    System.out.println("Registro añadido.");
                    break;

                case 2:
                    System.out.println("Introduzca la ciudad a buscar:");
                    ciudadABuscar = sc.next();

                    TemperatureRegister regBuscado = service.findByCiudad(ciudadABuscar);

                    if (regBuscado != null) {
                        System.out.println(regBuscado);

                        boolean seguirMenu = true;

                        while (seguirMenu) {
                            System.out.println("\n¿Qué desea hacer?");
                            System.out.println("1. Ver registro anterior");
                            System.out.println("2. Ver registro siguiente");
                            System.out.println("3. Salir al menú principal");

                            int op2 = sc.nextInt();

                            switch (op2) {
                                case 1:
                                    TemperatureRegister anterior = service.getPreviousRegister(ciudadABuscar);

                                    if (anterior != null) {
                                        System.out.println("Anterior: " + anterior);
                                    } else {
                                        System.out.println("No existe ciudad anterior.");
                                    }
                                    break;

                                case 2:
                                    TemperatureRegister siguiente = service.getFollowingRegister(ciudadABuscar);

                                    if (siguiente != null) {
                                        System.out.println("Siguiente: " + siguiente);
                                    } else {
                                        System.out.println("No hay ciudad siguiente.");
                                    }
                                    break;

                                case 3:
                                    seguirMenu = false;
                                    break;

                                default:
                                    System.out.println("Opción inválida");
                            }
                        }

                    } else {
                        System.out.println("No existe un registro con esa ciudad.");
                    }

                    break;

                case 3:
                    System.out.println("Introduzca la ciudad a eliminar:");
                    ciudadABuscar = sc.next();

                    if (service.deleteRegisterByCity(ciudadABuscar)) {
                        service.deleteRegisterByCity(ciudadABuscar);
                        System.out.println("Eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró esa ciudad.");
                    }
                    break;

                case 4:
                    System.out.println("Introduzca la ciudad a editar:");
                    ciudadABuscar = sc.next();

                    System.out.println("Introduzca la nueva temperatura:");
                    temperatura = sc.nextDouble();

                    if (service.editTemperature(ciudadABuscar, temperatura)) {
                        System.out.println("Editado correctamente.");
                    } else {
                        System.out.println("No se encontró esa ciudad.");
                    }
                    break;

                case 5:
                    service.listAll();
                    break;


                case 6:

                    System.out.println("Introduce la letra que defina el rango del principio");
                    firstLetter = sc.next();
                    System.out.println("Hasta...");
                    secondLetter = sc.next();

                    System.out.println(service.getTemperaturebetweenCityLetters(firstLetter, secondLetter));

                    break;

                case 7:
                    repetir = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } // while

    } // main
}
