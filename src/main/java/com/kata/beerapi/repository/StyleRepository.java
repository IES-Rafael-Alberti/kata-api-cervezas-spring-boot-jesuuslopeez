package com.kata.beerapi.repository;

import com.kata.beerapi.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style, Integer> {
}
