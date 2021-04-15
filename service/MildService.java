package com.example.mild.service;

import java.util.List;

import com.example.mild.domain.MildListDto;

public interface MildService {
    List<MildListDto> selectMildList() throws Exception;
}