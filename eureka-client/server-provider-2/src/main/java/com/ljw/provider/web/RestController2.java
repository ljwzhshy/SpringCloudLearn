package com.ljw.provider.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author luojiawei
 */
@RestController
public class RestController2 {
    @RequestMapping("/test2")
    public  String test(){
        return "hello, I'm RestController2";
    }
}
