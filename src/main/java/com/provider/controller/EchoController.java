package com.provider.controller;

import com.provider.bean.ConfigDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : zhaofei
 * @create 2024/5/10 11:14
 */
@RestController
public class EchoController {
    @Autowired
    private ConfigDemo configDemo;

    @GetMapping("/echo-provider")
    @ResponseBody
    public ResponseEntity<String> echo(){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("echo-from", "aliyun-aes-cloudnative");
        return ResponseEntity.ok().headers(responseHeaders).body("config content is: " + configDemo.getContent());
    }
}
