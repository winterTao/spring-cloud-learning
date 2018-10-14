package com.tao.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author DongTao
 * @since 2018-09-21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Value("${server.port}")
  private String port;

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("spring cloud learning")
        .description("swagger")
        .termsOfServiceUrl("http://localhost:" + port)
        .contact(new Contact("tao", "", ""))
        .version("1.0")
        .build();
  }
}