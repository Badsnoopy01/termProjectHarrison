package org.introsoftengi.termprojectharrison.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "recipes")
public class RecipesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "RECIPE_NAME")
    private String recipeName;

    @Column(name = "PREP_TIME_MINUTES")
    private Integer prepTimeMinutes;

    @Column(name = "COOK_TIME_MINUTES")
    private Integer cookTimeMinutes;

    @Column(name = "AUTHOR")
    private String author;

    @OneToMany(mappedBy = "recipesEntity", cascade = CascadeType.ALL)
    private Set<IngredientsEntity> ingredientsEntities = new HashSet<>();

    @OneToMany(mappedBy = "recipesEntity", cascade = CascadeType.ALL)
    private Set<InstructionsEntity> instructionsEntities = new HashSet<>();
}
