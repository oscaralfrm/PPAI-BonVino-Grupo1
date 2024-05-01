package Entidades;

public class Varietal {

    // Atributos

    private String descripcion;
    private double porcentajeComposicion;


    // Métodos Constructores

    public Varietal() {
    }

    public Varietal(String descripcion, double porcentajeComposicion) {
        this.descripcion = descripcion;
        this.porcentajeComposicion = porcentajeComposicion;
    }

    // Métodos Getters y Setters

    public String getDescripcionVarietal() {
        return descripcion;
    }

    public void setDescripcionVarietal(String descripcion) {
        this.descripcion = descripcion;
    }

    public double mostrarPorcentaje() {
        return porcentajeComposicion;
    }

    public void setPorcentaje(double porcentajeComposicion) {
        this.porcentajeComposicion = porcentajeComposicion;
    }


}
