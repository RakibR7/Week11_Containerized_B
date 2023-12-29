package atu.ie.week11_containerized_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week11ContainerizedBApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week11ContainerizedBApplication.class, args);
    }

}
