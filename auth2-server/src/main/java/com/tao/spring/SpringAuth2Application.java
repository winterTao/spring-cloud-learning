package com.tao.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DongTao
 * @since 2018-10-15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringAuth2Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringAuth2Application.class, args);
  }

}
