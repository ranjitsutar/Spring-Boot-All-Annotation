package com.ranjit.annotation;

import com.ranjit.annotation.config.MyPropertiesFileConfig;
import com.ranjit.annotation.service.CategoryService;
import com.ranjit.annotation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class AnnotationApplication implements CommandLineRunner {

	@Autowired
	private MyPropertiesFileConfig myPropertiesFileConfig;

	public static void main(String[] args) {
		ConfigurableApplicationContext container= SpringApplication.run(AnnotationApplication.class, args);
		ProductService bean = container.getBean(ProductService.class);
		System.out.println(bean);
		bean.createProduct();

		CategoryService bean1 = container.getBean(CategoryService.class);
		System.out.println(bean1);
		bean1.getProductService().createProduct();

		bean1.getCardService().addCard();

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(myPropertiesFileConfig.getName());
		System.out.println(myPropertiesFileConfig.getPort());
		System.out.println(myPropertiesFileConfig.getdB());


	}
}
