package com.pl.rentcars.general.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.PositionDictionary;
import com.pl.rentcars.general.repository.PositionRepository;

@Service
@Transactional
public class PositionService {
	
	@Autowired
	private PositionRepository positionRepository;

	public void addPositionRepository(PositionDictionary positionDictionary) {
		positionRepository.save(positionDictionary);
	}

	public void removePositionDictionary(Long id) {
		positionRepository.delete(id);
	}
	
	


}
