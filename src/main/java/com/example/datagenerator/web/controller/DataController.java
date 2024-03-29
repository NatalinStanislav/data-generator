package com.example.datagenerator.web.controller;

import com.example.datagenerator.model.Data;
import com.example.datagenerator.model.test.DataTestOptions;
import com.example.datagenerator.service.KafkaDataService;
import com.example.datagenerator.service.TestDataService;
import com.example.datagenerator.web.dto.DataDto;
import com.example.datagenerator.web.dto.DataTestOptionsDto;
import com.example.datagenerator.web.mapper.DataMapper;
import com.example.datagenerator.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dto);
        testDataService.sendMessages(testOptions);

    }
}
