package org.largeproject.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.largeproject.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * User: ZHS
 * Date: 2018/7/13 16:37
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreBootstrap.class)
public class Test123 {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        userService.findAll();
    }
}
