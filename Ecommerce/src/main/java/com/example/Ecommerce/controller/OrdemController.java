package com.example.Ecommerce.controller;

import com.example.Ecommerce.dto.OrderDTO;
import com.example.Ecommerce.entidades.Ordem;
import com.example.Ecommerce.service.OrdemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordem")
public class OrdemController {
    @Autowired
    private OrdemService ordemService;

    @PostMapping
    public Ordem createOrdem(@RequestBody OrderDTO orderDTO){
        return ordemService.createOrdem(orderDTO.getIdCliente(),orderDTO.getIdProduto(), orderDTO.getEndereco());
    }
}
