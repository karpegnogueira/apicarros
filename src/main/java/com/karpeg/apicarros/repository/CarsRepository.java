package com.karpeg.apicarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karpeg.apicarros.entity.CarsEntity;

@Repository
public interface CarsRepository extends JpaRepository<CarsEntity, Long> {

}
