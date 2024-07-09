package com.espn.transformations;

import com.espn.dto.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryTransformation {

    public com.espn.entity.Country toEntity(Country country) {
        var entity = new com.espn.entity.Country();
        entity.setCode(country.getCode());
        entity.setName(country.getName());
        entity.setId(country.getId());
        return entity;
    }

    public Country fromEntity(com.espn.entity.Country country){
        var dto = new Country();
        dto.setCode(country.getCode());
        dto.setId(country.getId());
        dto.setName(country.getName());
        return dto;
    }
}
