package com.apiBoletos.apiboletos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiBoletos.apiboletos.Models.Seccion;
import com.apiBoletos.apiboletos.Repository.SeccionRepository;

@Service
public class SeccioneService {
    
  @Autowired
    private SeccionRepository seccionRepository;

    public List<Seccion> list(){
        return seccionRepository.findAll();
    }

     public void save(Seccion seccion) {
        seccionRepository.save(seccion);
    }

    public Seccion findById(Long id) {
        return seccionRepository.findById(id).get();
    }

     public void delete(Long id) {
         seccionRepository.deleteById(id);
    }
}
