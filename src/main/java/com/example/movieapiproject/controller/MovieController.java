/*package com.example.movieapiproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieapiproject.entity.Movie;
import com.example.movieapiproject.service.MovieService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  // Allow requests from the frontend's origin
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return "Movie added successfully!";
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}*/


package com.example.movieapiproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.movieapiproject.entity.Movie;
import com.example.movieapiproject.service.MovieService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from the React frontend
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    // POST request to add a movie using the Movie entity
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie); // Call the service to save the movie
        return "Movie added successfully!";
    }

    // GET request to fetch the list of all movies
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies(); // Call the service to fetch all movies
    }

    // Optional: GET request to fetch a specific movie by its ID
    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id); // Fetch the movie by its ID
    }

    // Optional: DELETE request to delete a movie by its ID
    @DeleteMapping("/movies/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id); // Delete the movie by its ID
        return "Movie deleted successfully!";
    }
}

