package linkedHashSetEjemplo;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;

public class EventService {

    private LinkedHashSet<Guest> invitados;
    private int maxInvitados;

    public EventService(LinkedHashSet<Guest> invitados, int maxInvitados) {
        this.invitados = invitados;
        this.maxInvitados = maxInvitados;
    }

    public int getMaxInvitados() {
        return maxInvitados;
    }

    public void setMaxInvitados(int maxInvitados) {
        this.maxInvitados = maxInvitados;
    }

    public LinkedHashSet<Guest> getInvitados() {
        return invitados;
    }

    public void setInvitados(LinkedHashSet<Guest> invitados) {
        this.invitados = invitados;
    }


    public Guest findById(int id) {
        return invitados.stream()
                .filter(g -> g.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean addGuest(Guest guest) {
        if (invitados.size() >= maxInvitados) {
            return false;
        }else{
            invitados.add(guest);
            return true;
        }
    }

    public boolean removeGuest(Guest guest) {
        if (findById(guest.getId()) != null){
            invitados.remove(guest);
            return true;
        }else{
            return false;
        }
    }

    public boolean editGuestName(int id, String newName){
        if (findById(id) != null){
            Guest g = findById(id);
            g.setName(newName);
            return true;
        }else{
            return false;
        }
    }

    public boolean isInvited(Guest guest) {
        return invitados.contains(guest);
    }

    public int getGuestCount() {
        return invitados.size();
    }

    public double getAttendancePercentage() {
        if (maxInvitados == 0) return 0;
        return (invitados.size() * 100.0) / maxInvitados;
    }

    public ArrayList<Guest> getGuestsAlphabetically() {
        ArrayList<Guest> listaOrdenada = new ArrayList<>(invitados);
        listaOrdenada.sort((g1, g2) -> g1.getName().compareToIgnoreCase(g2.getName()));
        return listaOrdenada;
    }

    public LinkedHashSet<Guest> getAllGuests() {
        return new LinkedHashSet<>(invitados);
    }

    public ArrayList<Guest> getGuestsAboveAge(int age) {
        ArrayList<Guest> filtrados = new ArrayList<>();
        for (Guest g : invitados) {
            if (g.getAge() > age) filtrados.add(g);
        }
        return filtrados;
    }

    public ArrayList<Guest> getGuestsBelowAge(int age) {
        ArrayList<Guest> filtrados = new ArrayList<>();
        for (Guest g : invitados) {
            if (g.getAge() < age) filtrados.add(g);
        }
        return filtrados;
    }
}

//https://codegym.cc/es/groups/posts/es.702.linkedhashset-en-java