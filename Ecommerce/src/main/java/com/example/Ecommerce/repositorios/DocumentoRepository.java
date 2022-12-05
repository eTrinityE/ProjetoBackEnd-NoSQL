package com.example.Ecommerce.repositorios;

import com.example.Ecommerce.entidades.Documento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends MongoRepository<Documento, String> {
}
