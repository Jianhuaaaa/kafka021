package com.jsun.kafka.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customizeOpenApi() {
        return new OpenAPI().info(
                new Info()
                        .title("Kafka Practice")
                        .version("1.0")
                        .description("This is Apache Kafka learning API with Swagger UI document."));
    }
}
