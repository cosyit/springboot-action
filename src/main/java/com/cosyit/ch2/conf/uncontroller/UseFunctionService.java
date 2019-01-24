package com.cosyit.ch2.conf.uncontroller;

import com.cosyit.ch2.conf.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;


    public String sayHello(String word){
        return  functionService.sayHello(word);
    }
}
