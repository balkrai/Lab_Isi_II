package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Parcela {
    private int id, m2;
    private Boolean luz;
    private float precio;
    //private String imagen;
    private ArrayList<Reserva> reservas;
    public Parcela(int id, int m2, Boolean luz, float precio/*, String imagen*/)
    {
        this.id = id;
        this.m2 = m2;
        this.luz = luz;
        this.precio = precio;
        //this.imagen = imagen;
        reservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public void setReserva(int yearIni, int monthIni, int dateIni, int yearFin, int monthFin, int dateFin, Cliente c){
        reservas.add(new Reserva(reservas.size(), new Date(yearIni,monthIni,dateIni,0,0,0), new Date(yearFin,monthFin,dateFin,0,0,0),c,this));
    }

    @Override
    public String toString() {
        return "Parcela: "+id+"; Metros cuadrados: "+m2+"; Luz: "+luz+"; Precio: "+precio;
    }
    public void anyadirReserva(Reserva r)
    {
        reservas.add(r);
    }
     
    public int getId()
    {
        return id;
    }
    public int getm2()
    {
        return m2;
    }
    public Boolean getLuz()
    {
        return luz;
    }
    public float getPrecio()
    {
        return precio;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setm2(int m2)
    {
        this.m2 = m2;
    }
    public void setLuz(Boolean luz)
    {
        this.luz = luz;
    }
    public void setPrecio(float precio)
    {
        this.precio = precio;
    }
}
