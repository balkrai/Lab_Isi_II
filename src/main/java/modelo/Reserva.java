package modelo;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Reserva {
    private int id, idcliente, idparcela;
    private Date fechaInicio, fechaFin;
    private boolean llegada, salida;
    private Historico historico;
    private Cliente cliente;
    private Parcela parcela;
    
    public Reserva(){}
    
    public Reserva(int id, Date fechaInicio, Date fechaFin, Cliente cliente, 
                   Parcela parcela)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");

        this.historico = new Historico();
        this.fechaInicio = new Date(sdf.format(fechaInicio));
        this.fechaFin = new Date(sdf.format(fechaFin));
        this.cliente = cliente;
        this.parcela = parcela;
        this.llegada = false;
        this.salida = false;
        this.id = id;
        idcliente = cliente.getId();
        idparcela = parcela.getId();
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
    
    
    public int getIdCliente()
    {
        return cliente.getId();
    }
    
    
    public int getIdParcela()
    {
        return parcela.getId();
    }
    
    public boolean setLlegada()
    {
        Date fechaLlegada = Date.from(Instant.now());
        if(fechaLlegada.compareTo(this.fechaInicio) >= 0 && 
           fechaLlegada.compareTo(this.fechaFin) < 0)
        {
            historico.setFechaLlegada(Date.from(Instant.now()));
            llegada = true;
            return true;
        }
        return false;
    }
    
    public boolean setSalida()
    {
        if(llegada)
        {
            historico.setFechaSalida(Date.from(Instant.now()));
            salida = true;
            return true;
        }
        return false;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setIdCliente(int id)
    {
        idcliente = id;
    }
    
    public void setIdParcela(int id)
    {
        idparcela = id;
    }
    
    public void setFechaInicio(Date fecha)
    {
        fechaInicio = fecha;
    }
    
    public void setFechaFin(Date fecha)
    {
        fechaFin = fecha;
    }
}