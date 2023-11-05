package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Actividad {
    private int id;
    private String tipo;
    private Date fecha;
    private String horaInicio, horaFin;
    private ArrayList<ReservaActividad> reservas = 
            new ArrayList<ReservaActividad>();
    private ArrayList<ReservaActividad> participantes =
            new ArrayList<ReservaActividad>();
    public Actividad(int id, String tipo, Date fecha, String horaInicio, 
            String horaFin)
    {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    public int getId()
    {
        return id;
    }
    public String getTipo()
    {
        return tipo;
    }
    public Date getFecha()
    {
        return fecha;
    }
    public String getHoraInicio()
    {
        return horaInicio;
    }
    public String getHoraFin()
    {
        return horaFin;
    }
}