package com.project.opendota.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.opendota.dto.ApiRequest;
import com.project.opendota.dto.ApiResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    private final ObjectMapper objectMapper;
    RestTemplate restTemplate;

    public ApiService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ApiResponse getById(ApiRequest externalApiRequest) {
        try {
            restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            String url = "https://api.opendota.com/api/players/" + externalApiRequest.getId();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
            JsonNode jsonNode = objectMapper.readTree(response.getBody());

            jsonNode = jsonNode.get("profile");
            return new ApiResponse(jsonNode.get("personaname").asText(),
                    jsonNode.get("name").asText(),
                    jsonNode.get("plus").asBoolean(),
                    jsonNode.get("steamid").asText());
        } catch (Exception exception) {
            return null;
        }
    }
}
