package com.example.Delivery.repositorios;

import com.example.Delivery.entidades.Entregas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregasRepository  extends MongoRepository<Entregas, String> {
}
