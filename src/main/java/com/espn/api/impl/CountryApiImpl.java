package com.espn.api.impl;

import com.espn.api.CountryApi;
import com.espn.dto.Country;
import com.espn.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
public class CountryApiImpl implements CountryApi {

    private CountryService countryService;


    @Override
    public Country addCountry(Country country) {
        return countryService.addCountry(country);
    }

    @Override
    public ResponseEntity<Country> updateCountry(Country country) {
        return ResponseEntity.ok(countryService.updateCountry(country));
    }

    @Override
    public ResponseEntity<Country> getCountryById(Long countryId) {
        return ResponseEntity.ok(countryService.getCountryById(countryId));
    }

    @Override
    public ResponseEntity<Void> deleteCountry(Long countryId, String apiKey) {
        return CountryApi.super.deleteCountry(countryId, apiKey);
    }

    @GetMapping("/country/list")
    public ResponseEntity<List<Country>> listOfCountries(){
        return ResponseEntity.ok(countryService.getAllCountries());
    }
}
