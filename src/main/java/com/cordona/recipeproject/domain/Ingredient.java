package com.cordona.recipeproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.*;

@Getter
@Setter

@Entity(name = "Ingredient")
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;


}
