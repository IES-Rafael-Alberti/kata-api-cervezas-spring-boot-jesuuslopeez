package com.kata.beerapi.controller;

import com.kata.beerapi.model.Beer;
import com.kata.beerapi.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class BeerController {

    @Autowired
    private BeerRepository repositorioCervezas;

    @GetMapping("/beers")
    public List<Beer> getAllBeers() {
        return repositorioCervezas.findAll();
    }

    @GetMapping("/beer/{id}")
    public ResponseEntity<Beer> getBeerById(@PathVariable Integer id) {
        Optional<Beer> cerveza = repositorioCervezas.findById(id);
        if (cerveza.isPresent()) {
            return ResponseEntity.ok(cerveza.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/beer")
    public ResponseEntity<Beer> createBeer(@RequestBody Beer cerveza) {
        if (cerveza.getLastMod() == null) {
            cerveza.setLastMod(LocalDateTime.now());
        }
        Beer cervezaGuardada = repositorioCervezas.save(cerveza);
        return ResponseEntity.status(HttpStatus.CREATED).body(cervezaGuardada);
    }

    @PutMapping("/beer/{id}")
    public ResponseEntity<Beer> updateBeer(@PathVariable Integer id, @RequestBody Beer detallesCerveza) {
        Optional<Beer> cervezaOpcional = repositorioCervezas.findById(id);
        if (cervezaOpcional.isPresent()) {
            Beer cerveza = cervezaOpcional.get();
            cerveza.setName(detallesCerveza.getName());
            cerveza.setBreweryId(detallesCerveza.getBreweryId());
            cerveza.setCatId(detallesCerveza.getCatId());
            cerveza.setStyleId(detallesCerveza.getStyleId());
            cerveza.setAbv(detallesCerveza.getAbv());
            cerveza.setIbu(detallesCerveza.getIbu());
            cerveza.setSrm(detallesCerveza.getSrm());
            cerveza.setUpc(detallesCerveza.getUpc());
            cerveza.setFilepath(detallesCerveza.getFilepath());
            cerveza.setDescript(detallesCerveza.getDescript());
            cerveza.setAddUser(detallesCerveza.getAddUser());
            cerveza.setLastMod(detallesCerveza.getLastMod());
            Beer cervezaActualizada = repositorioCervezas.save(cerveza);
            return ResponseEntity.ok(cervezaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/beer/{id}")
    public ResponseEntity<Beer> partialUpdateBeer(@PathVariable Integer id, @RequestBody Beer detallesCerveza) {
        Optional<Beer> cervezaOpcional = repositorioCervezas.findById(id);
        if (cervezaOpcional.isPresent()) {
            Beer cerveza = cervezaOpcional.get();
            if (detallesCerveza.getName() != null) {
                cerveza.setName(detallesCerveza.getName());
            }
            if (detallesCerveza.getBreweryId() != null) {
                cerveza.setBreweryId(detallesCerveza.getBreweryId());
            }
            if (detallesCerveza.getCatId() != null) {
                cerveza.setCatId(detallesCerveza.getCatId());
            }
            if (detallesCerveza.getStyleId() != null) {
                cerveza.setStyleId(detallesCerveza.getStyleId());
            }
            if (detallesCerveza.getAbv() != null) {
                cerveza.setAbv(detallesCerveza.getAbv());
            }
            if (detallesCerveza.getIbu() != null) {
                cerveza.setIbu(detallesCerveza.getIbu());
            }
            if (detallesCerveza.getSrm() != null) {
                cerveza.setSrm(detallesCerveza.getSrm());
            }
            if (detallesCerveza.getUpc() != null) {
                cerveza.setUpc(detallesCerveza.getUpc());
            }
            if (detallesCerveza.getFilepath() != null) {
                cerveza.setFilepath(detallesCerveza.getFilepath());
            }
            if (detallesCerveza.getDescript() != null) {
                cerveza.setDescript(detallesCerveza.getDescript());
            }
            if (detallesCerveza.getAddUser() != null) {
                cerveza.setAddUser(detallesCerveza.getAddUser());
            }
            if (detallesCerveza.getLastMod() != null) {
                cerveza.setLastMod(detallesCerveza.getLastMod());
            }
            Beer cervezaActualizada = repositorioCervezas.save(cerveza);
            return ResponseEntity.ok(cervezaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/beer/{id}")
    public ResponseEntity<Void> deleteBeer(@PathVariable Integer id) {
        if (repositorioCervezas.existsById(id)) {
            repositorioCervezas.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
