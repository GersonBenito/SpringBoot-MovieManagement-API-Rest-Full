package com.movie.management.services;

import com.movie.management.entities.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    public List<Movie> findAll();
    public Optional<Movie> findById(Long id);
    public void save(Movie movie);
    public void deleteById(Long id);
}