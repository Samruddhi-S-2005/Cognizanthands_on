package com.cognizant.junit;

public class ApiService {

    private final ExternalApi api;

    public ApiService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}