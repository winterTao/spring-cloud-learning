package com.tao.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author DongTao
 * @since 2018-10-09
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZuulClientApplication.class, args);
  }
}
