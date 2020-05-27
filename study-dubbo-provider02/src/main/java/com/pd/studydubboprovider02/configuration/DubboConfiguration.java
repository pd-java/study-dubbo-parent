package com.pd.studydubboprovider02.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author pengdong
 * @date 2020/5/26 14:18
 * @function
 * @describe
 */
@SpringBootConfiguration
@ImportResource({"classpath*:dubbo-provider.xml"})
@PropertySource(value = {"classpath:dubbo.properties"})
public class DubboConfiguration {
}
