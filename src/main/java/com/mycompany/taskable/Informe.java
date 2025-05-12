/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

/**
 *
 * @author Medac
 */
public class Informe {
    private String id_informe;
    private String titulo;
    private String contenido;

    public String getId_informe() {
        return id_informe;
    }

    public void setId_informe(String id_informe) {
        this.id_informe = id_informe;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public void generarInforme() {
        System.out.println("Informe generado: " + titulo);
        System.out.println(contenido);
    }
}

