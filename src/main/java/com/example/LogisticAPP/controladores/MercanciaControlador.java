package com.example.LogisticAPP.controladores;

import com.example.LogisticAPP.modelos.DTO.MercanciaDTO;
import com.example.LogisticAPP.modelos.Mercancia;
import com.example.LogisticAPP.servicios.MercanciaServicio;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name="Servicios mercancias en bodega", description = "\nServicios asociados a la tabla mercancias de la bd, se hace CRUD completo")
public class MercanciaControlador {

    //Inyectar una dependencias al servicio
    @Autowired
    MercanciaServicio mercanciaServicio;

    //se crea un metodo para llamar a cada uno de los servicios
    //disponibles

    @PostMapping
    @Operation(
            summary = "Registra una mercancia en la base de datos",
            description = "se envia un objeto que responde al modelo mercancia y se retorna un DTO con los datos de la mercancia almacenada"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "201",
                            description = "mercancia guardada con exito en BD",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = MercanciaDTO.class),
                                    examples = @ExampleObject(value = "{\"volumenOcupa\":\"30.4\",\"pesoOcupa\":\"400\",\"nombre\":\"Televisor SONY\",\"fechaEntrada\":\"2024-10-8\"}")
                            )
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Error al registrar la mercancia",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = String.class)
                            )
                    )
            }
    )
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
