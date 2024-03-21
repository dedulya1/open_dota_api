package com.project.opendota.controller;

import com.project.opendota.dto.ApiRequest;
import com.project.opendota.dto.ApiResponse;
import com.project.opendota.service.ApiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final ApiService apiService;

    public ApiController(ApiService apiService){
        this.apiService = apiService;
    }

    @GetMapping("/search")
    public ApiResponse getById(@RequestParam Integer id){
        return apiService.getById(new ApiRequest(id));
    }
}
