package com.example.Delivery.repositorios;

import com.example.Delivery.entidades.Entregador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregadorRepository extends MongoRepository<Entregador, String> {
}
