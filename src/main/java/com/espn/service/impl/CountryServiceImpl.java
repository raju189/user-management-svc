package com.espn.service.impl;

import com.espn.dto.Country;
import com.espn.service.CountryService;
import com.espn.service.repo.CountryRepository;
import com.espn.transformations.CountryTransformation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;
    private CountryTransformation countryTransformation;

    @Override
    public Country addCountry(Country country) {
        var entity = countryTransformation.toEntity(country);
        var saveEntity = countryRepository.save(entity);
        return countryTransformation.fromEntity(saveEntity);
    }

    @Override
    public List<Country> getAllCountries() {
        var countries = countryRepository.findAll();
        var result = new ArrayList<Country>();
        countries.forEach(country -> {
            result.add(countryTransformation.fromEntity(country));
        });
        return result;
    }

    @Override
    public Country getCountryById(Long countryId) {
        var optGet = countryRepository.findById(countryId).orElseThrow();
       return countryTransformation.fromEntity(optGet);
    }

    @Override
    public Country updateCountry(Country country) {
        var optGet = countryRepository.findById(country.getId()).orElseThrow();
        return addCountry(country);
    }


}
