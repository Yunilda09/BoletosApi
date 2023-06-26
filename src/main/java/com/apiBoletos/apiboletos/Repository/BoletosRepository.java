package com.apiBoletos.apiboletos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiBoletos.apiboletos.Models.Boletos;

public interface BoletosRepository extends JpaRepository<Boletos, Long> { 
    
}
