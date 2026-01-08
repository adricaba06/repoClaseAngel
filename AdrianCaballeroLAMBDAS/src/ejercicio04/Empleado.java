package ejercicio04;

public class Empleado {

    private int id;
    private String nombre, departamento;
    private double salario;
    private boolean activo;
    private int anios_antiguedad;

    public Empleado(int id, String nombre, String departamento, double salario, boolean activo, int anios_antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.activo = activo;
        this.anios_antiguedad = anios_antiguedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getAnios_antiguedad() {
        return anios_antiguedad;
    }

    public void setAnios_antiguedad(int anios_antiguedad) {
        this.anios_antiguedad = anios_antiguedad;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", activo=" + activo +
                ", anios_antiguedad=" + anios_antiguedad +
                '}';
    }
}
