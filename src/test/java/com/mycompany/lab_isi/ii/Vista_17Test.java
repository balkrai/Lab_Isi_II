/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import modelo.Parcela;
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
public class Vista_17Test {
    
    public Vista_17Test() {
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
     * Test of main method, of class Vista_17.
     */
    
    @Test
    public void testDescuento() {
        Parcela prueba = new Parcela(1,1,false, (float) 100.0);
        String descuento = "10";
        prueba.setPrecio(prueba.getPrecio()-((Float.parseFloat(descuento)/100)*prueba.getPrecio()));
        assertEquals(90.0, prueba.getPrecio(), 1);
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vista_17.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
