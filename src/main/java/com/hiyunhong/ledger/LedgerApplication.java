package com.hiyunhong.ledger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuiyunhong.
 * Created by cuiyunhong on 2020/4/10.
 */
@SpringBootApplication
@RestController(value = "/")
public class LedgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LedgerApplication.class, args);
    }

    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello";
    }
}
