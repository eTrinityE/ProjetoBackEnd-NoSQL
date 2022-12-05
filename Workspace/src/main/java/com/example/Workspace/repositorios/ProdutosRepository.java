package com.example.Workspace.repositorios;

import com.example.Workspace.entidades.Produtos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutosRepository  extends MongoRepository<Produtos, String> {
}
