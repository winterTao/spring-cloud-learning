package com.tao.spring.web;

import java.security.Principal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2018-10-15
 */
@Slf4j
@RestController
public class TestEndpointsController {

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        return "product id : " + id;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        return "order id : " + id;
    }

    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication,
            Principal principal, Authentication authentication) {
        if (oAuth2Authentication != null) {
            log.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
            log.info(oAuth2Authentication.toString());
        }

        if (principal != null) {
            log.info("principal.toString() " + principal.toString());
            log.info("principal.getName() " + principal.getName());
        }

        if (authentication != null) {
            log.info("authentication: " + authentication.getAuthorities().toString());
        }
        return oAuth2Authentication;
    }
}