package com.cordona.recipeproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.*;

@Getter
@Setter

@Entity(name = "Recipe")
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;

    @Lob
    private Byte[] image;

    @OneToMany(mappedBy = "recipe", cascade = ALL)
    private Set<Ingredient> ingredients;

    @OneToOne(cascade = ALL)
    private Notes notes;



}
