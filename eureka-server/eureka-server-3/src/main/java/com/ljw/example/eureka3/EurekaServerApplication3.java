package com.ljw.example.eureka3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 *
 * </p>
 *
 * @author luojiawei
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication3 {
    public static  void  main(String[] args){
        SpringApplication.run(EurekaServerApplication3.class, args);
    }
}
