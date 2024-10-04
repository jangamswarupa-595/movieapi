package com.example.movieapiproject.service;

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
}