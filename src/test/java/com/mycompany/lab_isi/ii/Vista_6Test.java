/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import java.text.ParseException;
import modelo.Camping;
import modelo.Cliente;
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
public class Vista_6Test {
    
    public Vista_6Test() {
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

    @Test
    public void testSomeMethod(){
        int numParcelasOriginal = 3, numParcelasObtenido;
        Camping camping = Camping.getInstancia();
        camping.anyadirParcela(new Parcela(1,200,true,40.0f));
        camping.anyadirParcela(new Parcela(2,150,true,30.0f));
        camping.anyadirParcela(new Parcela(3,100,false,20.0f));
        Cliente cliente = new Cliente("user", "pass", 0);
        Vista_6 vista6 = new Vista_6(camping,cliente);
        vista6.testVista6(numParcelasOriginal);
        numParcelasObtenido = vista6.getNumParcelasObtenido();
        assertTrue(numParcelasOriginal >= numParcelasObtenido);
    }
    
}
