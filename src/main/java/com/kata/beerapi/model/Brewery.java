package com.kata.beerapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "breweries")
public class Brewery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "address1")
    private String direccion1;

    @Column(name = "address2")
    private String direccion2;

    @Column(name = "city")
    private String ciudad;

    @Column(name = "state")
    private String estado;

    @Column(name = "code")
    private String codigo;

    @Column(name = "country")
    private String pais;

    @Column(name = "phone")
    private String telefono;

    @Column(name = "website")
    private String sitioWeb;

    @Column(name = "filepath")
    private String rutaArchivo;

    @Column(name = "descript", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "add_user")
    private Integer usuarioAgregado;

    @Column(name = "last_mod")
    private LocalDateTime ultimaModificacion;

    public Brewery() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress1() {
        return direccion1;
    }

    public void setAddress1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getAddress2() {
        return direccion2;
    }

    public void setAddress2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCity() {
        return ciudad;
    }

    public void setCity(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getState() {
        return estado;
    }

    public void setState(String estado) {
        this.estado = estado;
    }

    public String getCode() {
        return codigo;
    }

    public void setCode(String codigo) {
        this.codigo = codigo;
    }

    public String getCountry() {
        return pais;
    }

    public void setCountry(String pais) {
        this.pais = pais;
    }

    public String getPhone() {
        return telefono;
    }

    public void setPhone(String telefono) {
        this.telefono = telefono;
    }

    public String getWebsite() {
        return sitioWeb;
    }

    public void setWebsite(String sitioWeb) {
        this.sitioWeb = sitioWeb;
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
