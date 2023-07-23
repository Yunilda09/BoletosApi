package com.apiBoletos.apiboletos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiBoletos.apiboletos.Models.Boletos;
import com.apiBoletos.apiboletos.Repository.BoletosRepository;

@Service
public class BoletosService {
     @Autowired
    private BoletosRepository boletosRepository;

    public List<Boletos> list(){
        return boletosRepository.findAll();
    }
    
    public List<Boletos> obtenerBoletosPorEvento(Long eventoId) {
        return boletosRepository.findByEventos_EventoId(eventoId);
    }

     public void save(Boletos boletos) {
        boletosRepository.save(boletos);
    }

    public Boletos findById(Long id) {
        return boletosRepository.findById(id).get();
    }

     public void delete(Long id) {
         boletosRepository.deleteById(id);
    }
}
