package com.capgemini.starter.kit.rental.movie;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceTest {

    private MovieService movieService;

    @Mock
    private MovieRepository movieRepository;

    @Before
    public void setUp() {
        movieService = new MovieService(movieRepository);
        when(movieRepository.save(any(Movie.class)))
                .thenReturn(new Movie(1L, "Szeregowiec Ryan", LocalDate.of(1998, 9,11), 160));
    }

    @Test
    public void shouldSaveNewMovie() {
        //given
        final MovieDto movieToSave = new MovieDto("Szeregowiec Ryan", LocalDate.of(1998, 9,11), 160);
        final MovieDto expectedMovie = new MovieDto(1L, "Szeregowiec Ryan", LocalDate.of(1998, 9,11), 160);

        //when
        MovieDto result = movieService.save(movieToSave);

        //then
        assertEquals(expectedMovie, result);
    }
}