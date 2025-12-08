package com.kata.beerapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cat_name")
    private String nombreCategoria;

    @Column(name = "last_mod")
    private LocalDateTime ultimaModificacion;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatName() {
        return nombreCategoria;
    }

    public void setCatName(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public LocalDateTime getLastMod() {
        return ultimaModificacion;
    }

    public void setLastMod(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
}
