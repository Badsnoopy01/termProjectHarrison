package org.introsoftengi.termprojectharrison.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.service.IngredientsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
@Slf4j
@RequiredArgsConstructor
public class IngredientsController {
    private final IngredientsService ingredientsService;

    @GetMapping()
    public ResponseEntity fetchAllIngredients() {
        log.info("Called fetchAllIngredients...");
        return new ResponseEntity(ingredientsService.fetchAllIngredients(), HttpStatus.OK);
    }
}
