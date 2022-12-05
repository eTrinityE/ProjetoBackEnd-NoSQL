package com.example.Ecommerce.service;

import com.example.Ecommerce.entidades.Cliente;
import com.example.Ecommerce.repositorios.ClienteRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ClienteService {
    @Autowired
    ClienteRepsitory clienteRepsitory;

    public List <Cliente> getAll(){
        return clienteRepsitory.findAll();
    }

    public Optional<Cliente> getById(String id){
        return clienteRepsitory.findById(id);
    }

    public Cliente create(Cliente cliente){
        return clienteRepsitory.save(cliente);
    }

    public Cliente update(Cliente cliente){
        if(cliente != null && !cliente.getId().isEmpty())
            return clienteRepsitory.save(cliente);
        return null;
    }

    public void delete(Cliente cliente){
        if(cliente != null && !cliente.getId().isEmpty())
            clienteRepsitory.delete(cliente);
    }



}
