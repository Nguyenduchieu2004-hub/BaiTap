package com.example.cauthu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // map URL /images/** tới thư mục /images/ trong webapp
        registry.addResourceHandler("/images/**")
                .addResourceLocations("/images/");
    }
}
