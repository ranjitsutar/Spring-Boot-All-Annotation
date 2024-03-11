package com.ranjit.annotation;

import com.ranjit.annotation.service.CategoryService;
import com.ranjit.annotation.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class AnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(AnnotationApplication.class, args);
		ProductService bean = container.getBean(ProductService.class);
		System.out.println(bean);
		bean.createProduct();

		CategoryService bean1 = container.getBean(CategoryService.class);
		System.out.println(bean1);

	}



}
