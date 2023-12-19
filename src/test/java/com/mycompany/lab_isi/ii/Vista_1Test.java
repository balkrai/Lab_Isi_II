/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

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
        String usuario = "prueba";
        String password = "prueba";
        int id = 10;
        Cliente c = Cliente.IniciarSesion(usuario, password);
        c.setId(id);
        assertSame(c,new Cliente("prueba","prueba",c.getId()));        
    }
    
    @Test
    public void testLoginTrabajador() {
        String usuario = "prueba";
        String password = "prueba";
        int id = 10;
        Trabajador t = Trabajador.IniciarSesion(usuario, password);
        t.setId(10);
        assertSame(t,new Trabajador("prueba","prueba",t.getId()));        
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vista_1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
