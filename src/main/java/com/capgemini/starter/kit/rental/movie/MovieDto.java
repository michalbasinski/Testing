package com.capgemini.starter.kit.rental.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
//@AllArgsConstructor
public class MovieDto {
    Long id;
    String title;
    LocalDate productionDate;
    Integer projectionTime;

    public MovieDto(String title, LocalDate productionDate, Integer projectionTime) {
        this.title = title;
        this.productionDate = productionDate;
        this.projectionTime = projectionTime;
    }

    public MovieDto(Long id, String title, LocalDate productionDate, Integer projectionTime) {
        this.id = id;
        this.title = title;
        this.productionDate = productionDate;
        this.projectionTime = projectionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDto movieDto = (MovieDto) o;
        return Objects.equals(id, movieDto.id) &&
                Objects.equals(title, movieDto.title) &&
                Objects.equals(productionDate, movieDto.productionDate) &&
                Objects.equals(projectionTime, movieDto.projectionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, productionDate, projectionTime);
    }
}
