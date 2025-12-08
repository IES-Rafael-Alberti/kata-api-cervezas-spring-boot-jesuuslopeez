package com.kata.beerapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "beers")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "brewery_id")
    private Integer idCervecera;

    @Column(name = "name", nullable = false)
    private String nombre;

    @Column(name = "cat_id")
    private Integer idCategoria;

    @Column(name = "style_id")
    private Integer idEstilo;

    @Column(name = "abv")
    private Float abv;

    @Column(name = "ibu")
    private Float ibu;

    @Column(name = "srm")
    private Float srm;

    @Column(name = "upc")
    private Integer upc;

    @Column(name = "filepath")
    private String rutaArchivo;

    @Column(name = "descript", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "add_user")
    private Integer usuarioAgregado;

    @Column(name = "last_mod")
    private LocalDateTime ultimaModificacion;

    public Beer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBreweryId() {
        return idCervecera;
    }

    public void setBreweryId(Integer idCervecera) {
        this.idCervecera = idCervecera;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCatId() {
        return idCategoria;
    }

    public void setCatId(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getStyleId() {
        return idEstilo;
    }

    public void setStyleId(Integer idEstilo) {
        this.idEstilo = idEstilo;
    }

    public Float getAbv() {
        return abv;
    }

    public void setAbv(Float abv) {
        this.abv = abv;
    }

    public Float getIbu() {
        return ibu;
    }

    public void setIbu(Float ibu) {
        this.ibu = ibu;
    }

    public Float getSrm() {
        return srm;
    }

    public void setSrm(Float srm) {
        this.srm = srm;
    }

    public Integer getUpc() {
        return upc;
    }

    public void setUpc(Integer upc) {
        this.upc = upc;
    }

    public String getFilepath() {
        return rutaArchivo;
    }

    public void setFilepath(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getDescript() {
        return descripcion;
    }

    public void setDescript(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAddUser() {
        return usuarioAgregado;
    }

    public void setAddUser(Integer usuarioAgregado) {
        this.usuarioAgregado = usuarioAgregado;
    }

    public LocalDateTime getLastMod() {
        return ultimaModificacion;
    }

    public void setLastMod(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
}
