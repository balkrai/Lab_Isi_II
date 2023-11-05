package modelo;

import java.util.ArrayList;

public class Cliente {
    private String usuario, contrasenya;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
    private Historico historico;
    public Cliente(String usuario, String contrasenya)
    {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    
    public static Cliente IniciarSesion(String usu, String contra) {
        return Camping.getInstancia().login(usu,contra);
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
}
