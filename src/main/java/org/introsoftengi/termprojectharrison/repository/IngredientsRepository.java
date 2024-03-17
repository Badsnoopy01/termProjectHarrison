package org.introsoftengi.termprojectharrison.repository;

import org.introsoftengi.termprojectharrison.models.IngredientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientsRepository extends JpaRepository<IngredientsEntity, Integer> {
}
