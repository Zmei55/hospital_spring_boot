package com.hospital;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Bean
    public OpenAPI baseOpenApi() {
        return new OpenAPI().info(new Info()
                .title("Hospital")
                .version("1.0.0")
                .description("Hospital REST API")
        );
    }
}
