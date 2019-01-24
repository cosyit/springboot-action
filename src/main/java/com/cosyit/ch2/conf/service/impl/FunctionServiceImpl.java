package com.cosyit.ch2.conf.service.impl;

import com.cosyit.ch2.conf.service.FunctionService;
import org.springframework.stereotype.Service;

public class FunctionServiceImpl implements FunctionService {
    @Override
    public String sayHello(String sayWord) {
        String says = "Hello!" +  sayWord ;
        return says;
    }
}
