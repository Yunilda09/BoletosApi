package com.apiBoletos.apiboletos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiBoletos.apiboletos.Models.Evento;
import com.apiBoletos.apiboletos.Services.EventoService;

@RestController
public class EventoController {
    @Autowired
    EventoService eventoService;

     @GetMapping("/list/evento")
    public List<Evento> list() {
        return eventoService.list();
    }

    @GetMapping("/evento/{id}")
    public ResponseEntity<Evento> findById(@PathVariable Long id) {
        try {
            Evento evento = eventoService.findById(id);
            return new ResponseEntity<Evento>(evento, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Evento>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save/evento")
    public void save(@RequestBody Evento evento) {
        eventoService.save(evento);
    }

    @PutMapping("/update/evento{id}")
    public ResponseEntity<Evento> update(@RequestBody Evento evento, @PathVariable Long id) {
        try {
            Evento eventoExiste = eventoService.findById(id);
            eventoService.save(evento);
            return new ResponseEntity<Evento>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Evento>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/evento{id}")
    public void delete(@PathVariable Long id) {
        eventoService.delete(id);
    }
}
