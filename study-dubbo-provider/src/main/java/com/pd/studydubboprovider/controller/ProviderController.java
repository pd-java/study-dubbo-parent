package com.pd.studydubboprovider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pd.studydubboapi.service.APIService;
import com.pd.studydubboprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengdong
 * @date 2020/5/23 15:30
 * @function
 * @describe
 */
@RestController
public class ProviderController {

    /*@Reference(version = "1.0.0")
    private APIService apiService;*/

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/providerTest")
    public String ProviderTest() {
        providerService.testProviderSelf();
        return "ProviderTest";
    }
}
