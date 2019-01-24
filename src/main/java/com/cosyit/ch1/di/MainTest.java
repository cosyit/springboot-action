package com.cosyit.ch1.di;

import com.cosyit.ch1.di.config.DiConfig;
import com.cosyit.ch1.di.uncontroller.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTest {

    //原生JDK 的日志对象声明方法。
    private static Logger logger = Logger.getLogger(MainTest.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DiConfig.class);
        //直接拿最外层的对象，看能否调用内层的方法。
        UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
        String sayWhat =  useFunctionService.sayHello("\n\n          改革春风照大地，中国人民真争气！");
        logger.log(Level.INFO,sayWhat);
    }
}