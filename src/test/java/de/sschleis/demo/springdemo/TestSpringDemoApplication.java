package de.sschleis.demo.springdemo;

import com.redis.testcontainers.RedisContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
@ActiveProfiles("tc")
public class TestSpringDemoApplication {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
    }

    @Bean
    @ServiceConnection
    GenericContainer<?> redis() {
        return new RedisContainer(DockerImageName.parse("redis:5.0.3-alpine")).withExposedPorts(6379);
    }

    public static void main(String[] args) {
        SpringApplication.from(SpringDemoApplication::main).with(TestSpringDemoApplication.class).run(args);
    }
}
