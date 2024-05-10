package Entidades;

import java.util.List;



public class Provincia {

    private String nombre;
    private List<RegionVitivinicola> regiones;

    //agrego atributo pais para la busqueda del dato
    private Pais pais;

    //Constructores
    public Provincia() {
    }

    public Provincia(String nombre, List<RegionVitivinicola> regiones, Pais pais) {
        this.nombre = nombre;
        this.regiones = regiones;
        this.pais = pais;
    }

    //Getters and Setters

    public List<RegionVitivinicola> getRegiones() {
        return regiones;
    }


    public void setRegiones(List<RegionVitivinicola> regiones) {
        this.regiones = regiones;
    }

    public void agregarRegion(RegionVitivinicola region) {
        this.regiones.add(region);
        region.setProvincia(this);

    }

    public void eliminarRegion(RegionVitivinicola region) {
        this.regiones.remove(region);
        region.setProvincia(null);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String buscarNombrePais() {
        return this.pais.getNombre();
    }
}
