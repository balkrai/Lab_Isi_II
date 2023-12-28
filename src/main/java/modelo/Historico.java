package modelo;

import java.util.Date;

public class Historico {
    private int diaRealEntrada, mesRealEntrada, anyoRealEntrada, diaRealSalida,
      mesRealSalida, anyoRealSalida, id;
    private float precio;
    private Cliente cliente;
    private Date fechaLlegada, fechaRealLlegada;
    private Date fechaSalida, fechaRealSalida;
    public Historico() {}
    public Historico(int diaRealEntrada, int mesRealEntrada,
            int anyoRealEntrada, int diaRealSalida, int mesRealSalida, 
            int anyoRealSalida, float precio, Cliente cliente, int id)
    {
        this.diaRealEntrada = diaRealEntrada;
        this.mesRealEntrada = diaRealEntrada;
        this.anyoRealEntrada = diaRealEntrada;
        this.diaRealSalida = diaRealEntrada;
        this.mesRealSalida = diaRealEntrada;
        this.anyoRealSalida = diaRealEntrada;
        this.precio = precio;
        this.cliente = cliente;
        this.id = id;
    }
    
    public int getId()
    {
        return id;
    }
    public int getDiaRealEntrada()
    {
        return diaRealEntrada;
    }
    public int getMesRealEntrada()
    {
        return mesRealEntrada;
    }
    public int getAnyoRealEntrada()
    {
        return anyoRealEntrada;
    }
    public int getDiaRealSalida()
    {
        return diaRealSalida;
    }
    public int getMesRealSalida()
    {
        return mesRealSalida;
    }
    public int getAnyoRealSalida()
    {
        return anyoRealSalida;
    }
    public Date getFechaLlegada()
    {
        return fechaLlegada;
    }
    public Date getFechaSalida()
    {
        return fechaSalida;
    }
    public float getPrecio()
    {
        return precio;
    }
    public int getIdCliente()
    {
        return cliente.getId();
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setDiaRealEntrada(int diaRealEntrada)
    {
        this.diaRealEntrada = diaRealEntrada;
    }
    public void setMesRealEntrada(int mesRealEntrada)
    {
        this.mesRealEntrada = mesRealEntrada;
    }
    public void setAnyoRealEntrada(int anyoRealEntrada)
    {
        this.anyoRealEntrada = anyoRealEntrada;
    }
    public void setDiaRealSalida(int diaRealSalida)
    {
        this.diaRealSalida = diaRealSalida;
    }
    public void setMesRealSalida(int mesRealSalida)
    {
        this.mesRealSalida = mesRealSalida;
    }
    public void setAnyoRealSalida(int anyoRealSalida)
    {
        this.anyoRealSalida = anyoRealSalida;
    }
    public void setFechaLlegada(Date fecha)
    {
        this.fechaLlegada = fecha;
    }
    public void setFechaSalida(Date fecha)
    {
        this.fechaLlegada = fecha;
    }
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    public void setIdCliente(int id)
    {
        this.id = id;
    }
}
