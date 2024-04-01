package com.example.elasticsearchdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "k8s")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class K8SLog {
    @Id
    private String id;
    private String log;
    private String nameService;
    private String type;
}
