/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fachada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Cliente;
import modelo.Parcela;
import modelo.Reserva;
import modelo.ReservaDAO;

/**
 *
 * @author borja
 */
public class PruebasDaos {
    public static void main(String []args) throws ParseException
    {
         SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");

           String fechaInicio = "2023-10-03";
           String fechaFin = "2028-10-09";

            Date fechaini = dateFormat.parse(fechaInicio);
           Date fechafin = dateFormat.parse(fechaFin);
           
           Cliente cliente = new Cliente("c1","c1",1);
           Parcela parcela = new Parcela(1, 20,true, 5);
           
        ReservaDAO r = new ReservaDAO();
        Reserva res = new Reserva(1,fechaini,fechafin,cliente,parcela);
        r.actualizarTienda(res);
        r.borrarTienda(1);
       
    }
    
}
