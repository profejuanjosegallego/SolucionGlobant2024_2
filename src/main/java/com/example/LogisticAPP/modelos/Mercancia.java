package com.example.LogisticAPP.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "mercancias")
public class Mercancia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //iup (int)
    private Integer iup;
    //volumenOcupa

    @Column(name = "volumen_ocupado", nullable = false, unique = false)
    private Double volumenOcupa;
    //pesoOcupa

    @Column(name="peso_ocupado", nullable = false)
    private Double pesoOcupa;
    //nombre

    @Column(name="nombre", nullable = false)
    private String nombre;
    //descripcion

    @Column(name = "descripcion")
    private String descripcion;
    //fechaEntrada

    @Column(name="fecha_entrada", nullable = false)
    private LocalDate fechaEntrada;
    //fechaSalida

    @Column(name="fecha_salida", nullable = false)
    private LocalDate fechaSalida;

    //las relaciones no son ams que nuevos atributos
    //siempre el atributo sera la tabla con la que me voy a relacionar

    @ManyToOne
    @JoinColumn(name="fk_zonaBodega", referencedColumnName = "idZona")
    @JsonBackReference
    private ZonaBodega zonaBodega;

    public Mercancia() {
    }

    public Mercancia(Integer iup, Double volumenOcupa, Double pesoOcupa, String nombre, String descripcion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.iup = iup;
        this.volumenOcupa = volumenOcupa;
        this.pesoOcupa = pesoOcupa;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Integer getIup() {
        return iup;
    }

    public void setIup(Integer iup) {
        this.iup = iup;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    //remitente
    //destinatario
    //zonaUbicacionBodega


}
