package com.example.LogisticAPP.modelos;


import jakarta.persistence.*;

@Entity
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nombre")
    private String nombre;
    private String departamento;
    private String municipio;
    private String direccion;
    private String capacidadVolumenInstalada;

    public Bodega() {
    }

    public Bodega(Integer id, String nombre, String departamento, String municipio, String direccion, String capacidadVolumenInstalada) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.capacidadVolumenInstalada = capacidadVolumenInstalada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCapacidadVolumenInstalada() {
        return capacidadVolumenInstalada;
    }

    public void setCapacidadVolumenInstalada(String capacidadVolumenInstalada) {
        this.capacidadVolumenInstalada = capacidadVolumenInstalada;
    }
}
