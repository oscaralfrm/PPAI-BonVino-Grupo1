package Entidades;

import javax.swing.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vino {

    //Atributos
    private Year añada;
    private ImageIcon imagenEtiqueta;
    private String nombre;
    private String notaDeCataBodega;
    private float precioARS;
    private List<Varietal> varietal;
    private Bodega bodega;
    private List<Reseña> reseñas;

    //Métodos Constructores

    public Vino() {
    }

    public Vino(Year añada, ImageIcon imagenEtiqueta, String nombre, List<Varietal> varietal,
                float precioARS, String notaDeCataBodega, Bodega bodega) {
        this.añada = añada;
        this.imagenEtiqueta = imagenEtiqueta;
        this.nombre = nombre;
        this.varietal = varietal;
        this.precioARS = precioARS;
        this.notaDeCataBodega = notaDeCataBodega;
        this.bodega = bodega;
    }

    //Getters and setters


    public Year getAñada() {
        return añada;
    }

    public void setAñada(Year añada) {
        this.añada = añada;
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

    public void setPrecioARS(float precioARS) {
        this.precioARS = precioARS;
    }

    public List<Varietal> getVarietal() {
        return varietal;
    }

    public void setVarietal(List<Varietal> varietal) {
        this.varietal = varietal;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public List<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(List<Reseña> reseñas) {
        this.reseñas = reseñas;
    }

    public void agregarReseña(Reseña reseña) {
        this.reseñas.add(reseña);
    }

    public void eliminarReseña(Reseña reseña) {
        this.reseñas.remove(reseña);
    }

    //Métodos extras realización CU
    public List<String> buscarDescripcionVarietales() {
        List<String> descripciones = new ArrayList<>();
        for (Varietal unVarietal : this.varietal) {
            descripciones.add(unVarietal.getDescripcionVarietal());
        };
        return descripciones;
    }

    public String buscarNombreBodega() {
        return this.bodega.getNombre();
    }

    public String buscarNombreRegion() {
        return this.bodega.buscarNombreRegion();
    }

    public String buscarNombrePais() {
        return this.bodega.buscarNombrePais();
    }

    public Boolean tieneReseñasSommelierEnPeriodo(Date fechaDesde, Date fechaHasta) {
        Boolean cumple = false;
        for (Reseña reseña : this.reseñas) {
            if (reseña.sosDeSommelier() && reseña.esFechaEnPeriodo(fechaDesde, fechaHasta)) {
                cumple = true;
                break;
            }

        }
        return cumple;
    }

    public float calcularPromedioReseñasSommelierPeriodo(Date fechaDesde, Date fechaHasta) {
        float prom = 0;
        float suma = 0;
        if (!this.reseñas.isEmpty()) {
            for (Reseña reseña : this.reseñas) {
                suma = suma + (reseña.getPuntaje());
            }
            prom = suma / this.reseñas.size();
            prom = Math.round(prom * 100) / 100;
        }
        return prom;
    }
}
