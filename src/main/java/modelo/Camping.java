package modelo;

import java.util.ArrayList;

public class Camping {
    private static Camping camping;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Historico> historicos;
    private ArrayList<Reserva> reservas;
    private ArrayList<Actividad> actividades;
    private ArrayList<ReservaActividad> reservas_actividades;
    private ArrayList<Tienda> tiendas;
    private Camping()
    {
        parcelas = new ArrayList<Parcela>();
        clientes = new ArrayList<Cliente>();
        historicos = new ArrayList<Historico>();
        reservas = new ArrayList<Reserva>();
        actividades = new ArrayList<Actividad>();
        reservas_actividades = new ArrayList<ReservaActividad>();
        tiendas = new ArrayList<Tienda>();
    }
    
    public void cargarDatos()
    {
        
    }
}
