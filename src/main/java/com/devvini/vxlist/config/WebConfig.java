package com.devvini.vxlist.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

	/*Ãqui estou pegando uma variavel do meu sistema que é a que ta no application properties*/
	@Value("${cors.origins}")
	private String corsOrigins;

	
	// classe especifica do spring
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*").allowedOrigins(corsOrigins);// Aqui eu to fazendo a configuração para permitir acesso somente aos endereços que estiverem nessa variavel
			}
		};
	}

}
