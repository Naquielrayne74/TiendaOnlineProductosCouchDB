package com.ugb.tiendaonlineproductos;

import java.util.Base64;

public class utilidades {
    //ipconfig para revisar la direccion de la maquina, puede cambiar
    static String urlConsulta = "http://192.168.88.177:5984/productos/_design/productos/_view/productos";
    static String urlMto = "http://192.168.88.177:5984/productos";
    static String user = "admin";
    static String passwd = "Naquiel7472";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user +":"+ passwd).getBytes());
    public String generarIdUnico(){
        return java.util.UUID.randomUUID().toString();
    }
}