package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Eventos")
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventoId;
    private String nombreEvento;
    private String descripcion;
    private Date fecha;
    private String ubicacion;

    public Evento(String nombreEvento, String descripcion, Date fecha, String ubicacion) {
        this.nombreEvento = nombreEvento;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    @OneToMany(mappedBy = "eventos", cascade = CascadeType.ALL)
    public List<Boletos> boletos;

   
    public Evento() {

    }

    public Long getEventoId() {
        return eventoId;
    }

    public void setEventoId(Long eventoId) {
        this.eventoId = eventoId;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion() {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
