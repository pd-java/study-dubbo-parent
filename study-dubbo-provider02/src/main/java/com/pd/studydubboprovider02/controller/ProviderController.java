package com.pd.studydubboprovider02.controller;

import com.pd.studydubboapi.service.APIService;
import com.pd.studydubboprovider02.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author pengdong
 * @date 2020/5/26 14:18
 * @function
 * @describe
 */
@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @Resource(name = "providerService00")
    private APIService apiService;


}
