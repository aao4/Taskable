/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

/**
 *
 * @author Medac
 */
public class Configuracion {
    
    private String parametros;
    private String id_configuracion;

    public Configuracion(String parametros, String id_configuracion) {
        this.parametros = parametros;
        this.id_configuracion = id_configuracion;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public String getId_configuracion() {
        return id_configuracion;
    }

    public void setId_configuracion(String id_configuracion) {
        this.id_configuracion = id_configuracion;
    }
    
    public void actualizarParametros(String nuevos) {
        this.parametros = nuevos;
        System.out.println("Parámetros actualizados.");
    }
}

