package com.ranjit.annotation.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ConditionalOnProperty(name = "db.active", havingValue = "true")
public class DbConfig {

    @Bean
    @Scope("prototype")
    public  DbDataSource dbDataSource(){
        return  new DbDataSource();
    }

}
