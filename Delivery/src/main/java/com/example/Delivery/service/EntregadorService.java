package com.example.Delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.Delivery.entidades.Entregador;
import com.example.Delivery.repositorios.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EntregadorService {
    @Autowired
    EntregadorRepository entregadorRepository;

    public List<Entregador> getAll(){
        return entregadorRepository.findAll();
    }

    public Optional<Entregador> getById(String id){
        return entregadorRepository.findById(id);
    }

    public Entregador create(Entregador entregador){
        return entregadorRepository.save(entregador);
    }

    public Entregador update(Entregador entregador){
        if(entregador != null && !entregador.getId().isEmpty())
            return entregadorRepository.save(entregador);
        return null;
    }

    public void delete(Entregador entregador){
        if(entregador != null && !entregador.getId().isEmpty())
            entregadorRepository.delete(entregador);
    }
}


