package com.apiBoletos.apiboletos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiBoletos.apiboletos.Models.Evento;
import com.apiBoletos.apiboletos.Repository.EventoRepository;

@Service
public class EventoService{
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> list(){
        return eventoRepository.findAll();
    }

     public void save(Evento evento) {
        eventoRepository.save(evento);
    }

    public Evento findById(Long id) {
        return eventoRepository.findById(id).get();
    }

     public void delete(Long id) {
         eventoRepository.deleteById(id);
    }
}