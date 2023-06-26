package com.apiBoletos.apiboletos.Models;

import javax.persistence.*;


@Entity
@Table(name = "Usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public long usuarioId;
    public String nombre;
    public String correo;
    public String password;

    public Usuario(String nombre, String correo, String password)
    {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public Usuario()
    {

    }

    // getter
    //setter

    public Long getUsuarioId()
    {
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId)
    {
        this.usuarioId = usuarioId;
    }
     public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getCorreo()
    {
        return correo;
    }
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }
      public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
}
