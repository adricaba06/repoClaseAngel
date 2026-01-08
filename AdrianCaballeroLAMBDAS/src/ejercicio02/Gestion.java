package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gestion {

    private List<String> cadenas;

    public Gestion(List<String> cadenas) {
        this.cadenas = cadenas;
    }

    public List<String> getCadenas() {
        return cadenas;
    }

    public void setCadenas(List<String> cadenas) {
        this.cadenas = cadenas;
    }


    public List<String> ordenarListaPorOrdenAlfabetico() {
        return cadenas.stream().sorted().toList();
    }

    public List<String> buscarPorCadena(String cadena) {
        return cadenas.stream().filter(c -> c.equalsIgnoreCase(cadena)).toList();

    }

    public String createNewString() {
        return cadenas
                .stream()
                .map(s -> String.valueOf(s.charAt(0))).toString();

    }

    public void borrarPalabrasConLongitudImpar() {
        cadenas = (cadenas.stream().filter(s -> s.length() % 2 == 0).toList());
    }

    public List<String> toMayuscula() {
        return cadenas.stream().map(String::toUpperCase).toList();
    }

    public List<String> buscarCadenaConNumeros() {
        List<String> lista = new ArrayList<>();
        String regex = ".*\\d.*";
        Pattern pattern = Pattern.compile(regex);

        for (String cadena : cadenas) {
            Matcher matcher = pattern.matcher(cadena);
            if (matcher.find()) {
                lista.add(cadena);
            }
        }

        return lista;
    }

    public List<String> buscarCorreosElectronicos() {
        List<String> lista = new ArrayList<>();
        String regex = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@ + [A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        for (int i = 0; i < cadenas.size(); i++) {
            matcher = pattern.matcher(cadenas.get(i));
            if(matcher.matches()){
                lista.add(matcher.toString());
            }

        }
        return lista;

    }

    @Override
    public String toString() {
        return "Gestion{" +
                "cadenas=" + cadenas +
                '}';
    }
}
