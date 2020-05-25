package com.pd.studydubboprovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//@EnableDubbo(scanBasePackages = "com.pd.studydubboprovider.service")
//@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class StudyDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyDubboProviderApplication.class, args);
    }

}

