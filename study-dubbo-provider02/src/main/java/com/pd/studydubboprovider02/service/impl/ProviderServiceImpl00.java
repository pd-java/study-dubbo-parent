package com.pd.studydubboprovider02.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pd.studydubboapi.service.APIService;

/**
 * @author pengdong
 * @date 2020/5/28 20:51
 * @function
 * @describe
 */
@org.springframework.stereotype.Service(value = "providerService00")
@Service(version = "1.0.0")
public class ProviderServiceImpl00 implements APIService {

    @Override
    public String getResult(String resultInfo) {
        System.out.println("this is provider02 getResult.。。。。。Impl00。。。");
        System.out.println("resultInfo="+resultInfo);
        return "provider02 get success";
    }
}
