package org.introsoftengi.termprojectharrison.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.service.RecipesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@Slf4j
@RequiredArgsConstructor
public class RecipesController {
    private final RecipesService recipesService;

    @GetMapping()
    public ResponseEntity fetchAllRecipes() {
        log.info("Called fetchAllRecipes...");
        return new ResponseEntity(recipesService.fetchAllRecipes(), HttpStatus.OK);
    }
}
