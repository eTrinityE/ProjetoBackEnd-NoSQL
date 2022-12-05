package com.example.Ecommerce.repositorios;

import com.example.Ecommerce.entidades.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepsitory extends MongoRepository<Cliente, String> {
}
