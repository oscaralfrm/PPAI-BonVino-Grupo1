package Entidades;

import java.util.Date;
import java.util.List;

public class Reseña {

    //Atributos
    private String comentario;
    private Boolean esPremium;
    private Date fechaReseña;
    private float puntaje;
    private Vino vino;

    //Metodos constructores

    public Reseña() {
    }

    public Reseña(String comentario, Boolean esPremium, Date fechaReseña, float puntaje, Vino vino) {
        this.comentario = comentario;
        this.esPremium = esPremium;
        this.fechaReseña = fechaReseña;
        this.puntaje = puntaje;
        this.vino = vino;
    }

    //Getters and setters

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEsPremium() {
        return esPremium;
    }

    public void setEsPremium(Boolean esPremium) {
        this.esPremium = esPremium;
    }

    public Date getFechaReseña() {
        return fechaReseña;
    }

    public void setFechaReseña(Date fechaReseña) {
        this.fechaReseña = fechaReseña;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public Vino getVino() {
        return vino;
    }

    public void setVino(Vino vino) {
        this.vino = vino;
    }
}
