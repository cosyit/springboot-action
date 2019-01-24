package com.cosyit.ch2.conf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Java配置类。
@ComponentScan("com.cosyit.ch1.di")  //扫描所有@Component组件，加入到Spring 容器。
public class DiConfig {
}
