package Entidades;

import java.util.List;

public class Pais {

    private String nombre;
    private List<Provincia> provincias;

    //Constructor
    public Pais() {
    }

    public Pais(String nombre, List<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = provincias;
    }

    //Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }


}
