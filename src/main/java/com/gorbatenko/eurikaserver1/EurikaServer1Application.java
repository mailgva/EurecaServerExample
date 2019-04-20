package com.gorbatenko.eurikaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurikaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurikaServer1Application.class, args);
    }

}
