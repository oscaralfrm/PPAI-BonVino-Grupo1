package Entidades;

import javax.swing.*;
import java.time.Year;

public class Vino {

    //Atributos
    private Year anada;
    private ImageIcon imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private double precioARS;
    private Varietal varietal;
    private Bodega bodega;

    //Métodos Constructores

    public Vino() {
    }

    public Vino(Year anada, ImageIcon imagenEtiqueta, String nombre, Varietal varietal,
                double precioARS, String notaDeCataBodega, Bodega bodega) {
        this.anada = anada;
        this.imagenEtiqueta = imagenEtiqueta;
        this.nombre = nombre;
        this.varietal = varietal;
        this.precioARS = precioARS;
        this.notaDeCataBodega = notaDeCataBodega;
        this.bodega = bodega;
    }

    //Getters and setters


    public Year getAnada() {
        return anada;
    }

    public void setAnada(Year anada) {
        this.anada = anada;
    }

    public ImageIcon getImagenEtiqueta() {
        return imagenEtiqueta;
    }

    public void setImagenEtiqueta(ImageIcon imagenEtiqueta) {
        this.imagenEtiqueta = imagenEtiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNotaDeCataBodega() {
        return notaDeCataBodega;
    }

    public void setNotaDeCataBodega(String notaDeCataBodega) {
        this.notaDeCataBodega = notaDeCataBodega;
    }

    public double getPrecioARS() {
        return precioARS;
    }

    public void setPrecioARS(double precioARS) {
        this.precioARS = precioARS;
    }

    public Varietal getVarietal() {
        return varietal;
    }

    public void setVarietal(Varietal varietal) {
        this.varietal = varietal;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
}
