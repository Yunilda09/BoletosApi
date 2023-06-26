package com.apiBoletos.apiboletos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiBoletos.apiboletos.Models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    
}
