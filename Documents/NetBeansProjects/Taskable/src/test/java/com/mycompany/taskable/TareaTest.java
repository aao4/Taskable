/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taskable;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
/**
 *
 * @author Medac
 */
public class TareaTest {
    
    public TareaTest() {
    }
    
    //  Test 1
    @Test
    public void testCrear() {
        System.out.println("crear");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Nueva tarea de test", "Pendiente", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.crear();
            System.out.println("nombre esperado: " + instance.getNombreTarea());
            if (!instance.getNombreTarea().equals("Tarea Test")) {
                fail("Se esperaba '" + "Tarea Test" + "', pero se obtuvo '" + instance.getNombreTarea() + "'.");
            }
            
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    @Test
    public void testModificar() {
        System.out.println("modificar");
        String nuevaDescripcion = "Tarea modificada";
        String nuevoEstado = "Finalizada";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Date nuevaFechaVencimiento = sdf.parse("22-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Nueva tarea de test", "Pendiente", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.modificar(nuevaDescripcion, nuevoEstado, nuevaFechaVencimiento);
            Date actualDate = instance.getFechaVencimiento();
            if (!nuevaFechaVencimiento.equals(actualDate)) {
                fail("Se esperaba '" + nuevaFechaVencimiento + "', pero se obtuvo '" + actualDate + "'.");
            }
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }    
    }

    @Test
    public void testCompartir() {
        System.out.println("compartir");
        UsuarioCliente destinatario = new UsuarioCliente ("1", "Usuario Test", "test@example.com", "contrasena123");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Tarea modificada", "Finalizada", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.compartir(destinatario);    
        } catch (Exception e) {
            fail("No se ha podido compartir la tarea: " + e.getMessage());
        }     
    }

    @Test
    public void testAsignar() {
        System.out.println("asignar");
        UsuarioCliente destinatario = new UsuarioCliente ("1", "Usuario Test", "test@example.com", "contrasena123");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Tarea modificada", "Finalizada", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.asignar(destinatario);  
        } catch (Exception e) {
            fail("No se ha podido asignar la tarea: " + e.getMessage());
        } 
    }

    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Tarea modificada", "Finalizada", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.eliminar();
            if (!instance.isEliminada()) {
                fail("Se esperaba '" + true + "', pero se obtuvo '" + instance.isEliminada() + "'.");
            }
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        } 
        
    }

    @Test
    public void testGenerarInforme() {
        System.out.println("generarInforme");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("01-05-2025");
            Date fechaVencimiento = sdf.parse("20-05-2025");
            Tarea instance = new Tarea ("001", "Tarea Test", "Tarea modificada", "Finalizada", fechaCreacion, fechaVencimiento, "Administrativa");
            instance.generarInforme();
        } catch (Exception e) {
            fail("No se ha generado el informe correctamente.");
        } 
        
    }
    
    //  Test 2
    
    @Test
    public void testCrearOtraTarea() {
        System.out.println("crear otra tarea");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Tarea instance = new Tarea("002", "Otra Tarea Nueva", "Otra tarea para test", "Pendiente", fechaCreacion, fechaVencimiento, "Personal");
            instance.crear();
            System.out.println("nombre esperado: " + instance.getNombreTarea());
            if (!instance.getNombreTarea().equals("Otra Tarea Nueva")) {
                fail("Se esperaba 'Otra Tarea Nueva', pero se obtuvo '" + instance.getNombreTarea() + "'.");
            }

        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    @Test
    public void testModificarOtraTarea() {
        System.out.println("modificar otra tarea");
        String nuevaDescripcion = "Descripción actualizada";
        String nuevoEstado = "Finalizada";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Date nuevaFechaVencimiento = sdf.parse("28-05-2025");
            Tarea instance = new Tarea("002", "Tarea Nueva", "Otra tarea para test", "Pendiente", fechaCreacion, fechaVencimiento, "Personal");
            instance.modificar(nuevaDescripcion, nuevoEstado, nuevaFechaVencimiento);
            Date actualDate = instance.getFechaVencimiento();
            if (!nuevaFechaVencimiento.equals(actualDate)) {
                fail("Se esperaba '" + nuevaFechaVencimiento + "', pero se obtuvo '" + actualDate + "'.");
            }
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    @Test
    public void testCompartirOtraTarea() {
        System.out.println("compartir otra tarea");
        UsuarioCliente destinatario = new UsuarioCliente("2", "Nuevo Usuario", "nuevo@example.com", "clave456");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Tarea instance = new Tarea("002", "Tarea Nueva", "Descripción actualizada", "En progreso", fechaCreacion, fechaVencimiento, "Personal");
            instance.compartir(destinatario);
        } catch (Exception e) {
            fail("No se ha podido compartir la tarea: " + e.getMessage());
        }
    }

    @Test
    public void testAsignarOtraTarea() {
        System.out.println("asignar otra tarea");
        UsuarioCliente destinatario = new UsuarioCliente("2", "Nuevo Usuario", "nuevo@example.com", "clave456");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Tarea instance = new Tarea("002", "Tarea Nueva", "Descripción actualizada", "En progreso", fechaCreacion, fechaVencimiento, "Personal");
            instance.asignar(destinatario);
        } catch (Exception e) {
            fail("No se ha podido asignar la tarea: " + e.getMessage());
        }
    }

    @Test
    public void testEliminarOtraTarea() {
        System.out.println("eliminar otra tarea");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Tarea instance = new Tarea("002", "Tarea Nueva", "Descripción actualizada", "En progreso", fechaCreacion, fechaVencimiento, "Personal");
            instance.eliminar();
            if (!instance.isEliminada()) {
                fail("Se esperaba 'true', pero se obtuvo '" + instance.isEliminada() + "'.");
            }
        } catch (Exception e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }

    @Test
    public void testGenerarInformeOtraTarea() {
        System.out.println("generarInforme otra tarea");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdf.parse("05-05-2025");
            Date fechaVencimiento = sdf.parse("25-05-2025");
            Tarea instance = new Tarea("002", "Tarea Nueva", "Descripción actualizada", "En progreso", fechaCreacion, fechaVencimiento, "Personal");
            instance.generarInforme();
        } catch (Exception e) {
            fail("No se ha generado el informe correctamente.");
        }
    }
    
}
