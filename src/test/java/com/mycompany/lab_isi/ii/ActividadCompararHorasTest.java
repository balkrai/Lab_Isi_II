/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Actividad;
import modelo.Camping;
import modelo.ReservaActividad;
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
public class ActividadCompararHorasTest {
    
    public ActividadCompararHorasTest() {
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
    public void Participar() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Actividad aux = new Actividad(10,"Piscina",format.parse("12/12/2025"),
        "12:00","15:00",false);
        String horaActual = "13:00";
        assertTrue(aux.CompararHoras(horaActual, aux));
        
        
    }
}
