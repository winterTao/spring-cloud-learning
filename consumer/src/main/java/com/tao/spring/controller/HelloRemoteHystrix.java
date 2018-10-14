package com.tao.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author DongTao
 * @since 2018-09-10
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

  @Override
  public String hello(@RequestParam(value = "name") String name) {
    return "hello " + name + ", this message send failed ";
  }
}
