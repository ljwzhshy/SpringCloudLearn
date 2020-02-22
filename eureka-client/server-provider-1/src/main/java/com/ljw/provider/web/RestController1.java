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
public class RestController1 {
    @RequestMapping("/test1")
    public  String test(){
        return "hello, I'm RestController1";
    }

}
