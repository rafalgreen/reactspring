package com.pl.rentcars.general.converter;

import com.pl.rentcars.general.dto.RentDTO;
import com.pl.rentcars.general.entity.Rent;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

@Component
public class RentConverter {
    Mapper mapper = new DozerBeanMapper();

    public Rent convert(RentDTO rentDto) {
        Rent rent = mapper.map(rentDto, Rent.class);
        return rent;
    }

}
