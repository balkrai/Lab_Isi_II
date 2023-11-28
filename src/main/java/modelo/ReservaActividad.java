package modelo;

import java.util.Date;

public class ReservaActividad {
    private Actividad act;
    private int id, idActividad;
    private Date fecha;
    private String hora_inicio, hora_fin;
    private Boolean finalizada;
    private Cliente cliente;
    public ReservaActividad() {}
    public ReservaActividad(Date fecha, Actividad act, String hora_inicio, 
            String hora_fin, Cliente cliente)
    {
        this.fecha = fecha;
        this.act = act;
        this.cliente = cliente;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.finalizada = false;
        this.idActividad = act.getId();
    }
    public int getIdActividad()
    {
        return act.getId();
    }
    public int getIdReserva()
    {
        return id;
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
    public String getHoraInicio()
    {
        return hora_inicio;
    }
    public String getHoraFin()
    {
        return hora_fin;
    }
    public Boolean getFinalizada()
    {
        return finalizada;
    }
    public void setFinalizada(Boolean finalizada)
    {
        this.finalizada = finalizada;
    }
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    public void setAct(Actividad act)
    {
        this.act = act;
    }
    public void setHoraInicio(String hora_inicio)
    {
        this.hora_inicio = hora_inicio;
    }
    public void setHoraFin(String hora_fin)
    {
        this.hora_fin = hora_fin;
    }
    public void setIdActividad(int idActividad)
    {
        this.idActividad = idActividad;
    }
    public void setIdReserva(int id)
    {
        this.id = id;
    }
    @Override
    public String toString()
    {
        return cliente.getUsuario();
    }
}
