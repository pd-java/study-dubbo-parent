package com.pd.studydubboprovider.configuration;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.pd.studydubboapi.service.APIService;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengdong
 * @date 2020/5/22 16:05
 * @function
 * @describe
 */
//@Configuration
@SpringBootConfiguration
@ImportResource({"classpath*:dubbo-provider.xml"})
@PropertySource(value = {"classpath:dubbo.properties"})
public class DubboConfiguration {

    /*@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("provider");
        //applicationConfig.setName("provider01");
        //applicationConfig.setName("provider02");
        //applicationConfig.setName("provider03");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        //protocolConfig.setPort(20881);
        //protocolConfig.setPort(20882);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<APIService> apiServiceServiceConfig(APIService apiService) {
        ServiceConfig<APIService> apiServiceServiceConfig = new ServiceConfig<>();
        apiServiceServiceConfig.setInterface(APIService.class);
        apiServiceServiceConfig.setRef(apiService);
        apiServiceServiceConfig.setVersion("1.0.0");

        //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getResult");
        //methodConfig.setTimeout(1000);

        //将method的设置关联到service配置中
        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);
        apiServiceServiceConfig.setMethods(methodConfigs);
        return apiServiceServiceConfig;
    }*/

}
