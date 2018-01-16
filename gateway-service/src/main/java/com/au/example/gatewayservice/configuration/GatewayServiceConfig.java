package com.au.example.gatewayservice.configuration;

import com.au.example.gatewayservice.filter.AddReguestHeaderFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ayhan.Ugurlu on 16/01/2018
 */
@Configuration
public class GatewayServiceConfig {

    @Bean
    public AddReguestHeaderFilter addReguestHeaderFilter(){
        return new AddReguestHeaderFilter();
    }
}
