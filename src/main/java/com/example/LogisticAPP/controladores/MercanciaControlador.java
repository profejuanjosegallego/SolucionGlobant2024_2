package com.example.LogisticAPP.controladores;

import com.example.LogisticAPP.modelos.Mercancia;
import com.example.LogisticAPP.servicios.MercanciaServicio;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/logisticAPP/v1/mercancias") //endpoint orientado al recurso
public class MercanciaControlador {

    //Inyectar una dependencias al servicio
    @Autowired
    MercanciaServicio mercanciaServicio;

    //se crea un metodo para llamar a cada uno de los servicios
    //disponibles

    @PostMapping
    public ResponseEntity<?> llamandoAlServicioParaGuardar(@RequestBody Mercancia datosMercancia){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.mercanciaServicio.registrar(datosMercancia));

        }catch(Exception error){
            HashMap<String, Object> respuestaError= new HashMap<>();
            respuestaError.put("mensaje", error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(respuestaError);
        }
    }

}
