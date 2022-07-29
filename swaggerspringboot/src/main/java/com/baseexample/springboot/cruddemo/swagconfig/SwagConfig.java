package com.baseexample.springboot.cruddemo.swagconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import  static springfox.documentation.builders.PathSelectors.regex;

@Configuration


public class SwagConfig {
    @Bean
	public Docket getbean() {
		
		
		return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/api/.*")).build().apiInfo(getInfo());
				
	}
    
    private ApiInfo getInfo() {
    	
    	
    	
    	return  new  ApiInfoBuilder().title("Enugula Sravan Kumar").description("swagger3").license("hhhhhh").build();
}
    
}
