package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Actividad {
    private int id;
    private String tipo;
    private Date fecha;
    private String horaInicio, horaFin;
    private Boolean finalizada;
    private ArrayList<ReservaActividad> participantes =
            new ArrayList<ReservaActividad>();
    public Actividad(int id, String tipo, Date fecha, String horaInicio, 
            String horaFin, Boolean finalizada)
    {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.finalizada = finalizada;
    }
    public void setReserva(ReservaActividad r)
    {
        this.participantes.add(r);
    }
    public int getId()
    {
        return id;
    }
    public Boolean getFinalizada(){
        return finalizada;
    }
    public void setFinalizada(Boolean finalizada){
        this.finalizada = finalizada;
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
    public ArrayList<ReservaActividad> getParticipantes()
    {
        return participantes;
    }
    @Override
    public String toString() 
    {
        return "Actividad "+id+", Tipo "+tipo+", Inicio "+horaInicio
                +", horaFin "+horaFin+", Fecha "+fecha;
    }
}