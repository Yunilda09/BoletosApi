package com.apiBoletos.apiboletos.Models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Seccion")
public class Seccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seccionId;
    private String nombre;
    private Long capacidad;

     @OneToOne()
    private Evento evento;

    public Seccion(String nombre, Long capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public Seccion(){}

     public Long getSeccionId()
    {
        return seccionId;
    }
    public void setSeccionId(Long seccionId)
    {
        this.seccionId = seccionId;
    }
     public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
     public Long geCapacidad()
    {
        return capacidad;
    }
 public void setCapacidad(Long capacidad)
    {
        this.capacidad = capacidad;
    }


}
