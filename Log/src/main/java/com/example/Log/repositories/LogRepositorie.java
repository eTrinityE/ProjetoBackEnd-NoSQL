package com.example.Log.repositories;

import com.example.Log.entidades.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepositorie extends MongoRepository<Log, String> {
}
