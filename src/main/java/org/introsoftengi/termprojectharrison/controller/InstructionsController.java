package org.introsoftengi.termprojectharrison.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.introsoftengi.termprojectharrison.service.InstructionsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instructions")
@Slf4j
@RequiredArgsConstructor
public class InstructionsController {
    private final InstructionsService instructionsService;

    @GetMapping()
    public ResponseEntity fetchAllInstructions() {
        log.info("fetchAllInstructions called...");
        return new ResponseEntity(instructionsService.fetchAllInstructions(), HttpStatus.OK);
    }
}
