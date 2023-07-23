package com.apiBoletos.apiboletos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiBoletos.apiboletos.Models.Boletos;

public interface BoletosRepository extends JpaRepository<Boletos, Long> {
    List<Boletos> findByEventos_EventoId(Long eventoId);
}
