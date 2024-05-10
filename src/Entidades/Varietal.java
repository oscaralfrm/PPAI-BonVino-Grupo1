package Entidades;

public class Varietal {

    // Atributos

    private String descripcion;
    private float porcentajeComposicion;


    // Métodos Constructores

    public Varietal() {
    }

    public Varietal(String descripcion, float porcentajeComposicion) {
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

    public void setPorcentaje(float porcentajeComposicion) {

        this.porcentajeComposicion = porcentajeComposicion;
    }


}
