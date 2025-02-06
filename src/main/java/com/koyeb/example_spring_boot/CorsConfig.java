package com.koyeb.example_spring_boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:5173",  // Local frontend
                        "https://koyeb-frontend.vercel.app",  // Production frontend
                        "https://excellent-emili-bandarisgalaxy-5799a647.koyeb.app"  // Backend itself
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Ensure OPTIONS is included
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
