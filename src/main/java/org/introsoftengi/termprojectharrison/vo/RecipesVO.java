package org.introsoftengi.termprojectharrison.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecipesVO {
    private String recipeName;
    private Integer prepTimeMinutes;
    private Integer cookTimeMinutes;
    private String author;
    private List<IngredientsVO> ingredientsVOList;
    private List<InstructionsVO> instructionsVOList;
}
