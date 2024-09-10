package com.example.LogisticAPP.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZonaBodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //idZona
    private Integer idZona;
    //nombreZona
    private String nombreZona; //50 caracteres
    //volumenmaximo
    private Double volumenMaximo; //solo positivo
    //pesomaximo
    private Double pesoMaximo; //solo positivo
    //volumenOcupado
    private Double volumenOcupado; //solo positivo
    //pesoOcupado
    private Double pesoOcupado; //solo positivo

    public ZonaBodega() {
    }
    public ZonaBodega(Integer idZona, String nombreZona, Double volumenMaximo, Double pesoMaximo, Double volumenOcupado, Double pesoOcupado) {
        this.idZona = idZona;
        this.nombreZona = nombreZona;
        this.volumenMaximo = volumenMaximo;
        this.pesoMaximo = pesoMaximo;
        this.volumenOcupado = volumenOcupado;
        this.pesoOcupado = pesoOcupado;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Double getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(Double volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public Double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Double getVolumenOcupado() {
        return volumenOcupado;
    }

    public void setVolumenOcupado(Double volumenOcupado) {
        this.volumenOcupado = volumenOcupado;
    }

    public Double getPesoOcupado() {
        return pesoOcupado;
    }

    public void setPesoOcupado(Double pesoOcupado) {
        this.pesoOcupado = pesoOcupado;
    }
}
