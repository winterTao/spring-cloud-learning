package com.tao.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2018-09-07
 */
@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String index() {
        return "port is : " + port;
    }

}
