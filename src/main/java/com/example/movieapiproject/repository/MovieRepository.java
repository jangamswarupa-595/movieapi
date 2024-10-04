package com.example.movieapiproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movieapiproject.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
