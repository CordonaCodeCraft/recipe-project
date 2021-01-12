package com.cordona.recipeproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;

@Getter
@Setter

@Entity(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories", fetch = EAGER)
    private Set<Recipe> recipes = new HashSet<>();
}
