package com.cordona.recipeproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter

@Entity(name = "UnitOfMeasure")
@Table(name = "units_of_measure")
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;

}
