package com.example.Ecommerce.repositorios;

import com.example.Ecommerce.entidades.Ordem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdemRepository extends MongoRepository <Ordem, String> {
}
