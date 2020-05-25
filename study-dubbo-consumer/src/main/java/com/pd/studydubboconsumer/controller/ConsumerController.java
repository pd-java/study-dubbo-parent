package com.pd.studydubboconsumer.controller;

import com.pd.studydubboconsumer.service.RPCInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengdong
 * @date 2020/5/22 16:26
 * @function
 * @describe
 */
@RestController
public class ConsumerController {

    @Autowired
    private RPCInterface rpcInterface;

    @RequestMapping("/testRpc")
    @ResponseBody
    public String testRpc(){
        System.out.println("welcome to consumer");
        String resultString = rpcInterface.getResult();
        System.out.println("controller调用接口结果： " + resultString);
        return "welcome to consumer" + resultString;
        //return "welcome to consumer";
    }

}
