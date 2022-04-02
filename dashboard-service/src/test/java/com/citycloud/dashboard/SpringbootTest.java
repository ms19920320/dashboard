/*
 *  城云科技 ©1997-2022
 */

package com.citycloud.dashboard;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * 自定义单元测试
 *
 * @author 孟帅
 * @since 2022/3/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTest {

    @org.junit.Test
    public void getUuid() {
        for (int i = 0; i < 20; i++) {
            System.out.println(UUID.randomUUID());
        }
    }

}
