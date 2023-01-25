package com.cache.springcacheexample.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cache.springcacheexample.models.Country;

public interface ICountryRepository extends JpaRepository<Country, Long>{
    
    @Query("SELECT c FROM Country c")
    public List<Country> getAllCountries();
}
