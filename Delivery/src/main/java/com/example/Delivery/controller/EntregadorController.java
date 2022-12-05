package com.example.Delivery.controller;

import com.example.Delivery.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.example.Delivery.entidades.Entregador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregador")
public class EntregadorController {
    @Autowired
    private EntregadorService entregadorService;

    @GetMapping
    public List<Entregador> getEntregador() {
        return entregadorService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Entregador> getEntregadorById(@PathVariable String id) {
        return entregadorService.getById(id);
    };

    @PostMapping
    public Entregador saveEntregador(@RequestBody Entregador entregador){
        return entregadorService.create(entregador);
    }

    @PutMapping
    public Entregador updateEntregador(@RequestBody Entregador entregador){
        return entregadorService.update(entregador);
    }

    @DeleteMapping
    public void deleteEntregador(Entregador entregador){
        if(entregador != null && !entregador.getId().isEmpty())
            entregadorService.delete(entregador);
    }


}


