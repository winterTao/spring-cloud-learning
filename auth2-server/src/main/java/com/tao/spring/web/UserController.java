package com.tao.spring.web;

import java.security.Principal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DongTao
 * @since 2019-01-19
 */
@Slf4j
@RestController
public class UserController {

    @GetMapping(value = "/users/current")
    public Principal getUser(Principal principal) {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        log.info(principal.toString());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>");
        return principal;
    }
}
