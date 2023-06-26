package com.apiBoletos.apiboletos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiBoletos.apiboletos.Models.Asiento;
import com.apiBoletos.apiboletos.Repository.AsientoRepository;

@Service
public class AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;

    public List<Asiento> list() {
        return asientoRepository.findAll();
    }

    public void save(Asiento asiento) {
        asientoRepository.save(asiento);
    }

    public Asiento findById(Long id) {
        return asientoRepository.findById(id).get();
    }

    public void delete(Long id) {
        asientoRepository.deleteById(id);
    }
}
