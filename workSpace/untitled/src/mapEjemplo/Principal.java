package mapEjemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int respuesta = 0;
        boolean repetir = true;

        String nombre, clase;
        double nota = 0;
        int contadorId = 3;
        int idABuscar;
        double notaABuscar;


        Scanner sc = new Scanner(System.in);

        Alumno a1 = new Alumno(1, "Pepito", "1DAM");
        Alumno a2 = new Alumno(2, "Joselito", "1DAM");
        Alumno a3 = new Alumno(3, "Antonio", "1DAM");

        Map<Alumno, Double> listado = new HashMap<>();

        listado.put(a1, 8.0);
        listado.put(a2, 3.4);
        listado.put(a3, 4.5);

        Gestion gestion = new Gestion(listado);


        System.out.println("Bienvenido a ipasen");

        while (repetir) {

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. añadir Alumno");
            System.out.println("2. buscar Alumno por id");
            System.out.println("3. eliminar un alumno");
            System.out.println("4. Editar la nota de un alumno");
            System.out.println("5. Ver alumnos aprobados");
            System.out.println("6. Ver todos los alumnos");
            System.out.println("7. Calcular nota media");
            System.out.println("8. Salir");

            respuesta = sc.nextInt();

            switch (respuesta) {

                case 1:

                    System.out.println("Introduzca el nombre del alumno ");
                    nombre = sc.next();
                    System.out.println("Introduxca la clase en la que esta ");
                    clase = sc.next();

                    System.out.println("Introduzca la nota ");
                    nota = sc.nextDouble();

                    while (nota < 0 || nota > 10) {
                        System.out.println("Valor invalido, vuelva a introducirla ");
                        nota = sc.nextDouble();
                    }
                    contadorId++;
                    gestion.agregarAlumno(new Alumno(contadorId, nombre, clase), nota);
                    break;

                case 2:
                    System.out.println("Introduzca el id del alumno");
                    idABuscar = sc.nextInt();

                    if (gestion.buscarPorId(idABuscar) != null) {
                        System.out.println(gestion.buscarPorId(idABuscar));
                    } else {
                        System.out.println("No se ha encontrado alumno con ese id");
                    }
                    break;

                case 3:
                    System.out.println("Introduzca el id del alumno");
                    idABuscar = sc.nextInt();

                    if (gestion.deleteAlumno(idABuscar)) {
                        gestion.deleteAlumno(idABuscar);
                        System.out.println("Se ha borrado correctamente");

                    } else {
                        System.out.println("No se ha encontrado alumno con ese id");
                    }
                    break;

                case 4:
                    System.out.println("Introduzca el id del alumno");
                    idABuscar = sc.nextInt();

                    System.out.println("Introduzca lanota nueva");
                    nota = sc.nextDouble();

                    while (nota < 0 || nota > 10) {
                        System.out.println("Valor invalido, vuelva a introducirla ");
                        nota = sc.nextDouble();
                    }

                    if (gestion.editarNotaAlumno(idABuscar, nota)) {
                        gestion.editarNotaAlumno(idABuscar, nota);
                        System.out.println("Se ha editado la nota correctamente");
                    }
                    break;

                case 5:
                    System.out.println(gestion.listarAlumnosAprobados());
                    break;


                case 6:
                    gestion.listarTodos();
                    break;

                case 7:
                    System.out.printf("Nota media total: %.2f ", gestion.calcularNotaMedia());
                    break;

                case 8:
                    System.out.println("Introduzca la nota");
                    notaABuscar = sc.nextDouble();
                    System.out.println(gestion.buscarAlumnosPorNotas(notaABuscar));


                case 9:
                    System.out.println("¡Gracias!");
                    repetir = false;
                    break;

                default:
                    System.out.println("Opción invalidad");


            }


        }

    }
}
