package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Boletos")
public class Boletos  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boletoId;
    private Long cantidadBoletos;
    private Double precio;
    private String asiento;

     @ManyToOne()
     @JoinColumn(name =  "evento_id")
    private Evento eventos;
   


    public Boletos(Long cantidadBoletos, Double precio, String asiento) {
        this.cantidadBoletos = cantidadBoletos;
        this.precio = precio;
        this.asiento = asiento;
    
    }
    public Boletos(){}

    public Long getBoletoId()
    {
        return boletoId;
    }
    public void setBoletoId(Long boletoId)
    {
        this.boletoId = boletoId;
    }

     public Long getCantidadBoletos()
    {
        return cantidadBoletos;
    }
    public void setCantidadBoletos(Long cantidadBoletos)
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
    
     public String getAsiento()
     {
        return asiento;
     }
     public void setAsiento(String asiento)
     {
        this.asiento = asiento;
     }
    private static final long serialVersionUID = 1L;
    
}
