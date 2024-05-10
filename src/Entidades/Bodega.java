package Entidades;

import java.util.List;
import java.util.Date;


public class Bodega {

    private List<Double> coordenadas;
    private String descripcion;
    private String historia;
    private String nombre;
    private Date periodoActualizacion;
    private RegionVitivinicola region;


    //Constructor

    public Bodega() {
    }

    public Bodega(List<Double> coordenadas, String descripcion, String historia,
                  String nombre, Date periodoActualizacion, RegionVitivinicola region) {
        if (coordenadas.size() == 2) {
            this.coordenadas = coordenadas;}
        this.descripcion = descripcion;
        this.historia = historia;
        this.nombre = nombre;
        this.periodoActualizacion = periodoActualizacion;
        this.region = region;
    }

    //getters y setters


    public List<Double> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<Double> coordenadas) {
        if (coordenadas.size() == 2) {
            this.coordenadas = coordenadas;}
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getPeriodoActualizacion() {
        return periodoActualizacion;
    }

    public void setPeriodoActualizacion(Date periodoActualizacion) {
        this.periodoActualizacion = periodoActualizacion;
    }

    public RegionVitivinicola getRegion() {
        return region;
    }

    public void setRegion(RegionVitivinicola region) {
        this.region = region;
    }

    public String buscarNombreRegion() {
        return this.region.getNombre();
    }

    public String buscarNombrePais() {
        return this.region.buscarNombrePais();
    }
}
