package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Eventos")
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventoId;
    private String nombreEvento;
    private String tipoEvento;
    private String lugarEvento;
    private Date fecha;
    private String CantidadBoletos;

   
    public Evento(String nombreEvento, String tipoEvento, String lugarEvento, Date fecha, String CantidadBoletos) {
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.lugarEvento = lugarEvento;
        this.fecha = fecha;
        this.CantidadBoletos = CantidadBoletos;
    }

    public Evento() {

    }

    public Long getEventoId() 
    {
        return eventoId;
    }
    public void setEventoId(Long eventoId)
    {
        this.eventoId = eventoId;
    }
    public String getNombreEvento()
    {
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento)
    {
        this.nombreEvento = nombreEvento;
    }
    public String getTipoEvento()
    {
        return tipoEvento;
    }
    public void setTipoEvento(String tipoEvento)
    {
        this.tipoEvento = tipoEvento;
    }
    public String getLugarEvento()
    {
        return lugarEvento;
    }
    public void setLugarEvento(String lugarEvento)
    {
        this.lugarEvento = lugarEvento;
    }
    public Date Fecha()
    {
        return fecha;
    }
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    public String getCantidadBoletos()
    {
        return CantidadBoletos;
    }
    public void setCantidadBoletos(String cantidadBoletos)
    {
        this.CantidadBoletos = cantidadBoletos;
    }
    private static final long serialVersionUID = 1L;

}
