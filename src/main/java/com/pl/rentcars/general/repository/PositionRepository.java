package com.pl.rentcars.general.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pl.rentcars.general.entity.PositionDictionary;

public interface PositionRepository extends JpaRepository<PositionDictionary, Long> {

}
