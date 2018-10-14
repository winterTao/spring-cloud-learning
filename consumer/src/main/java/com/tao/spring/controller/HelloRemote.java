package com.tao.spring.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author DongTao
 * @since 2018-09-07
 */
@FeignClient(name = "producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

  @RequestMapping(value = "/hello")
  String hello(@RequestParam(value = "name") String name);
}