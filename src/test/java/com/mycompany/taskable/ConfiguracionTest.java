/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taskable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Medac
 */
public class ConfiguracionTest {
    
    public ConfiguracionTest() {
    }
    //  Test 1
    @Test
    public void testActualizarParametros() {
        System.out.println("actualizarParametros");
        String nuevos = "Parametros nuevos";
        Configuracion instance = new Configuracion ("Parametros de prueba", "001");
        instance.actualizarParametros(nuevos);
        if (!instance.getParametros().equals(nuevos)) {
            fail("Se esperaba '" + nuevos + "', pero se obtuvo '" + instance.getParametros() + "'.");
        }
    }
    
    //  Test 2
    
    @Test
    public void testActualizarOtrosParametros() {
        System.out.println("actualizarParametros");
        String nuevos = "Otros parametros nuevos";
        Configuracion instance = new Configuracion ("Otros parametros de prueba", "002");
        instance.actualizarParametros(nuevos);
        if (!instance.getParametros().equals(nuevos)) {
            fail("Se esperaba '" + nuevos + "', pero se obtuvo '" + instance.getParametros() + "'.");
        }
    }
}
