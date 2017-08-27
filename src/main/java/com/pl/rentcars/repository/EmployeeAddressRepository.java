package com.pl.rentcars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.EmployeeAddress;

@Repository
@Transactional
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Long>{

}
