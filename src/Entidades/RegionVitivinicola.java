package Entidades;

public class RegionVitivinicola {

    //Atributos

    private String descipcion;

    private String nombre;

    //Agrego atributo provincia por la relacion para la busqueda de datos
    private Provincia provincia;

    //Constructores

    public RegionVitivinicola() {
    }

    public RegionVitivinicola(Provincia provincia, String nombre, String descipcion) {
        this.provincia = provincia;
        this.nombre = nombre;
        this.descipcion = descipcion;
    }

    //getters and setters
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

    public Provincia getProvincia() {

        return provincia;
    }

    public void setProvincia(Provincia provincia) {

        this.provincia = provincia;
    }

    //Métodos extras realización CU
    public String buscarNombrePais() {
        return this.provincia.buscarNombrePais();
    }
}
