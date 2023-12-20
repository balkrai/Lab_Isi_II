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
        Cliente prueba = new Cliente("prueba","prueba",10);
        instancia.anyadirCliente(prueba);
        Cliente c = Cliente.IniciarSesion(usuario, password);
        assertEquals(prueba,c);        
    }
    
    @Test
    public void testLoginTrabajador() {
        Camping instancia = Camping.getInstancia();
        String usuario = "prueba2";
        String password = "prueba2";
        Trabajador prueba2 = new Trabajador("prueba2","prueba2",11);
        instancia.anyadirTrabajador(prueba2);
        Trabajador t = Trabajador.IniciarSesion(usuario, password);
        assertEquals(prueba2,t);        
    }
    
    @Test
    public void testMain() {
    }
    
}
