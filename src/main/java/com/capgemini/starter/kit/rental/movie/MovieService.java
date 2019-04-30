package com.capgemini.starter.kit.rental.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    MovieDto save(MovieDto movieDto) {
        MovieMapper mapper = new MovieMapper();
        Movie movie = mapper.mapMovieDtoToMovie(movieDto);

        Movie savedMovie = movieRepository.save(movie);

        return mapper.mapMovieToMovieDto(savedMovie);
    }

}
