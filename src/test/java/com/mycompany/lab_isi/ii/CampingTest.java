/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Actividad;
import modelo.Camping;
import modelo.Cliente;
import modelo.Parcela;
import modelo.Reserva;
import modelo.ReservaActividad;
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
public class CampingTest {
    
    public CampingTest() {
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
     * Test of getParcelasDisponibles method, of class Camping.
     */
    @Test
    public void testGetParcelasDisponibles() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date ini = format.parse("12/12/2025");
        Date fin = format.parse("13/12/2025");
        Camping instance = Camping.getInstancia();
        
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getParcelasDisponibles(ini, fin);
        assertEquals(expResult, result);
    }
}
