package com.tao.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2018-09-07
 */
@RestController
public class ConsumerController {

  @Autowired
  HelloRemote helloRemote;

  @GetMapping("/hello/{name}")
  public String index(@PathVariable("name") String name) {
    return helloRemote.hello(name);
  }

}
