package com.imie.webapp;

import com.imie.webapp.repository.FormationProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.imie.webapp.config")
public class AppConfig {
    // code de configuration ici
    @Bean
    public FormationProxy formationProxy(String apiUrl, RestTemplate restTemplate) {
        return new FormationProxy(apiUrl, restTemplate);
    }
}
