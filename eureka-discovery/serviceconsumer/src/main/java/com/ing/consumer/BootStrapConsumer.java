package com.ing.consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by ing on 2019-02-23.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BootStrapConsumer {
    public static void main(String[] args) {
        SpringApplication.run(BootStrapConsumer.class,args);
    }
}
