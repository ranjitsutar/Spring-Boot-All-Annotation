package com.ranjit.annotation.config;

import com.ranjit.annotation.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:MyProperties.properties")
public class MyConfig {

    @Bean
    public ProductService productService(){
        return  new ProductService();
    }

}
