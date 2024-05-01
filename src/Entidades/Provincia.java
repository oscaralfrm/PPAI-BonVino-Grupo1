package Entidades;

import java.util.List;



public class Provincia {

    private String nombre;
    private List<RegionVitivinicola> regiones;

    //Constructores

    public Provincia() {
    }

    public List<RegionVitivinicola> getRegiones() {
        return regiones;
    }


    //Getters and Setters

    public void setRegiones(List<RegionVitivinicola> regiones) {
        this.regiones = regiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
