/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

import java.util.Date;

/**
 *
 * @author Medac
 */
public class Tarea {
    private String id_tarea;
    private String descripcion;
    private String estado;
    private Date fechaCreacion;
    private Date fechaVencimiento;
    private String nombreTarea;
    private String tipoTarea;
    private boolean eliminada;

    public Tarea(String id, String nombreTarea, String descripcion, String estado, Date fechaCreacion, Date fechaVencimiento, String tipoTarea) {
        this.id_tarea = id;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoTarea = tipoTarea;
    }
    
    public String getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(String id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public boolean isEliminada() {
        return eliminada;
    }

    public void setEliminada(boolean eliminada) {
        this.eliminada = eliminada;
    }

    public void crear() {
        System.out.println("Tarea creada: " + nombreTarea);
    }

    public void modificar(String nuevaDescripcion, String nuevoEstado, Date nuevaFechaVencimiento) {
        this.descripcion = nuevaDescripcion;
        this.estado = nuevoEstado;
        this.fechaVencimiento = nuevaFechaVencimiento;
        System.out.println("Tarea modificada: " + nombreTarea);
    }

    public void compartir(Usuario destinatario) {
        destinatario.crearTarea(id_tarea, nombreTarea, descripcion, estado, fechaCreacion, fechaVencimiento, tipoTarea);
        System.out.println("Tarea '" + nombreTarea + "' compartida con " + destinatario.getNombre());
    }

    public void asignar(Usuario destinatario) {
        destinatario.crearTarea(id_tarea, nombreTarea, descripcion, estado, fechaCreacion, fechaVencimiento, tipoTarea);
        System.out.println("Tarea '" + nombreTarea + "' asignada a " + destinatario.getNombre());
    }

    public void eliminar() {
        System.out.println("Tarea '" + nombreTarea + "' eliminada.");
        eliminada = true;
    }

    public void generarInforme() {
        System.out.println("Informe de Tarea:");
        System.out.println("ID: " + id_tarea);
        System.out.println("Nombre: " + nombreTarea);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + estado);
        System.out.println("Tipo: " + tipoTarea);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
}


