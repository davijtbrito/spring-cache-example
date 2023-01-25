package com.cache.springcacheexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cache.springcacheexample.interfaces.ICountryService;
import com.cache.springcacheexample.interfaces.IProductDb;
import com.cache.springcacheexample.models.Country;

@RestController
public class SpringCacheController {
    
    @Autowired
    private IProductDb productDb;

    @Autowired
    private ICountryService countryService;

    @GetMapping("/getListItem")
    public ResponseEntity<String> getListItem(@RequestParam int index){

        return ResponseEntity.ok(productDb.getName(index));
    }

    @GetMapping("/getAllCountries")
    public ResponseEntity<List<Country>> getAllCountries(){

        return ResponseEntity.ok(countryService.getAllCountries());
    }
}
