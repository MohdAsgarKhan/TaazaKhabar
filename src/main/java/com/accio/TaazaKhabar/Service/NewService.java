package com.accio.TaazaKhabar.Service;

import com.accio.TaazaKhabar.Config.RestTemplateConfig;
import com.accio.TaazaKhabar.Response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewService {

    @Autowired
    RestTemplate restTemplate;

    public NewsResponse getNews(String country, String apiKey) {
        String url = getUrl(country,apiKey);
        return restTemplate.getForObject(url,NewsResponse.class); //This is how we call external apis
        //url and response of your class type-->response is of Object class

    }
    public String getUrl(String country, String apiKey) {
        return "https://newsapi.org/v2/top-headlines?country=" +country +
                "&apiKey="+apiKey;
    }
}
