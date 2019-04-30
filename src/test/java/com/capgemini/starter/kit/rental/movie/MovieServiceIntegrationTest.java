package com.capgemini.starter.kit.rental.movie;

import com.capgemini.starter.kit.rental.RentalApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RentalApplication.class)
public class MovieServiceIntegrationTest {

    @Autowired
    private MovieService movieService;

    @Test
    public void shouldSaveMovie() {
        //given
        final MovieDto movieToSave = new MovieDto("Szeregowiec Ryan", LocalDate.of(1998, 9,11), 160);
        final MovieDto expectedMovie = new MovieDto(1L, "Szeregowiec Ryan", LocalDate.of(1998, 9,11), 160);

        //when
        MovieDto result = movieService.save(movieToSave);

        //then
        assertEquals(expectedMovie, result);
    }

}
