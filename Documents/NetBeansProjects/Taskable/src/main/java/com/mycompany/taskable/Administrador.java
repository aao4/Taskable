/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taskable;

import java.util.List;

/**
 *
 * @author Medac
 */
public class Administrador extends Usuario{
    
    private String id_administrador;
    private String nombre_admin;
    
    public Administrador(String id_administrador, String nombre_admin, String email, String contraseña) {
        super(id_administrador, nombre_admin, email, contraseña);
        this.id_administrador = id_administrador;
        this.nombre_admin = nombre_admin;
    }
    
    public void gestionarUsuarios(List<Usuario> usuarios) {
        System.out.println("Gestionando usuarios...");
    }

    public void bloquearUsuarios(Usuario u) {
        System.out.println("Usuario bloqueado: " + u.getNombre());
    }

    public void eliminarUsuarios(List<Usuario> usuarios) {
        usuarios.clear();
        System.out.println("Todos los usuarios eliminados.");
    }

    public void gestionarConfiguracion(Configuracion conf) {
        System.out.println("Configuración gestionada.");
    }

    public void actualizarParametros(Configuracion conf, String nuevos) {
        conf.actualizarParametros(nuevos);
    }
}

