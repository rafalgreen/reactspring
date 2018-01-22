package com.pl.rentcars.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.Agency;
import com.pl.rentcars.general.repository.AgencyRepository;

@Service
@Transactional(readOnly = true)
public class AgencyService {

	@Autowired
	private AgencyRepository agencyRepository;

	public void addAgency(Agency agency) {
		agencyRepository.save(agency);
	}

	public void removeAgency(Long id) {
		agencyRepository.delete(id);
	}
	
	public List<Agency> findAll(){
		return agencyRepository.findAll();
	}

}
