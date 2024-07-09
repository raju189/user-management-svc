package com.espn.service;


import com.espn.dto.Country;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CountryService {
    Country addCountry(Country country);

    List<Country> getAllCountries();

    Country getCountryById(Long countryId);

    Country updateCountry(Country country);
}
