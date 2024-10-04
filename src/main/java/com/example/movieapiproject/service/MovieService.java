/*package com.example.movieapiproject.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieapiproject.entity.Movie;
import com.example.movieapiproject.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);  // Persist the movie to the DB
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);  // Fetch movie from the DB
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}*/


package com.example.movieapiproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieapiproject.entity.Movie;
import com.example.movieapiproject.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Save a new movie to the database
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie); // Persist the movie to the database
    }

    // Fetch a movie by its ID
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null); // Return the movie if found, otherwise return null
    }

    // Fetch all movies from the database
    public List<Movie> getAllMovies() {
        return movieRepository.findAll(); // Return the list of all movies
    }

    // Delete a movie by its ID (Optional feature if needed)
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
