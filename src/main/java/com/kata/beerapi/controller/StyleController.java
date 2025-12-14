package com.kata.beerapi.controller;

import com.kata.beerapi.model.Style;
import com.kata.beerapi.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StyleController {

    @Autowired
    private StyleRepository repositorioEstilos;

    @GetMapping("/styles")
    public List<Style> getAllStyles() {
        return repositorioEstilos.findAll();
    }

    @GetMapping("/style/{id}")
    public ResponseEntity<Style> getStyleById(@PathVariable Integer id) {
        Optional<Style> estilo = repositorioEstilos.findById(id);
        if (estilo.isPresent()) {
            return ResponseEntity.ok(estilo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
