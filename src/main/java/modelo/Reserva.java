package modelo;

public class Reserva {
    private int diaInicio, mesInicio, anyoInicio, diaFin, mesFin, anyoFin;
    private Cliente cliente;
    private Parcela parcela;
    public Reserva(int diaInicio, int mesInicio, int anyoInicio, int diaFin,
                int mesFin, int anyoFin, Cliente cliente, Parcela parcela)
    {
        this.diaInicio = diaInicio;
        this.diaInicio = mesInicio;
        this.diaInicio = anyoInicio;
        this.diaInicio = diaFin;
        this.diaInicio = mesFin;
        this.diaInicio = anyoFin;
        this.cliente = cliente;
        this.parcela = parcela;
    }
    public int getDiaInicio()
    {
        return diaInicio;
    }
    public int getMesInicio()
    {
        return mesInicio;
    }
    public int getAnyoInicio()
    {
        return anyoInicio;
    }
    public int getDiaFin()
    {
        return diaFin;
    }
    public int getMesFin()
    {
        return mesFin;
    }
    public int getAnyoFin()
    {
        return anyoFin;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    public Parcela getParcela()
    {
        return parcela;
    }        
}
