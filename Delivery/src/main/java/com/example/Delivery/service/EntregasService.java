package com.example.Delivery.service;

import com.example.Delivery.dto.Transacao;
import com.example.Delivery.entidades.Entregador;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.Delivery.entidades.Entregas;
import com.example.Delivery.repositorios.EntregasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EntregasService {
    @Autowired
    EntregasRepository entregasRepository;

    @Autowired
    EntregadorService entregadorService;

    public List<Entregas> getAll(){
        return entregasRepository.findAll();
    }

    public Optional<Entregas> getById(String id){
        return entregasRepository.findById(id);
    }

    public Entregas create(Entregas entregas){
        return entregasRepository.save(entregas);
    }

    public Entregas update(Entregas entregas){
        if(entregas != null && !entregas.getId().isEmpty())
            return entregasRepository.save(entregas);
        return null;
    }

    public void delete(Entregas entregas){
        if(entregas != null && !entregas.getId().isEmpty())
            entregasRepository.delete(entregas);
    }

    public Entregador atribuirEntregaEntregador(String idEntrega, String idEntregador)
    {
        var entrega = getById(idEntrega).get();
        if(entrega != null)
        {
            var entregador = entregadorService.getById(idEntregador).get();
            entregador.getEntregas().add(entrega);
            return entregadorService.update(entregador);
        }
        return null;
    }

    public void receberTransacao(Transacao transacao){
        Entregas entregas = this.create(new Entregas(null, transacao.getEndereco(), transacao.getPreco(), transacao.getNome(), transacao.getIdCliente(), transacao.getIdProduto()));
    }
}
