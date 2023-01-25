package com.cache.springcacheexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cache.springcacheexample.interfaces.IProductDb;

@RestController
public class SpringCacheController {
    
    @Autowired
    private IProductDb productDb;

    @GetMapping("/getListItem")
    public ResponseEntity<String> getListItem(@RequestParam int index){

        return ResponseEntity.ok(productDb.getName(index));
    }
}
