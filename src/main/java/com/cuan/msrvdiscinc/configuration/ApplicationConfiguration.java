package com.cuan.msrvdiscinc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public String httpSuccessMessage() {

        return "Success! The request was processed successfully.";
    }
}