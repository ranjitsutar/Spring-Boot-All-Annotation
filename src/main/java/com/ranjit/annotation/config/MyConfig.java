package com.ranjit.annotation.config;

import com.ranjit.annotation.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ProductService productService(){
        return  new ProductService();
    }

}
