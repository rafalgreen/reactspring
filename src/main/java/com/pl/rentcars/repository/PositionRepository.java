package com.pl.rentcars.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pl.rentcars.entity.PositionDictionary;

public interface PositionRepository extends JpaRepository<PositionDictionary, Long> {

}
