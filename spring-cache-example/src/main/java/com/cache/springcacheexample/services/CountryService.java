package com.cache.springcacheexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.springcacheexample.interfaces.ICountryRepository;
import com.cache.springcacheexample.interfaces.ICountryService;
import com.cache.springcacheexample.models.Country;

@Service
public class CountryService implements ICountryService{

    @Autowired
    private ICountryRepository countryRepository;    

    public CountryService(ICountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Cacheable("listCountries")
    @Override
    public List<Country> getAllCountries() {

        System.out.println("Executing CountryService.getAllCountries()");
        return this.countryRepository.getAllCountries();
    }    
}
