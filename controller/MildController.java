package com.example.mild.controller;

import java.util.List;

import com.example.mild.domain.MildListDto;
import com.example.mild.service.MildService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MildController {
    
    @Autowired
    private MildService mildService;


    @RequestMapping("mild/openMild.do") 
    public ModelAndView openMildList() throws Exception{
        ModelAndView mv = new ModelAndView("mild/mildList");

        List<MildListDto> list = mildService.selectMildList();
        mv.addObject("list", list);
        return mv;


    }
 
    
    
}
