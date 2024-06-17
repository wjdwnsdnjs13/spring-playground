package org.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
			.components(new Components())
			.info(apiInfo());
	}

	private Info apiInfo() {
		return new Info()
			.title("디프만 15기 6팀 서버 JPA 스터디") // API의 제목
			.description("디프만 15기 6팀 서버 JPA 스터디 API 명세서") // API에 대한 설명
			.version("1.0.0"); // API의 버전
	}
}
