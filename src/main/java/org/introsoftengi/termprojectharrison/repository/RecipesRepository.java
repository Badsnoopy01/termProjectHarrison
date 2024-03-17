package org.introsoftengi.termprojectharrison.repository;

import org.introsoftengi.termprojectharrison.models.RecipesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends JpaRepository<RecipesEntity, Integer> {
}
