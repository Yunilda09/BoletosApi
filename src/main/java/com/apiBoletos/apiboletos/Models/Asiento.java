package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Asiento")
public class Asiento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asientoId;
    private Double numero;
    private Double disponible;

     @OneToOne()
    private Evento evento;


    public Asiento(Double numero, Double disponible) {
        this.numero = numero;
        this.disponible = disponible;
    }
    public Asiento(){}

    public Long getAsientoId()
    {
        return asientoId;
    }
    public void setAsientoId(Long asientoId)
    {
        this.asientoId = asientoId;
    }

    public Double getNumero()
    {
        return numero;
    }
    public void setNumero(Double numero)
    {
        this.numero = numero;
    }
    public Double getCapacidad()
    {
        return disponible;
    }
    public void setCapacidad()
    {
        this.disponible = disponible;
    }

    private static final long serialVersionUID = 1L;
}
