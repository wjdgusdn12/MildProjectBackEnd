package com.example.mild.service;

import java.util.List;

import com.example.mild.domain.MildListDto;
import com.example.mild.mapper.MildMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MildServiceImpl implements MildService {
   
   
    @Autowired
    private MildMapper mildMapper;  

    @Override 
    public List<MildListDto> selectMildList() throws Exception {
  
        return mildMapper.selectMildList();
 
    }
    
}
