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

import com.apiBoletos.apiboletos.Models.Seccion;
import com.apiBoletos.apiboletos.Services.SeccioneService;

public class SeccionController
{
    @Autowired
    SeccioneService seccioneService;

     @GetMapping("/list/seccion")
    public List<Seccion> list() {
        return seccioneService.list();
    }

    @GetMapping("/seccion/{seccionId}")
    public ResponseEntity<Seccion> findById(@PathVariable Long id) {
        try {
            Seccion seccion = seccioneService.findById(id);
            return new ResponseEntity<Seccion>(seccion, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Seccion>(HttpStatus.NOT_FOUND);
        }
    }

     @PostMapping("/save/seccion")
    public void save(@RequestBody Seccion seccion) {
        seccioneService.save(seccion);
    }

    @PutMapping("/update/seccion{id}")
    public ResponseEntity<Seccion> update(@RequestBody Seccion seccion, @PathVariable Long id) {
        try {
            Seccion seccionExiste = seccioneService.findById(id);
            seccioneService.save(seccion);
            return new ResponseEntity<Seccion>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Seccion>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/seccion{id}")
    public void delete(@PathVariable Long id) {
        seccioneService.delete(id);
    }
}
