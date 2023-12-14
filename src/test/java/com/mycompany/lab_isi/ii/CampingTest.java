/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

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
     * Test of getParcelas method, of class Camping.
     */
    @Test
    public void testGetParcelas() {
        System.out.println("getParcelas");
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = Camping.getParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadirReserva method, of class Camping.
     */
    @Test
    public void testAnyadirReserva() {
        System.out.println("anyadirReserva");
        Reserva r = null;
        Camping.anyadirReserva(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarIdReserva method, of class Camping.
     */
    @Test
    public void testGenerarIdReserva() {
        System.out.println("generarIdReserva");
        int expResult = 0;
        int result = Camping.generarIdReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class Camping.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Camping instance = null;
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReservaActividad method, of class Camping.
     */
    @Test
    public void testAddReservaActividad() {
        System.out.println("addReservaActividad");
        ReservaActividad res = null;
        Camping instance = null;
        instance.addReservaActividad(res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelasDisponibles method, of class Camping.
     */
    @Test
    public void testGetParcelasDisponibles() {
        System.out.println("getParcelasDisponibles");
        Date ini = null;
        Date fin = null;
        Camping instance = null;
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getParcelasDisponibles(ini, fin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstancia method, of class Camping.
     */
    @Test
    public void testGetInstancia() {
        System.out.println("getInstancia");
        Camping expResult = null;
        Camping result = Camping.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActActual method, of class Camping.
     */
    @Test
    public void testSetActActual() {
        System.out.println("setActActual");
        Actividad actActual = null;
        Camping instance = null;
        instance.setActActual(actActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActActual method, of class Camping.
     */
    @Test
    public void testGetActActual() {
        System.out.println("getActActual");
        Camping instance = null;
        Actividad expResult = null;
        Actividad result = instance.getActActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividades method, of class Camping.
     */
    @Test
    public void testGetActividades() {
        System.out.println("getActividades");
        Camping instance = null;
        ArrayList<Actividad> expResult = null;
        ArrayList<Actividad> result = instance.getActividades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReserva method, of class Camping.
     */
    @Test
    public void testSetReserva() {
        System.out.println("setReserva");
        Parcela p = null;
        int yearIni = 0;
        int monthIni = 0;
        int dateIni = 0;
        int yearFin = 0;
        int monthFin = 0;
        int dateFin = 0;
        Cliente c = null;
        Camping instance = null;
        instance.setReserva(p, yearIni, monthIni, dateIni, yearFin, monthFin, dateFin, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginC method, of class Camping.
     */
    @Test
    public void testLoginC() {
        System.out.println("loginC");
        String usu = "";
        String pass = "";
        Camping instance = null;
        Cliente expResult = null;
        Cliente result = instance.loginC(usu, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginT method, of class Camping.
     */
    @Test
    public void testLoginT() {
        System.out.println("loginT");
        String usu = "";
        String pass = "";
        Camping instance = null;
        Trabajador expResult = null;
        Trabajador result = instance.loginT(usu, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarDatos method, of class Camping.
     */
    @Test
    public void testCargarDatos() throws Exception {
        System.out.println("cargarDatos");
        Camping instance = null;
        instance.cargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
