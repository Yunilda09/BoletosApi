package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Boletos")
public class Boletos  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boletoId;
    private Long eventoId;
    private int cantidadBoletos;
    private Double precio;

     @OneToOne()
    private Evento evento;


    public Boletos(Double precio) {
        this.precio = precio;
    
    }
    public Boletos(){}

    public Long getBoletoId()
    {
        return boletoId;
    }
    public void setBoletoId(Long eventoId)
    {
        this.eventoId = eventoId;
    }
     public Long getEventoId()
    {
        return eventoId;
    }
    public void setEventoId(Long eventoId)
    {
        this.eventoId = eventoId;
    }
     public int getCantidadBoletos()
    {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(int cantidadBoletos)
    {
        this.cantidadBoletos = cantidadBoletos;
    }
    
     public Double getPrecio()
    {
        return precio;
    }
    public void setPrecio(Double precio)
    {
        this.precio = precio;
    }
    private static final long serialVersionUID = 1L;
    
}
