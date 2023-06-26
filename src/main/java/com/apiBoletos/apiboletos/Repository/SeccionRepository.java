package com.apiBoletos.apiboletos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiBoletos.apiboletos.Models.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, Long> {
    
}
