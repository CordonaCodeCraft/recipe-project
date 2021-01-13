package com.cordona.recipeproject.domain;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity(name = "UnitOfMeasure")
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;

}
