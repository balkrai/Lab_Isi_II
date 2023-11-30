package modelo;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String usuario, contrasenya;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
    private Historico historico;
    private ArrayList<ReservaActividad>  resActividad = new ArrayList<ReservaActividad>();
    public Cliente(String usuario, String contrasenya, int id)
    {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.id = id;
    }
    public Cliente(){}
    public static Cliente IniciarSesion(String usu, String contra) {
        return Camping.getInstancia().loginC(usu,contra);
    }
    
    public void AgregaReserva(Reserva r)
    {
        reservas.add(r);
    }
    public ArrayList<ReservaActividad> getReservaActividad()
    {
        return resActividad;
    }
    public ArrayList<Reserva> getReservas()
    {
        return reservas;
    }
    public ArrayList<Tienda> getTiendas()
    {
        return tiendas;
    }
    public String getUsuario()
    {
        return usuario;
    }
    public String getContrasenya()
    {
        return contrasenya;
    }
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }
    public void setContrasenya(String contrasenya)
    {
        this.contrasenya = contrasenya;
    }
    public Reserva BuscarReservaPorId(int id)
    {
        Reserva reservaEncontrada = null;
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) { // Suponiendo que Reserva tiene un método getId() que devuelve el ID
                reservaEncontrada = reserva;
                break; 
            }
        }
        return reservaEncontrada;
    }
    
    public void ModificaReserva(Reserva modificada)
    {
         int idReservaModificada = modificada.getId();

         for (int i = 0; i < reservas.size(); i++) {
            Reserva reservaExistente = reservas.get(i);
            if (reservaExistente.getId() == idReservaModificada) {
                reservas.set(i, modificada);
                break; 
            }
        }
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void BorrarReserva(Reserva r)
    {
        reservas.remove(r);
    }
    
    
}
