package com.example.LogisticAPP.modelos.DTO;

import java.time.LocalDate;

public class MercanciaDTO {

    private Double volumenOcupa;
    private Double pesoOcupa;
    private String nombre;
    private LocalDate fechaEntrada;

    public MercanciaDTO() {
    }

    public MercanciaDTO(Double volumenOcupa, Double pesoOcupa, String nombre, LocalDate fechaEntrada) {
        this.volumenOcupa = volumenOcupa;
        this.pesoOcupa = pesoOcupa;
        this.nombre = nombre;
        this.fechaEntrada = fechaEntrada;
    }

    public Double getVolumenOcupa() {
        return volumenOcupa;
    }

    public void setVolumenOcupa(Double volumenOcupa) {
        this.volumenOcupa = volumenOcupa;
    }

    public Double getPesoOcupa() {
        return pesoOcupa;
    }

    public void setPesoOcupa(Double pesoOcupa) {
        this.pesoOcupa = pesoOcupa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
}
