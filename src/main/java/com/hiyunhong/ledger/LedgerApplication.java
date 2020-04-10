package com.hiyunhong.ledger;

import com.hiyunhong.ledger.dao.TestEntityMapper;
import com.hiyunhong.ledger.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestEntityMapper testEntityMapper;

    public static void main(String[] args) {
        SpringApplication.run(LedgerApplication.class, args);
    }

    @GetMapping(value = "/hello")
    public String greeting() {
        TestEntity testEntity = testEntityMapper.selectByPrimaryKey(1);
        return testEntity.getName();
    }
}
