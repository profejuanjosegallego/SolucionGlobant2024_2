package com.example.LogisticAPP.helpers.mensajes;

public enum MensajesError {

    VOLUMEN_INVALIDO("El volumen ingresado es invalido"),
    PESO_INVALIDO("El peso ingresado es invalido"),
    DESCRIPCION_INVALIDA("Revisa la descripción ingresada")

    ;

    private String mensaje;

    MensajesError() {
    }

    MensajesError(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
