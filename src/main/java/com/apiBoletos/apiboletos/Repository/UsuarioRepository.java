package com.apiBoletos.apiboletos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apiBoletos.apiboletos.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}

