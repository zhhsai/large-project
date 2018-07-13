package org.largeproject.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * User: ZHS
 * Date: 2018/7/11 19:32
 */
@SpringBootApplication
@MapperScan("org.largeproject.core.mapper")
public class CoreBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(CoreBootstrap.class, args);
    }
}
