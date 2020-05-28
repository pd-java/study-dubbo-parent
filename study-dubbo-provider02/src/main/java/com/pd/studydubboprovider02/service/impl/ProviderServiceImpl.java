package com.pd.studydubboprovider02.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pd.studydubboapi.service.APIService;
import com.pd.studydubboapi.service.APIService02;
import com.pd.studydubboprovider02.service.ProviderService;

/**
 * @author pengdong
 * @date 2020/5/26 14:19
 * @function
 * @describe
 */
@org.springframework.stereotype.Service
@Service(version = "1.0.0")
public class ProviderServiceImpl implements APIService02,ProviderService {

    @Override
    public String getInfoByProvider02(String info) {
        System.out.println("this is provider02 .copy02-1。。。。");
        //System.out.println("this is provider02 copy02-2.。。。。");
        System.out.println("info="+info);
        return "provider get success";
    }

}
