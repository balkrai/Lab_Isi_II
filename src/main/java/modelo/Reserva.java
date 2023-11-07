package modelo;

import java.util.Date;

public class Reserva {
    private int id;
    private Date fechaInicio, fechaFin;
    private Cliente cliente;
    private Parcela parcela;
    public Reserva(int id, Date fechaInicio, Date fechaFin, Cliente cliente, 
            Parcela parcela)
    {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.parcela = parcela;
        parcela.anyadirReserva(this);
    }
    
    public Date getFechaInicio()
    {
        return fechaInicio;
    }
    public float getPrecio()
    {
        return parcela.getPrecio();
    }
    public Date getFechaFin()
    {
        return fechaFin;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    public Parcela getParcela()
    {
        return parcela;
    }      
    public int getId()
    {
        return id;
    }
}