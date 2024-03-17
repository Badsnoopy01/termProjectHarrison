package org.introsoftengi.termprojectharrison.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "instructions")
public class InstructionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "STEP_NUMBER")
    private Integer stepNumber;

    @Column(name = "STEP_INSTRUCTION")
    private String stepInstruction;

    @ManyToOne
    @JoinColumn(name = "RECIPE_ID", referencedColumnName = "id")
    private RecipesEntity recipesEntity;
}
