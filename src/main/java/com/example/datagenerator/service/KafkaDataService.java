package com.example.datagenerator.service;

import com.example.datagenerator.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
