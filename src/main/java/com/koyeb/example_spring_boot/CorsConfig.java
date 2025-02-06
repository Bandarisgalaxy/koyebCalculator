package com.koyeb.example_spring_boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class CorsConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedOrigins("http://localhost:5173",
                            "https://excellent-emili-bandarisgalaxy-5799a647.koyeb.app/")  // Specify your frontend URL here
                    .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify allowed methods
                    .allowedHeaders("*")  // Allow all headers
                    .allowCredentials(true);  // Allow credentials (cookies, authorization headers, etc.)
        }
    }