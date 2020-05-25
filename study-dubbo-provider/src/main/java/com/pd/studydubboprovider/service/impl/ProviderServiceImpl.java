package com.pd.studydubboprovider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pd.studydubboapi.service.APIService;
import com.pd.studydubboprovider.service.ProviderService;

import java.util.Random;

/**
 * @author pengdong
 * @date 2020/5/22 16:08
 * @function
 * @describe
 */
@org.springframework.stereotype.Service
@Service(version = "1.0.0")
public class ProviderServiceImpl implements APIService, ProviderService {


    @HystrixCommand
    @Override
    public String getResult(String resultInfo) {
        System.out.println("provider: 连接上了。。 provider01。。。");
        //System.out.println("provider: 连接上了。。 provider02。。。");
        //System.out.println("provider: 连接上了。。 provider03。。。");
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        if(Math.random() > 0.5) {
            throw new RuntimeException();
        }
        System.out.println("resultInfo= " + resultInfo);
        return "1111111111111";
    }

    @Override
    public String testProviderSelf() {
        System.out.println("provider 自身调用成功");
        return "testProviderSelf success";
    }
}
