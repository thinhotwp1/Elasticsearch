package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.model.K8SLog;
import com.example.elasticsearchdemo.repository.K8SRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class K8SController {
    @Autowired
    private K8SRepository k8SRepository;

    @GetMapping("/findAllLog")
    public Iterable<K8SLog> findAllLog() {
        return k8SRepository.findAll();
    }

    @GetMapping("/findByName/{type}")
    public List<K8SLog> findByTypeLogs(@PathVariable String type){
        return k8SRepository.findByType(type);
    }

    @PostMapping("/saveK8SLog")
    public int saveCustomer(@RequestBody List<K8SLog> k8SLogs){
        k8SRepository.saveAll(k8SLogs);
        return k8SLogs.size();
    }


}
