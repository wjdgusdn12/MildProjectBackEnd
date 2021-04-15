package com.example.mild.controller;

import java.util.List;

import com.example.mild.domain.MildListDto;
import com.example.mild.service.MildService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiMildController {
    @Autowired
    private MildService mildService;

    @RequestMapping(value="/api/mild",method = RequestMethod.GET)
    public List<MildListDto> openMildList() throws Exception{
        return mildService.selectMildList();
    }

    
}
