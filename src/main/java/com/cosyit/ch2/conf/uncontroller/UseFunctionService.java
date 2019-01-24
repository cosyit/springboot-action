package com.cosyit.ch2.conf.uncontroller;

import com.cosyit.ch2.conf.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UseFunctionService {

    private FunctionService functionService;


    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return  functionService.sayHello(word);
    }
}
