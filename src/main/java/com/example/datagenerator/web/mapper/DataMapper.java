package com.example.datagenerator.web.mapper;

import com.example.datagenerator.model.Data;
import com.example.datagenerator.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
