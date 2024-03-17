package org.introsoftengi.termprojectharrison.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ingedients")
public class IngredientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "MEASUREMENT")
    private String measurement;

    @Column(name = "INGREDIENT_NAME")
    private String ingredientName;

    @ManyToOne
    @JoinColumn(name = "RECIPE_ID", referencedColumnName = "id")
    private RecipesEntity recipesEntity;
}
