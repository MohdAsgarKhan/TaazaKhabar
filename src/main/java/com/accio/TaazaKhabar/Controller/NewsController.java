package com.accio.TaazaKhabar.Controller;

import com.accio.TaazaKhabar.Response.NewsResponse;
import com.accio.TaazaKhabar.Service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewService newService;

    @GetMapping("/getNews")
    public NewsResponse getNews(@RequestParam("country") String country, @RequestParam("apiKey") String apiKey) {

        return newService.getNews(country, apiKey);
    }
}
