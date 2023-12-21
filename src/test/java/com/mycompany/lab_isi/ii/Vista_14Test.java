/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import fachada.Emparejamiento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import modelo.Actividad;
import modelo.Cliente;
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
public class Vista_14Test {
    
    public Vista_14Test() {
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
    public void testEmparejar() throws ParseException
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        DefaultListModel<ReservaActividad> m = new DefaultListModel<>();
        ArrayList<ReservaActividad> p = new ArrayList<>();
        Actividad aux_actividad = new Actividad(10,"Piscina",
        formato.parse("12/12/2025"),"12:00",
        "15:00",false);
        Cliente aux_cliente1 = new Cliente("user1","pass",0),
        aux_cliente2 = new Cliente("user2","pass",1);
        ReservaActividad r1 = new ReservaActividad(
        formato.parse("01/01/2024"),aux_actividad,
        "11:00","14:00",aux_cliente1);
        ReservaActividad r2 = new ReservaActividad(
        formato.parse("01/01/2024"),aux_actividad,
        "11:00","14:00",aux_cliente2);
        m.add(0, r1);
        m.add(1, r2);
        p.add(r1);
        p.add(r2);
        Emparejamiento e = new Emparejamiento(m, p);
        m = e.emparejarid(0);
        assertEquals(1, m.size());
        m = e.emparejarid(0);
        assertEquals(0, m.size());
    }
    /**
     * Test of main method, of class Vista_14.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vista_14.main(args);
    }
}
