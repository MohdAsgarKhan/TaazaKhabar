package com.accio.TaazaKhabar.Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean  //this annotation used for methods only :
    public RestTemplate getRestTemplate(RestTemplateBuilder  restTemplateBuilder)  {
        return restTemplateBuilder.build();
    }

}
