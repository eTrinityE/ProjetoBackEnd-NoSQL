package com.example.Log.service;

import com.example.Log.entidades.Log;
import com.example.Log.repositories.LogRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    private LogRepositorie logRepositorie;
//    @Autowired
//    public LogService(LogRepositorie logRepositorie) {
//        this.logRepositorie = logRepositorie;
//    }
    public List<Log> findAll() {
        return logRepositorie.findAll();
    }
    public Log findById(String id) {
        var currentInventory = logRepositorie.findById(id).stream()
                .findFirst().orElse(null);

        return currentInventory;
    }
    public Log create(Log log) {
        var newLog = logRepositorie.save(log);
        return newLog;
    }
}
