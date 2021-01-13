package com.cordona.recipeproject.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories", fetch = EAGER)
    private Set<Recipe> recipes = new HashSet<>();
}
