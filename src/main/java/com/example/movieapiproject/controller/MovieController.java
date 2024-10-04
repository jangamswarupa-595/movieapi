package com.example.movieapiproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieapiproject.entity.Movie;
import com.example.movieapiproject.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    // POST request to add movies using the Movie entity
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        // Call the service to save the movie
        movieService.saveMovie(movie);
        return "Movie added successfully!";
    }
}