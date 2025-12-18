package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Juan", "Pérez", "Matemáticas", 8.5, 18);
        Alumno a2 = new Alumno("María", "López", "Física", 9.2, 19);
        Alumno a3 = new Alumno("Pedro", "García", "Química", 7.8, 17);
        Alumno a4 = new Alumno("Ana", "Martínez", "Biología", 9.0, 18);

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);

        Secretaria gestion = new Secretaria(alumnos);
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String letra;
        double nota;
        int tamanio;
        int maxLength;


        System.out.println("Bienvenido a la secretaria virtual");

        do {
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Alumnos que empiezan con una letra");
            System.out.println("3. Tamaño de la lista");
            System.out.println("4. Alumnos con nota media mayor a un valor");
            System.out.println("5. Obtener primeros N alumnos");
            System.out.println("6. Alumno más joven");
            System.out.println("7. Primer alumno");
            System.out.println("8. Alumnos con nombre más largo que N letras");
            System.out.println("9. Alumnos que empiezan por A y longitud <= N");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    gestion.getAllAlumnos();
                    break;

                case 2:
                    System.out.print("Introduce la letra: ");
                    letra = sc.nextLine();
                    List<Alumno> alumnosLetra = gestion.getAlumnosThatStartsWith(letra);
                    alumnosLetra.forEach(System.out::println);
                    break;


                case 3:
                    System.out.println("Tamaño de la lista: " + gestion.getListSize());
                    break;


                case 4:
                    System.out.print("Introduce la nota mínima: ");
                    nota= sc.nextDouble();
                    List<Alumno> alumnosNota = gestion.getAlumnoWhoseGradesAreAbove(nota);
                    System.out.println(alumnosNota);
                    break;

                case 5:
                    System.out.print("Cantidad de alumnos a obtener: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    List<Alumno> algunos = gestion.getSomeStudents(cantidad);
                    System.out.println(algunos);
                    break;

                case 6:
                    System.out.println("Alumno más joven: " + gestion.getYoungestStudent());
                    break;

                case 7:
                    System.out.println("Primer alumno: " + gestion.getFristAlumno(gestion.getLista()));
                    break;

                case 8:
                    System.out.print("Longitud mínima del nombre: ");
                    tamanio = sc.nextInt();
                    List<Alumno> largos = gestion.getAlumnosNombreMayorA(gestion.getLista(), tamanio);
                    System.out.println(largos);
                    break;

                case 9:
                    System.out.print("Longitud máxima del nombre: ");
                    maxLength = sc.nextInt();
                    List<Alumno> filtrados = gestion.getAlumnosConAyLongitudMax(gestion.getLista(), maxLength);
                    System.out.println(filtrados);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}
