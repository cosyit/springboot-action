package com.cosyit.ch2.conf.config;

import com.cosyit.ch2.conf.service.FunctionService;
import com.cosyit.ch2.conf.service.impl.FunctionServiceImpl;
import com.cosyit.ch2.conf.uncontroller.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Java配置类。
public class DiConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionServiceImpl();
    }


    @Bean
    public UseFunctionService useFunctionService() {

        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

}
