package modelo;

public class Historico {
    private int diaRealEntrada, mesRealEntrada, anyoRealEntrada, diaRealSalida,
      mesRealSalida, anyoRealSalida;
    private float precio;
    public Historico(int diaRealEntrada, int mesRealEntrada,
            int anyoRealEntrada, int diaRealSalida, int mesRealSalida, 
            int anyoRealSalida, float precio)
    {
        this.diaRealEntrada = diaRealEntrada;
        this.mesRealEntrada = diaRealEntrada;
        this.anyoRealEntrada = diaRealEntrada;
        this.diaRealSalida = diaRealEntrada;
        this.mesRealSalida = diaRealEntrada;
        this.anyoRealSalida = diaRealEntrada;
        this.precio = precio;
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
    public float getPrecio()
    {
        return precio;
    }
    public void setDiaRealEntrada()
    {
        this.diaRealEntrada = diaRealEntrada;
    }
    public void setMesRealEntrada()
    {
        this.mesRealEntrada = mesRealEntrada;
    }
    public void setAnyoRealEntrada()
    {
        this.anyoRealEntrada = anyoRealEntrada;
    }
    public void setDiaRealSalida()
    {
        this.diaRealSalida = diaRealSalida;
    }
    public void setMesRealSalida()
    {
        this.mesRealSalida = mesRealSalida;
    }
    public void setAnyoRealSalida()
    {
        this.anyoRealSalida = anyoRealSalida;
    }
    public void setPrecio()
    {
        this.precio = precio;
    }
}
