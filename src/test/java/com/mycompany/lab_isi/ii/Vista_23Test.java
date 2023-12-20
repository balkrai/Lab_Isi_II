/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Cliente;
import modelo.Reserva;
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
public class Vista_23Test {
    
    public Vista_23Test() {
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
    public void PruebaBorrarReserva() {
     // Crear un cliente
        Cliente cliente = new Cliente();
        
        // Crear algunas reservas para el cliente
        Reserva reserva1 = new Reserva();
        Reserva reserva2 = new Reserva();
        Reserva reserva3 = new Reserva();
        
        // Agregar las reservas al cliente
        cliente.AgregaReserva(reserva1);
        cliente.AgregaReserva(reserva2);
        cliente.AgregaReserva(reserva3);
        
        assertEquals(3, cliente.getReservas().size());
        
        cliente.BorrarReserva(reserva2);
        assertEquals(2, cliente.getReservas().size());
        assertFalse(cliente.getReservas().contains(reserva2));
        
    }
    
    public void testModificaFechaInicioReserva() throws ParseException {
        Cliente cliente = new Cliente();

        Reserva reserva = new Reserva();
        reserva.setId(1);
        
        
        String FechaInicioString = "20/12/2022";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaInicio = formato.parse(FechaInicioString);
        reserva.setFechaInicio(FechaInicio);
        
         cliente.AgregaReserva(reserva);

       
        Date fechaInicioOriginal = reserva.getFechaInicio();
        
        String nuevaFechaInicioString = "20/12/2023";
        Date nuevaFechaInicio = formato.parse(nuevaFechaInicioString);
        reserva.setFechaInicio(nuevaFechaInicio);
        cliente.ModificaReserva(reserva);
        
        Reserva modificada = cliente.BuscarReservaPorId(1);
        
        // Verificar si se modificó la fecha de inicio de la reserva
        assertEquals(nuevaFechaInicio, modificada.getFechaInicio());
        assertEquals(FechaInicio, reserva.getFechaInicio());
    }
    
}
