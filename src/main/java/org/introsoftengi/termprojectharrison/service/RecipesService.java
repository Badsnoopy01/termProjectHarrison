package org.introsoftengi.termprojectharrison.service;

import org.introsoftengi.termprojectharrison.vo.ResponseVO;
import org.springframework.http.ResponseEntity;

public interface RecipesService {
    ResponseVO fetchAllRecipes();
}
