/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import modelo.Camping;
import modelo.Cliente;
import modelo.Trabajador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivan5
 */
public class Vista_1Test {
    
    public Vista_1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Vista_1.
     */
    
    @Test
    public void testLoginCliente() {
        Camping instancia = Camping.getInstancia();
        String usuario = "prueba";
        String password = "prueba";
        int id = 10;
        instancia.anyadirCliente(new Cliente(usuario, password, id));
        Cliente c = Cliente.IniciarSesion(usuario, password);
        assertEquals(new Cliente("prueba","prueba",10),c);        
    }
    
    @Test
    public void testLoginTrabajador() {
        Camping instancia = Camping.getInstancia();
        String usuario = "prueba";
        String password = "prueba";
        int id = 10;
        instancia.anyadirTrabajador(new Trabajador(usuario, password, id));
        Trabajador t = Trabajador.IniciarSesion(usuario, password);
        assertEquals(new Trabajador("prueba","prueba",10),t);        
    }
    
    @Test
    public void testMain() {
    }
    
}
