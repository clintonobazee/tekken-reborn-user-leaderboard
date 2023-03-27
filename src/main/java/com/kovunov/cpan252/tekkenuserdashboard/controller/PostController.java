package com.kovunov.cpan252.tekkenuserdashboard.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kovunov.cpan252.tekkenuserdashboard.model.PostDto;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private RestTemplate restTemplate;

    public PostController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<PostDto[]> getPosts() {
        return restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts",
         PostDto[].class);
    }

}
