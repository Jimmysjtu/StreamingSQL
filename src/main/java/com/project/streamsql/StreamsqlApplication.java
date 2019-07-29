package com.project.streamsql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.project.streamsql")
@EnableTransactionManagement(proxyTargetClass = true)
public class StreamsqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamsqlApplication.class, args);
    }

}
