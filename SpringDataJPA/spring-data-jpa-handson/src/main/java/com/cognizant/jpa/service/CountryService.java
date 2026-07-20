package com.cognizant.jpa.service;

import com.cognizant.jpa.model.Country;
import com.cognizant.jpa.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String newName) {

        Country country = countryRepository.findByCode(code);

        if (country != null) {
            country.setName(newName);
            countryRepository.save(country);
        }
    }
}