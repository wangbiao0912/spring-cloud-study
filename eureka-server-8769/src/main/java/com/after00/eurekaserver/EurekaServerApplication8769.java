package com.after00.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 使用Eureka做服务发现.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication8769 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication8769.class, args);
  }

}
