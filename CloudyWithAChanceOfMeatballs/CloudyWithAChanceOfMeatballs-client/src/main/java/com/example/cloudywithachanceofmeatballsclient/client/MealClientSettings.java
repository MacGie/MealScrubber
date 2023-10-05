package com.example.cloudywithachanceofmeatballsclient.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MealClientSettings implements IMealClientSettings {
    @Value("${themealdb.api.key}")
    private String apiKey;
    @Value("${themealdb.api.version}")
    private String apiVersion;
    @Value("${themealdb.api.host}")
    private String apiHost;
    @Override
    public String getApikey() {
        return apiKey;
    }

    @Override
    public String getBaseUrl() {
        return apiHost;
    }

    @Override
    public String getVersion() {
        return apiVersion;
    }
}
