package com.project.opendota.dto;


public class ApiRequest {
    private Integer id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ApiRequest(Integer id){
        this.id = id;
    }

}
