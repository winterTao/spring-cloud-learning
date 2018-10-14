package com.tao.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DongTao
 * @since 2018-10-05
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Producer2Application {

  public static void main(String[] args) {
    SpringApplication.run(Producer2Application.class, args);
  }

}
