package com.cache.springcacheexample.services;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.springcacheexample.interfaces.IProductDb;

@Service
public class ProductDbService implements IProductDb{
    
    private ArrayList<String> productList;    

    public ProductDbService(ArrayList<String> productList) {
        this.productList = productList;
    }

    @Cacheable("productList")
    @Override
    public String getName(int index) {
        
        System.out.println("Executing ProductDbService.getName(String)...");
        if (productList.size() < index){
            productList.add("product " + index);
        }

        return this.productList.get(index - 1);
    }
    
}
