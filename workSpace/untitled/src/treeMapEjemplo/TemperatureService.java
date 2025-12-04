package treeMapEjemplo;

import java.util.Map;
import java.util.TreeMap;

public class TemperatureService {

    private TreeMap<String, TemperatureRegister> temperatureMap;


    public TemperatureService(TreeMap<String, TemperatureRegister> temperatureMap) {
        this.temperatureMap = temperatureMap;
    }

    public TreeMap<String, TemperatureRegister> getTemperatureMap() {
        return temperatureMap;
    }

    public void setTemperatureMap(TreeMap<String, TemperatureRegister> temperatureMap) {
        this.temperatureMap = temperatureMap;
    }


    public TemperatureRegister findByCiudad(String ciudad) {
        for (Map.Entry<String, TemperatureRegister> entry : temperatureMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(ciudad)) {
                return entry.getValue();
            }
        }
        return null;
    }


    public void listAll() {
        if (temperatureMap.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (Map.Entry<String, TemperatureRegister> entry : temperatureMap.entrySet()) {
                System.out.println(entry);
            }
        }
    }

    public TreeMap<String, TemperatureRegister> getTemperaturebetweenCityLetters(String primerLetra1, String primeraLetra2) {
        TreeMap<String, TemperatureRegister> tree = new TreeMap<>(temperatureMap
                .subMap(primerLetra1, true, primeraLetra2, true));

        //hay una version de dos parametros y otra de 4 , en la de dos  no se incluye el segundo parametro pero en la de 4 podemos elegirlo con true o false
        // .subMap devuelve un sortedMap, hay que tener cuidado
        return tree;
    }

    public void addTemperatureRegister(TemperatureRegister tpr, String ciudad) {
        temperatureMap.put(ciudad, tpr);
    }

    public boolean deleteRegisterByCity(String ciudad) {
        String claveReal = null;

        for (String key : temperatureMap.keySet()) {
            if (key.equalsIgnoreCase(ciudad)) {
                claveReal = key;
                break;
            }
        }

        if (claveReal != null) {
            temperatureMap.remove(claveReal);
            return true;
        }

        return false;
    }


    public boolean editTemperature(String ciudad, double grados) {
        if (findByCiudad(ciudad) != null) {
            TemperatureRegister t = findByCiudad(ciudad);
            t.setTemperature(grados);
            return true;
        } else {
            return false;
        }
    }

    public TemperatureRegister getFollowingRegister(String ciudad) {
        if (ciudad == null || temperatureMap.isEmpty()) {
            return null;
        }

        String claveReal = null;
        for (String k : temperatureMap.keySet()) {
            if (k.equalsIgnoreCase(ciudad)) {
                claveReal = k;
                break;
            }
        }

        if (claveReal == null) {
            return null;
        }

        String ciudadAnterior = temperatureMap.higherKey(claveReal);
        if (ciudadAnterior == null) {
            return null;
        }

        return temperatureMap.get(ciudadAnterior);
    }


    public TemperatureRegister getPreviousRegister(String ciudad) {
        if (ciudad == null || temperatureMap.isEmpty()) {
            return null;
        }

        String claveReal = null;
        for (String k : temperatureMap.keySet()) {
            if (k.equalsIgnoreCase(ciudad)) {
                claveReal = k;
                break;
            }
        }

        if (claveReal == null) {
            return null;
        }

        String ciudadAnterior = temperatureMap.lowerKey(claveReal);
        if (ciudadAnterior == null) {
            return null;
        }

        return temperatureMap.get(ciudadAnterior);
    }


    //same method



    @Override
    public String toString() {
        return "TemperatureService{" +
                "temperatureMap=" + temperatureMap +
                '}';
    }
}
