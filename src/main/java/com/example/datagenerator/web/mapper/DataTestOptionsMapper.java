package com.example.datagenerator.web.mapper;

import com.example.datagenerator.model.test.DataTestOptions;
import com.example.datagenerator.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
