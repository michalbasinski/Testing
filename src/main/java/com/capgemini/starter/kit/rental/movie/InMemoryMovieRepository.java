package com.capgemini.starter.kit.rental.movie;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryMovieRepository implements MovieRepository {

    Long id = 0L;
    List<Movie> movies = new ArrayList<>();

    @Override
    public Movie save(Movie movie) {
        movie.id = getNextId();
        movies.add(movie);
        return movie;
    }

    private Long getNextId() {
        return ++id;
    }
}
