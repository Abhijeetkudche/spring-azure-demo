package com.springSDC.springazuredemo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TodoService {

    private final RestTemplate restTemplate;

    @Autowired
    public TodoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Todo[] fetchTodos() {
        String apiUrl = "https://jsonplaceholder.typicode.com/todos";
        return restTemplate.getForObject(apiUrl, Todo[].class);
    }
}
