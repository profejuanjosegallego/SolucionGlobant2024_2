package com.example.LogisticAPP.helpers.validaciones;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class MercanciaValidacion {

    //validar que volumen solo sea positivo
    public boolean validarVolumen(Double volumen){
       return volumen>0?true:false;
    }
    //validar que peso solo sea positivo
    public boolean validarPeso(Double peso){
        return peso>0?true:false;
    }

    //la descripcion solo puede tener hasta 200 caracteres
    public boolean validarDescripcion(String descripcion){
        return descripcion.length()<200?true:false;
    }


    //las fechas deben tener el formato (mm-dd-yyyy)
    public boolean validarFormatoFecha(LocalDate fecha){

        //como convierto un LocalDate en string?

        //convirtiendo una fecha a un formato deseado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaLocalDate = LocalDate.parse(fecha.toString(), formato);
        return fechaLocalDate.format(formato).equals(fecha.toString());

    }


}
