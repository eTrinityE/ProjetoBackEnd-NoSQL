package com.example.Log.controllers;

import com.example.Log.entidades.Log;
import com.example.Log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;
//    @Autowired
//    public LogController(LogService logService) {
//        this.logService = logService;
//    }

    @GetMapping("/{id}")
    public Log findById(@PathVariable String id) {
        return logService.findById(id);
    }

    @GetMapping
    public List<Log> findAll() {
        return logService.findAll();
    }

    @PostMapping
    public Log create(@RequestBody Log log) {
        return logService.create(log);
    }
}
