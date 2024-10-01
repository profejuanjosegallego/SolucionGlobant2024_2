package com.example.LogisticAPP.modelos.mapas;

import com.example.LogisticAPP.modelos.DTO.MercanciaDTO;
import com.example.LogisticAPP.modelos.Mercancia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaMercancia {

    @Mappings({
            @Mapping(source = "volumenOcupa", target = "volumenOcupa"),
            @Mapping(source = "pesoOcupa", target = "pesoOcupa"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "fechaEntrada", target = "fechaEntrada")
    })
    //Creo los metodos que necesiten ser mapeados
    MercanciaDTO transformarMercanciaEnDTO(Mercancia mercancia);
    List<MercanciaDTO> tarnsformarVariasMercanciasEnDTO(List<Mercancia> mercancias);
}
