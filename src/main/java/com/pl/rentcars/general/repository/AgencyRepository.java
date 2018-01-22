package com.pl.rentcars.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.Agency;

@Repository
@Transactional
public interface AgencyRepository extends JpaRepository<Agency, Long> {

	//@Query("select employee from Employee employee where employee.id_agency = :id_agency")
	//public List<Employee> findEmployeeByIdAgency(@Param("id_agency") Long id);

}
