package com.springSDC.springazuredemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.springSDC.springazuredemo.com.Todo;

@Controller
public class TodoController {

    @GetMapping("/")
    public String index(Model model) {
        // Fetch data from the API
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://jsonplaceholder.typicode.com/todos";
        Todo[] todos = restTemplate.getForObject(apiUrl, Todo[].class);

        // Add data to the model
        model.addAttribute("todos", todos);
        return "index";
    }
}
