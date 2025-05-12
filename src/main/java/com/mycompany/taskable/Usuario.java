/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Medac
 */
public abstract class Usuario {
    protected String id_usuario;
    protected String nombre;
    protected String email;
    protected String contraseña;
    
    private ArrayList<Tarea> tareas = new ArrayList<>();
    
    public Usuario(String id_usuario, String nombre, String email, String contraseña) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    public void registrarse() {
        System.out.println("Usuario registrado: " + nombre);
    }

    public void iniciarSesion() {
        System.out.println("Inicio de sesión para: " + email);
    }

    public void darseDeBaja() {
        tareas.clear();
        System.out.println("Usuario " + nombre + " dado de baja.");
    }

    public void crearTarea(String id, String nombreTarea, String descripcion, String estado, Date fechaCreacion, Date fechaVencimiento, String tipoTarea) {
        Tarea nueva = new Tarea(id, nombreTarea, descripcion, estado, fechaCreacion, fechaVencimiento, tipoTarea);
        tareas.add(nueva);
        nueva.crear();
    }

    public void modificarTarea(int index, String nuevaDescripcion, String nuevoEstado, Date nuevaFechaVencimiento) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).modificar(nuevaDescripcion, nuevoEstado, nuevaFechaVencimiento);
        } else {
            System.out.println("Índice inválido para modificar tarea.");
        }
    }

    public void compartirTarea(int index, Usuario destinatario) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).compartir(destinatario);
        } else {
            System.out.println("Índice inválido para compartir tarea.");
        }
    }

    public void asignarTarea(int index, Usuario destinatario) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).asignar(destinatario);
            tareas.remove(index);
        } else {
            System.out.println("Índice inválido para asignar tarea.");
        }
    }

    public void eliminarTarea(int index) {
        if (index >= 0 && index < tareas.size()) {
            tareas.get(index).eliminar();
            tareas.remove(index);
        } else {
            System.out.println("Índice inválido para eliminar tarea.");
        }
    }

    public void generarInforme() {
        System.out.println("Informe de tareas del usuario: " + nombre);
        for (Tarea t : tareas) {
            t.generarInforme();
            System.out.println("-----------");
        }
    }

    public void consultarTareas() {
        System.out.println("Tareas actuales del usuario " + nombre + ":");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            System.out.println(i + ". " + t.getNombreTarea() + " (" + t.getEstado() + ")");
        }
    }

    public void establecerRecordatorio(int index, String mensaje) {
        if (index >= 0 && index < tareas.size()) {
            System.out.println("Recordatorio para '" + tareas.get(index).getNombreTarea() + "': " + mensaje);
        } else {
            System.out.println("Índice inválido para establecer recordatorio.");
        }
    }
}

