package com.kata.beerapi.controller;

import com.kata.beerapi.model.Brewery;
import com.kata.beerapi.repository.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BreweryController {

    @Autowired
    private BreweryRepository repositorioCerveceras;

    @GetMapping("/breweries")
    public List<Brewery> getAllBreweries() {
        return repositorioCerveceras.findAll();
    }

    @GetMapping("/brewerie/{id}")
    public ResponseEntity<Brewery> getBreweryById(@PathVariable Integer id) {
        Optional<Brewery> cervecera = repositorioCerveceras.findById(id);
        if (cervecera.isPresent()) {
            return ResponseEntity.ok(cervecera.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
