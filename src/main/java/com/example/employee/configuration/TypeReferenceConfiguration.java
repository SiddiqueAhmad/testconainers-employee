package com.example.employee.configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class TypeReferenceConfiguration {

    @Bean
    public TypeReference<HashMap<String, Object>> typeReference() {
        return new TypeReference<>() {};
    }
}
