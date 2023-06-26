package com.apiBoletos.apiboletos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiBoletos.apiboletos.Models.Asiento;

public interface AsientoRepository extends JpaRepository<Asiento, Long> {
    
}
