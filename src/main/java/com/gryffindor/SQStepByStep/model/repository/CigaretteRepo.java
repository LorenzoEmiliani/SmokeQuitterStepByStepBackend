package com.gryffindor.SQStepByStep.model.repository;

import com.gryffindor.SQStepByStep.model.Cigarette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CigaretteRepo extends JpaRepository<Cigarette, Integer> { }