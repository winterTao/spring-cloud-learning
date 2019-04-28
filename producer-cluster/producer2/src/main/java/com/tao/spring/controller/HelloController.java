package com.tao.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/p-api/v1")
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "DFZQ REST API: version 1.0";
    }

    @GetMapping("/me")
    public String me() {
        return "HELLO WORLD";
    }

    @GetMapping("/version")
    public String version() {
        return "version 1.0";
    }

    @GetMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is producer 2 message";
    }
}