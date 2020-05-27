package com.pd.studydubboprovider02.controller;

import com.pd.studydubboprovider02.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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


}
