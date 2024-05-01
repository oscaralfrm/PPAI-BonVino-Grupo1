package Entidades;

public class RegionVitivinicola {

    //Atributos

    private String descipcion;

    private String nombre;

    //Constructores

    public RegionVitivinicola() {
    }

    public RegionVitivinicola(String descipcion, String nombre) {
        this.descipcion = descipcion;
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
