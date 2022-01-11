package com.karpeg.apicarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karpeg.apicarros.entity.FactoriesEntity;

@Repository
public interface FactoriesRepository extends JpaRepository<FactoriesEntity, Long>{

}
