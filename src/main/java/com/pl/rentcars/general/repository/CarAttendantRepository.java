package com.pl.rentcars.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.CarAttendant;

@Repository
@Transactional
public interface CarAttendantRepository extends JpaRepository<CarAttendant, Long>  {

}
