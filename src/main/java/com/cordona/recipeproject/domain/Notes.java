package com.cordona.recipeproject.domain;

import lombok.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity(name = "Notes")
public class Notes {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

}
