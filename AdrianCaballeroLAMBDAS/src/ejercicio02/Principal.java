package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        lista.add("Hola que tal");
        lista.add("adricaballero06@gmail.com");
        lista.add("Esto es una cadena de texto");
        lista.add("Esto es una cadena de texto con números 1234");

        Gestion g = new Gestion(lista);

        int opcion;
        boolean repetir = true;
        String cadena = "";

        while(repetir){

            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    System.out.println(g.getCadenas());
                    break;

                case 2:

                    System.out.println(g.buscarCadenaConNumeros());
                    break;

                case 3:
                    System.out.println(g.buscarCorreosElectronicos());
                    break;

                case 4:
                    System.out.println(g.toMayuscula());
                    break;

                case 5:
                    System.out.println(g.createNewString());
                    break;

                case 6:
                    System.out.println("Introduzca la cadena que busca");
                    cadena = sc.nextLine();
                    System.out.println(g.buscarPorCadena(cadena));
                    break;

                case 7:
                    g.ordenarListaPorOrdenAlfabetico();
                    System.out.println("Se ordeno la lista correctamente");
                    break;

                case 8:
                    repetir = false;
                    System.out.println("Saliendo");

                default:
                    System.out.println("Opción invalida");
                    break;




            }


        }




    }
}
