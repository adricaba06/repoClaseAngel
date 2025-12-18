package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cancion c1 = new Cancion("Imagine", "John Lennon", "Rock", 3.1);
        Cancion c2 = new Cancion("Bohemian Rhapsody", "Queen", "Rock", 5.5);
        Cancion c3 = new Cancion("Billie Jean", "Michael Jackson", "Pop", 4.2);
        Cancion c4 = new Cancion("Thriller", "Michael Jackson", "Pop", 5.8);
        Cancion c5 = new Cancion("Clocks", "Coldplay", "Alternative", 4.6);

        List<Cancion> canciones = new ArrayList<>();
        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);

        PlayList playList = new PlayList(canciones);
        Scanner sc = new Scanner(System.in);

        int opcion;
        String texto;
        double duracion;

        System.out.println("Bienvenido a Spotify");

        do {
            System.out.println("\n1. Mostrar todas las canciones");
            System.out.println("2. Buscar canción por nombre");
            System.out.println("3. Buscar canciones por autor");
            System.out.println("4. Buscar canciones por género");
            System.out.println("5. Canciones con duración mínima");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    playList.getLista().forEach(System.out::println);
                    break;

                case 2:
                    System.out.print("Introduce el nombre de la canción: ");
                    texto = sc.nextLine();
                    Cancion encontrada = playList.findByName(texto);
                    System.out.println(encontrada);
                    break;

                case 3:
                    System.out.print("Introduce el autor:");
                    texto = sc.nextLine();
                    List<Cancion> porAutor = playList.findByAuthor(texto);
                    System.out.println(porAutor);
                    break;

                case 4:
                    System.out.print("Introduce el género: ");
                    texto = sc.nextLine();
                    List<Cancion> porGenero = playList.findByGenero(texto);
                    System.out.println(porGenero);
                    break;

                case 5:
                    System.out.print("Introduce la duración mínima: ");
                    duracion = sc.nextDouble();
                    List<Cancion> largas = playList.getSongsByDuration(duracion);
                    System.out.println(largas);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

    }
}
