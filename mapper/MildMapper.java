package com.example.mild.mapper;

import java.util.List;

import com.example.mild.domain.MildListDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper 
public interface MildMapper {
    List<MildListDto> selectMildList() throws Exception;
    //test
}
