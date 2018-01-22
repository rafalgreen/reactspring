package com.pl.rentcars.general.service;

import com.pl.rentcars.general.dto.RentDTO;
import com.pl.rentcars.general.entity.Rent;
import com.pl.rentcars.general.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentService {

    @Autowired
    private RentRepository rentRepository;

    public void addRent(Rent rent) {
        rentRepository.save(rent);
    }

    public void delete(Long id) {
        rentRepository.delete(id);
    }

    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    public Rent findOne(Long id) {
        return rentRepository.findOne(id);
    }

    @Transactional
    public void save(Rent rent){
        rentRepository.save(rent);
    }
}
