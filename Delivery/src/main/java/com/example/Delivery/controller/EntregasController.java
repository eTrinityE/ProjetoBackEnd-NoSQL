package com.example.Delivery.controller;

import com.example.Delivery.dto.Transacao;
import com.example.Delivery.entidades.Entregador;
import com.example.Delivery.service.EntregadorService;
import com.example.Delivery.service.EntregasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import com.example.Delivery.entidades.Entregas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregas")
public class EntregasController {
    @Autowired
    private EntregasService entregasService;

    @GetMapping
    public List<Entregas> getEntregas() {
        return entregasService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Entregas> getEntregasById(@PathVariable String id) {
        return entregasService.getById(id);
    };

    @PostMapping
    public Entregas saveEntregas(@RequestBody Entregas entregas){
        return entregasService.create(entregas);
    }

    @PutMapping
    public Entregas updateEntregas(@RequestBody Entregas entregas){
        return entregasService.update(entregas);
    }

    @DeleteMapping
    public void deleteEntregas(Entregas entregas){
        if(entregas != null && !entregas.getId().isEmpty())
            entregasService.delete(entregas);
    }

    @PostMapping("/{idEntrega}/{idEntregador}")
    public Entregador definirEntrega(@RequestAttribute String idEntregas, String idEntregador){
        return entregasService.atribuirEntregaEntregador(idEntregas, idEntregador);
    }

    @PostMapping("/transacao")
    public void saveTransacao(@RequestBody Transacao transacao){
        entregasService.receberTransacao(transacao);
    }

}


