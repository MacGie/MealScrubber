package com.example.cloudywithachanceofmeatballsclient.client;

import com.example.cloudywithachanceofmeatballsclient.contract.MealListDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MealClient implements IMealClient {
    RestTemplate restClient;
    String baseUrl;
    String apiKey;
    String version;
    private final IMealClientSettings _settings;

    public MealClient(IMealClientSettings settings){
        restClient=new RestTemplate();
        this.baseUrl= settings.getBaseUrl();
        this.apiKey=settings.getApikey();
        this.version=settings.getVersion();
        _settings=settings;
    }

    @Override
    public MealListDto getMealsByName(String name) {
        var url=_settings.getUrlBuilder()
                .path("/s="+name)
                .build()
                .toUriString();
        var response=restClient.getForEntity(url,MealListDto.class).getBody();
        return response;
    }
}
