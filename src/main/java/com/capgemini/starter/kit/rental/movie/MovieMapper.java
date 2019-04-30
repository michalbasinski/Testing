package com.capgemini.starter.kit.rental.movie;

public class MovieMapper {
    public MovieDto mapMovieToMovieDto(Movie movie) {
        return new MovieDto(movie.id, movie.title, movie.productionDate, movie.projectionTime);
    }

    public Movie mapMovieDtoToMovie(MovieDto movieDto) {
        return new Movie(movieDto.id, movieDto.title, movieDto.productionDate, movieDto.projectionTime);
    }
}
