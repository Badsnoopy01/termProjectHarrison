package org.introsoftengi.termprojectharrison.serviceimpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.enums.ResponseStatus;
import org.introsoftengi.termprojectharrison.models.IngredientsEntity;
import org.introsoftengi.termprojectharrison.models.InstructionsEntity;
import org.introsoftengi.termprojectharrison.models.RecipesEntity;
import org.introsoftengi.termprojectharrison.repository.RecipesRepository;
import org.introsoftengi.termprojectharrison.service.RecipesService;
import org.introsoftengi.termprojectharrison.vo.IngredientsVO;
import org.introsoftengi.termprojectharrison.vo.InstructionsVO;
import org.introsoftengi.termprojectharrison.vo.RecipesVO;
import org.introsoftengi.termprojectharrison.vo.ResponseVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipesServiceImpl implements RecipesService {

    private final RecipesRepository recipesRepository;

    @Override
    public ResponseVO fetchAllRecipes() {
        ResponseVO<List<RecipesVO>> responseVO = new ResponseVO<>();
        responseVO.setResponseStatus(ResponseStatus.SUCCESS);
        responseVO.setData(populateRecipesVO(recipesRepository.findAll()));
        return responseVO;
    }

    private List<RecipesVO> populateRecipesVO(List<RecipesEntity> recipesEntity) {
        return recipesEntity.stream().map(recipeEntity -> {
            RecipesVO recipesVO = new RecipesVO();
            recipesVO.setRecipeName(recipeEntity.getRecipeName());
            recipesVO.setPrepTimeMinutes(recipeEntity.getPrepTimeMinutes());
            recipesVO.setCookTimeMinutes(recipeEntity.getCookTimeMinutes());
            recipesVO.setAuthor(recipeEntity.getAuthor());
            recipesVO.setIngredientsVOList(prepareIngredientsVO(recipeEntity.getIngredientsEntities()));
            recipesVO.setInstructionsVOList(prepareInstructionVO(recipeEntity.getInstructionsEntities()));
            return recipesVO;
        }).collect(Collectors.toList());
    }

    private List<IngredientsVO> prepareIngredientsVO(Set<IngredientsEntity> ingredientsEntities) {
        return ingredientsEntities.stream().map(ingredientsEntity -> {
            IngredientsVO ingredientsVO = new IngredientsVO();
            ingredientsVO.setMeasurement(ingredientsEntity.getMeasurement());
            ingredientsVO.setIngrediendName(ingredientsEntity.getIngredientName());
            return ingredientsVO;
        }).collect(Collectors.toList());
    }

    private List<InstructionsVO> prepareInstructionVO(Set<InstructionsEntity> instructionsEntities) {
        return instructionsEntities.stream().map(instructionsEntity -> {
            InstructionsVO instructionsVO = new InstructionsVO();
            instructionsVO.setStepInstructions(instructionsEntity.getStepInstruction());
            instructionsVO.setStepNumber(instructionsEntity.getStepNumber());
            return instructionsVO;
        }).collect(Collectors.toList());
    }
}
