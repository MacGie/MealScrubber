package com.example.cloudywithachanceofmeatballsclient.client;

import org.springframework.web.util.UriComponentsBuilder;

public interface IMealClientSettings {
    String getApikey();
    String getBaseUrl();
    String getVersion();

    default UriComponentsBuilder getUrlBuilder(){
        return UriComponentsBuilder
                .newInstance()
                .scheme("https")
                .host(getBaseUrl())
                .pathSegment(getVersion())
                .queryParam("api_key",getApikey());
    }
}
