package com.example.elasticsearchdemo.repository;

import com.example.elasticsearchdemo.model.K8SLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface K8SRepository extends ElasticsearchRepository<K8SLog, String> {

    List<K8SLog> findByType(String type);
}
