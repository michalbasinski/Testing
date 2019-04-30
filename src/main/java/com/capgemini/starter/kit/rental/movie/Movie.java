package com.capgemini.starter.kit.rental.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
//@AllArgsConstructor
public class Movie {
    Long id;
    String title;
    LocalDate productionDate;
    int projectionTime;

    public Movie(Long id, String title, LocalDate productionDate, int projectionTime) {
        this.id = id;
        this.title = title;
        this.productionDate = productionDate;
        this.projectionTime = projectionTime;
    }
}
