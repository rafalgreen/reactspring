package com.pl.rentcars.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.Agency;
import com.pl.rentcars.entity.Employee;

@Repository
@Transactional
public interface AgencyRepository extends JpaRepository<Agency, Long> {

	//@Query("select employee from Employee employee where employee.id_agency = :id_agency")
	//public List<Employee> findEmployeeByIdAgency(@Param("id_agency") Long id);

}
