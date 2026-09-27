package org.example.t1feigngrupo08pregunta2.restclient.config;

import feign.codec.ErrorDecoder;
import org.example.t1feigngrupo08pregunta2.restclient.errorhandler.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FeignConfig {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
