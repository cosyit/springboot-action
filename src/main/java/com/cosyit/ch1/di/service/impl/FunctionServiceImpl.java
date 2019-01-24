package com.cosyit.ch1.di.service.impl;

import com.cosyit.ch1.di.service.FunctionService;
import org.springframework.stereotype.Service;


@Service
public class FunctionServiceImpl implements FunctionService {
    @Override
    public String sayHello(String sayWord) {
        String says = "Hello!" +  sayWord ;
        return says;
    }
}
