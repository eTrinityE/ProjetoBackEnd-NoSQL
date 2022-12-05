package com.example.Ecommerce.controller;

import com.example.Ecommerce.entidades.Produtos;
import com.example.Ecommerce.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosService produtosService;

    @GetMapping
    public List<Produtos> getProduto() {
        return produtosService.getAll();
    };

    @GetMapping("/{id}")
    public Optional<Produtos> getProdutoById(@PathVariable String id) {
        return produtosService.getById(id);
    };

    @PostMapping
    public Produtos saveProduto(@RequestBody Produtos produtos){
        return produtosService.create(produtos);
    }

    @PutMapping
    public Produtos updateProduto(@RequestBody Produtos produtos){
        return produtosService.update(produtos);
    }

    @DeleteMapping
    public void deleteProduto(Produtos produtos){
        if(produtos != null && !produtos.getId().isEmpty())
            produtosService.delete(produtos);
    }


}
