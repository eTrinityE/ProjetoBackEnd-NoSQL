package com.example.Ecommerce.controller;

import com.example.Ecommerce.entidades.Cliente;
import com.example.Ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getCliente() {
        return clienteService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable String id) {
        return clienteService.getById(id);
    };

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente){
        return clienteService.create(cliente);
    }

    @PutMapping
    public Cliente updateCliente(@RequestBody Cliente cliente){
        return clienteService.update(cliente);
    }

    @DeleteMapping
    public void deleteCliente(Cliente cliente){
        if(cliente != null && !cliente.getId().isEmpty())
            clienteService.delete(cliente);
    }
}
