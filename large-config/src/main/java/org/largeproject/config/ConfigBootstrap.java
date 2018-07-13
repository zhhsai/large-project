package org.largeproject.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * User: ZHS
 * Date: 2018/7/11 20:14
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(ConfigBootstrap.class, args);
    }
}
