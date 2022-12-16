package com.example.Ecommerce.repositorios;

import java.util.List;

import com.example.Ecommerce.entidades.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends MongoRepository<Produtos, String> {

    List<Produtos> findByNome (String nome);
}
