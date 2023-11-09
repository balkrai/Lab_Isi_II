package modelo;

import java.time.Instant;
import java.util.Date;

public class Reserva {
    private Date fechaInicio, fechaFin;
    private boolean llegada, salida;
    private Cliente cliente;
    private Parcela parcela;
    private int id;
    public Reserva(int id, Date fechaInicio, Date fechaFin, Cliente cliente, 
                   Parcela parcela)
    {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.parcela = parcela;
        this.llegada = false;
        this.salida = false;
        this.id = id;
        parcela.anyadirReserva(this);
    }
    
    
    public Date getFechaInicio()
    {
        return fechaInicio;
    }
    public Date getFechaFin()
    {
        return fechaFin;
    }
    public boolean getLlegada()
    {
        return llegada;
    }
    public boolean getSalida()
    {
        return salida;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    public Parcela getParcela()
    {
        return parcela;
    }
    public float getPrecio()
    {
        return parcela.getPrecio();
    }
    public int getId()
    {
        return id;
    }
    public boolean setLlegada()
    {
        Date fechaLlegada = Date.from(Instant.now());
        if(fechaLlegada.compareTo(this.fechaInicio) >= 0 && 
           fechaLlegada.compareTo(this.fechaFin) < 0)
        {
            llegada = true;
            return true;
        }
        return false;
    }
    public boolean setSalida()
    {
        if(llegada)
        {
            salida = true;
            return true;
        }
        return false;
    }
}