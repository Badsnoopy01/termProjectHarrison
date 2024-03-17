package org.introsoftengi.termprojectharrison.repository;

import org.introsoftengi.termprojectharrison.models.InstructionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface InstructionsRepository extends JpaRepository<InstructionsEntity, Integer> {
}
