package com.pl.rentcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.Agency;

@Repository
@Transactional
public interface AgencyRepository extends JpaRepository<Agency, Long> {

}
