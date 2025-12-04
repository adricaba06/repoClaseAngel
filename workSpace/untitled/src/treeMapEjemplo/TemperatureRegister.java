package treeMapEjemplo;

import java.time.LocalDate;

public class TemperatureRegister {
    private LocalDate dateOfRegistration;
    private double temperature;
    private String description;

    public TemperatureRegister(LocalDate dateOfRegistration, double temperature, String description) {
        this.dateOfRegistration = dateOfRegistration;
        this.temperature = temperature;
        this.description = description;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TemperatureRegister{" +
                "dateOfRegistration=" + dateOfRegistration +
                ", temperature=" + temperature +
                ", description='" + description + '\'' +
                '}';
    }
}
