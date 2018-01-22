package com.pl.rentcars.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.Rent;

@Repository
@Transactional
public interface RentRepository extends JpaRepository<Rent, Long> {

}
