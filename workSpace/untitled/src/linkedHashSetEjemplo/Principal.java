package linkedHashSetEjemplo;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int respuesta = 0;
        boolean repetir = true;
        int id;
        String nombre;
        int contadorId = 4;
        String email;
        int age;
        int maxInvitados = 5;
        int limiteDeEdAD = 0;

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Guest> invitadosIniciales = new LinkedHashSet<>();
        EventService service = new EventService(invitadosIniciales, maxInvitados);

        service.addGuest(new Guest(1, "Pepito", "pepito@email.com", 25));
        service.addGuest(new Guest(2, "Joselito", "joselito@email.com", 28));
        service.addGuest(new Guest(3, "Antonio", "antonio@email.com", 30));
        service.addGuest(new Guest(4, "Marta", "marta@email.com", 22));

        System.out.println("Bienvenido al gestor de invitados de tu fiesta de cumple");

        while (repetir) {

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Añadir invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Buscar invitado por ID");
            System.out.println("4. Editar nombre de invitado por ID");
            System.out.println("5. Ver todos los invitados");
            System.out.println("6. Ver invitados ordenados alfabéticamente");
            System.out.println("7. Ver porcentaje de invitados que han asisitido");
            System.out.println("8. Ver invitados mayores a una edad");
            System.out.println("9. Salir");

            respuesta = sc.nextInt();
            sc.nextLine();

            switch (respuesta) {

                case 1:
                    contadorId ++;
                    System.out.println("Introduzca nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca email:");
                    email = sc.nextLine();
                    System.out.println("Introduzca edad:");
                    age = sc.nextInt();
                    sc.nextLine();

                    if (service.addGuest(new Guest(contadorId, nombre, email, age))) {
                        System.out.println("Invitado agregado correctamente");
                    } else {
                        System.out.println("No se ha podido añadir el invitado (límite alcanzado o invitado duplicado)");
                    }
                    break;

                case 2:
                    System.out.println("Introduzca id del invitado a eliminar:");
                    id = sc.nextInt();
                    Guest toRemove = service.findById(id);
                    if (service.removeGuest(toRemove)) {
                        service.removeGuest(toRemove);
                        System.out.println("Invitado eliminado correctamente");
                    } else {
                        System.out.println("No se encontró invitado con ese ID");
                    }
                    break;

                case 3:
                    System.out.println("Introduzca ID del invitado a buscar:");
                    id = sc.nextInt();
                    sc.nextLine();
                    Guest found = service.findById(id);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("No se encontró invitado con ese ID");
                    }
                    break;

                case 4:
                    System.out.println("Introduzca ID del invitado a editar:");
                    id = sc.nextInt();
                    System.out.println("Introduzca nuevo nombre:");
                    nombre = sc.nextLine();
                    if (service.editGuestName(id, nombre)) {
                        service.editGuestName(id, nombre);
                        System.out.println("Nombre editado correctamente");
                    } else {
                        System.out.println("No se encontró invitado con ese ID");
                    }
                    break;

                case 5:

                    if (service.getAllGuests().isEmpty()) {
                        System.out.println("No hay invitados aún");
                    } else {
                        System.out.println("Lista de invitados:");
                        System.out.println(service.getAllGuests());
                    }
                    break;

                case 6:
                    if (service.getGuestsAlphabetically().isEmpty()) {
                        System.out.println("No hay invitados aún");
                    } else {
                        System.out.println("Invitados ordenados alfabeexticamente:");
                        System.out.println(service.getGuestsAlphabetically());
                    }
                    break;

                case 7:

                    System.out.printf("Porcentaje de asistencia: %.2f ", service.getAttendancePercentage());
                    break;

                case 8:
                    System.out.println("Introduzca el limite de edad minima ");
                    limiteDeEdAD = sc.nextInt();

                    while(limiteDeEdAD <=0){
                        System.out.println("Limite invalido, introduzca de nuevo: ");
                        limiteDeEdAD = sc.nextInt();
                    }

                    if(service.getGuestsAboveAge(limiteDeEdAD).isEmpty()){
                        System.out.println("No hay invitados que cumplan esos requisitos de edad");
                    }else{
                        System.out.println(service.getGuestsAboveAge(limiteDeEdAD));
                    }

                    break;


                case 9:
                    repetir = false;
                    System.out.println("¡Gracias!");
                    break;

                default:
                    System.out.println("Opcion inválida");
            }
        }
    }
}
