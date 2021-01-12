package com.cordona.recipeproject.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Getter
@Setter

@Entity(name = "Notes")
@Table(name = "notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

}
