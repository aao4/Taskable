/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

/**
 *
 * @author Medac
 */
public class Notificador {
    private String id_notificador;
    private String tipoNotificacion;

    public String getId_notificador() {
        return id_notificador;
    }

    public void setId_notificador(String id_notificador) {
        this.id_notificador = id_notificador;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
    
    public void enviarNotificacion() {
        System.out.println("Enviando notificación tipo: " + tipoNotificacion);
    }
}