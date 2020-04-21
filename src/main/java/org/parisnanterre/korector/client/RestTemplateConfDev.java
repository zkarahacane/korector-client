package org.parisnanterre.korector.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfDev {
    @Bean("ribbon-template")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
