package com.kata.beerapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "styles")
public class Style {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cat_id")
    private Integer idCategoria;

    @Column(name = "style_name")
    private String nombreEstilo;

    @Column(name = "last_mod")
    private LocalDateTime ultimaModificacion;

    public Style() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatId() {
        return idCategoria;
    }

    public void setCatId(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getStyleName() {
        return nombreEstilo;
    }

    public void setStyleName(String nombreEstilo) {
        this.nombreEstilo = nombreEstilo;
    }

    public LocalDateTime getLastMod() {
        return ultimaModificacion;
    }

    public void setLastMod(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
}
