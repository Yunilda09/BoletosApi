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

import com.apiBoletos.apiboletos.Models.Asiento;
import com.apiBoletos.apiboletos.Services.AsientoService;


@RestController
public class AsientoController {
    @Autowired
    AsientoService asientoService;

    @GetMapping("/list/asiento")
    public List<Asiento> list() {
        return asientoService.list();
    }

    @GetMapping("/asiento/{id}")
    public ResponseEntity<Asiento> findById(@PathVariable Long id) {
        try {
            Asiento asiento = asientoService.findById(id);
            return new ResponseEntity<Asiento>(asiento, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Asiento>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save/asiento")
    public void save(@RequestBody Asiento asiento) {
        asientoService.save(asiento);
    }

    @PutMapping("/update/asiento{id}")
    public ResponseEntity<Asiento> update(@RequestBody Asiento asiento, @PathVariable Long id) {
        try {
            Asiento asientoExiste = asientoService.findById(id);
            asientoService.save(asiento);
            return new ResponseEntity<Asiento>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Asiento>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/asiento{id}")
    public void delete(@PathVariable Long id) {
        asientoService.delete(id);
    }
}
