package com.citycloud.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 孟帅
 * @since 2022/3/31
 */
@Controller
public class TestController {
    @RequestMapping("aa")
    public String aa() {
        return "success";
    }
}
