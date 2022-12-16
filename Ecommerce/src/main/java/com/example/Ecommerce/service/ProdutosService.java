package com.example.Ecommerce.service;

import com.example.Ecommerce.entidades.Produtos;
import com.example.Ecommerce.repositorios.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProdutosService {
    @Autowired
    ProdutosRepository produtosRepository;

    public List <Produtos> getAll(){
        return produtosRepository.findAll();
    }

    public Optional<Produtos> getById(String id){
        return produtosRepository.findById(id);
    }

    public Produtos create(Produtos produtos){
        return produtosRepository.save(produtos);
    }

    public Produtos update(Produtos produtos){
        if(produtos != null && !produtos.getId().isEmpty())
            return produtosRepository.save(produtos);
        return null;
    }

    public void delete(Produtos produtos){
        if(produtos != null && !produtos.getId().isEmpty())
            produtosRepository.delete(produtos);
    }

    public List<Produtos> getByNome(String nome){
        return produtosRepository.findByNome(nome);
    }
}
























