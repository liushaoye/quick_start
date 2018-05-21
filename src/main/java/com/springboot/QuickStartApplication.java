package com.springboot;

import com.springboot.com.springboot.bean.Jeep;
import com.springboot.properties.TomcatProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/******************************
 * @Author : liuyang
 * @ClassName : QuickStartApplication
 * @Date : 2018 五月  21
 * @Time : 19:05:831
 * @Type : SpringBoot
 * @Version : 1.0
 * @Return :
 * @Description :
 *
 *
 *  是用来启用一个特性的,可以把配置文件的属性注入到bean里面去
 *
 *
 *******************************/
@EnableConfigurationProperties
@ComponentScan
@EnableAutoConfiguration
@EnableAsync
public class QuickStartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);
        // tomcat配置文件
        System.out.println(applicationContext.getBean(TomcatProperties.class));

        // runnable配置测试
        applicationContext.getBean(Runnable.class).run();

        System.out.println("------------------end--------------------");
        applicationContext.close();

    }
}
