package com.ing.provider.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by ing on 2019-02-23.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BootStrapProvider {
    public static void main(String[] args) {
        SpringApplication.run(BootStrapProvider.class,args);
    }
}
