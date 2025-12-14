package com.kata.beerapi.controller;

import com.kata.beerapi.model.Category;
import com.kata.beerapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository repositorioCategorias;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return repositorioCategorias.findAll();
    }

    @GetMapping("/categorie/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Integer id) {
        Optional<Category> categoria = repositorioCategorias.findById(id);
        if (categoria.isPresent()) {
            return ResponseEntity.ok(categoria.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
