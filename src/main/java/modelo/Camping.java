package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Camping {
    private static Camping camping;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Historico> historicos;
    private ArrayList<Reserva> reservas;
    private ArrayList<Actividad> actividades;
    private ArrayList<ReservaActividad> reservas_actividades;
    private ArrayList<Tienda> tiendas;
    private Camping()
    {
        parcelas = new ArrayList<Parcela>();
        clientes = new ArrayList<Cliente>();
        trabajadores = new ArrayList<Trabajador>();
        historicos = new ArrayList<Historico>();
        reservas = new ArrayList<Reserva>();
        actividades = new ArrayList<Actividad>();
        reservas_actividades = new ArrayList<ReservaActividad>();
        tiendas = new ArrayList<Tienda>();
    }
            
    public static Camping getInstancia() {
        if (camping == null) 
            camping = new Camping();
        return camping;
    }
    
    public ArrayList<Actividad> getActividades()
    {
        return actividades;
    }
    
    public Cliente loginC(String usu, String pass)
    {
       Cliente c = null;
       boolean encontrado = false;
        int i = 0;

        while (i < clientes.size() && encontrado == false) {
            if(clientes.get(i).getUsuario().equals(usu) 
                    && clientes.get(i).getContrasenya().equals(pass))
            {
                c = clientes.get(i);
                encontrado = true;
            }
            i++;
        }
       
        return c; 
    }
    
    public Trabajador loginT(String usu, String pass)
    {
       Trabajador t = null;
       boolean encontrado = false;
        int i = 0;

        while (i < trabajadores.size() && encontrado == false) {
            if(trabajadores.get(i).getUsuario().equals(usu) 
                    && trabajadores.get(i).getContrasenya().equals(pass))
            {
                t = trabajadores.get(i);
                encontrado = true;
            }
            i++;
        }
       
        return t; 
    }
    
    public void cargarDatos() throws ParseException
    {
        Cliente c1 = new Cliente("c1","c1");
        clientes.add(c1);
        
        Trabajador t1 = new Trabajador("t1","t1");
        trabajadores.add(t1);
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Actividad a1 = new Actividad(1,"piscina",formato.parse("05/11/2023"),"15:00","17:00");
        actividades.add(a1);
    }
}
