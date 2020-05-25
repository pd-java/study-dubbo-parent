package com.pd.studydubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pd.studydubboapi.service.APIService;
import com.pd.studydubboconsumer.service.RPCInterface;
import org.springframework.stereotype.Service;

/**
 * @author pengdong
 * @date 2020/5/22 16:29
 * @function
 * @describe
 */
@Service
public class RPCInterfaceImpl implements RPCInterface {

    @Reference(version = "1.0.0", loadbalance = "random", retries = 3,timeout = 1000)       //负载均衡随机
    //@Reference(version = "1.0.0", loadbalance = "roundrobin")     //负载均衡轮询
    APIService apiService;

    @HystrixCommand(fallbackMethod = "hystrixTest")
    @Override
    public String getResult() {
        System.out.println("进入接口，进行rpc请求了");
        return apiService.getResult("123");
    }

    public String hystrixTest() {
        System.out.println("hystrixTest function done");
        return "hystrixTest doing。。。。";
    }
}
