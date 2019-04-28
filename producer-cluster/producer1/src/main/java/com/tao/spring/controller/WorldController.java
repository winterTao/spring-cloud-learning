package com.tao.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2018-09-21
 */
@RestController
@RequestMapping("/p-api/v1")
public class WorldController {

    @GetMapping("/world")
    public String index() {
        return "hello world";
    }
}
