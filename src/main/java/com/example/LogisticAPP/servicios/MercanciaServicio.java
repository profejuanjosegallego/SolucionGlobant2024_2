package com.example.LogisticAPP.servicios;


import com.example.LogisticAPP.helpers.mensajes.MensajesError;
import com.example.LogisticAPP.helpers.validaciones.MercanciaValidacion;
import com.example.LogisticAPP.modelos.DTO.MercanciaDTO;
import com.example.LogisticAPP.modelos.Mercancia;
import com.example.LogisticAPP.modelos.mapas.IMapaMercancia;
import com.example.LogisticAPP.repositorios.IMercanciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MercanciaServicio {

    //INYECTAR LA DEPENDENCIA AL REPOSITORIO
    @Autowired
    IMercanciaRepositorio consultaEnBD;

    @Autowired
    MercanciaValidacion validacion;

    @Autowired
    IMapaMercancia iMapaMercancia;


    //Registrar en BD una mercancia
    public MercanciaDTO registrar(Mercancia datosMercancia)throws Exception{
        try{
            if(!this.validacion.validarDescripcion(datosMercancia.getDescripcion())){
                throw new Exception(MensajesError.DESCRIPCION_INVALIDA.getMensaje());
            }
            if(!this.validacion.validarVolumen(datosMercancia.getVolumenOcupa())){
                throw new Exception(MensajesError.VOLUMEN_INVALIDO.getMensaje());
            }
            if(!this.validacion.validarPeso(datosMercancia.getPesoOcupa())){
                throw new Exception(MensajesError.PESO_INVALIDO.getMensaje());
            }
            return this.iMapaMercancia.transformarMercanciaEnDTO(this.consultaEnBD.save(datosMercancia));
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consultar la informacion de todas las mercancias

    //consultar la informacion de una mercancia por id

    //consultar la información de una mercancia por nombre

    //modificar la informacion de una mercancia entregandole un id y la nueva info

    //eliminar una mercancia de la BD

}
