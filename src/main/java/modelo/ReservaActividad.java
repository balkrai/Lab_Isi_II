package modelo;

import java.util.Date;

public class ReservaActividad {
    private Actividad act;
    private Date fecha;
    private String hora;
    private Cliente cliente;
    public ReservaActividad(Date fecha, Actividad act,
            Cliente cliente, String hora)
    {
        this.fecha = fecha;
        this.act = act;
        this.cliente = cliente;
        this.hora = hora;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    public Date getFecha()
    {
        return fecha;
    }
    public Actividad getAct()
    {
        return act;
    }
    public String getHora()
    {
        return hora;
    }
    @Override
    public String toString()
    {
        return cliente.getUsuario();
    }
}
