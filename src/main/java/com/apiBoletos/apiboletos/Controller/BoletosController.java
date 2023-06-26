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

import com.apiBoletos.apiboletos.Models.Boletos;
import com.apiBoletos.apiboletos.Services.BoletosService;

@RestController
public class BoletosController {
    @Autowired
    BoletosService boletosService;

     @GetMapping("/list/boletos")
    public List<Boletos> list() {
        return boletosService.list();
    }

    @GetMapping("/boletos/{eventoId}")
    public ResponseEntity<Boletos> findById(@PathVariable Long id) {
        try {
            Boletos boletos = boletosService.findById(id);
            return new ResponseEntity<Boletos>(boletos, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Boletos>(HttpStatus.NOT_FOUND);
        }
    }
   

    @PostMapping("/save")
    public void save(@RequestBody Boletos boletos) {
        boletosService.save(boletos);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Boletos> update(@RequestBody Boletos boletos, @PathVariable Long id) {
        try {
            Boletos boletosExiste = boletosService.findById(id);
            boletosService.save(boletos);
            return new ResponseEntity<Boletos>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Boletos>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        boletosService.delete(id);
    }
}
