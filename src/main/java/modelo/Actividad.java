package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public Actividad(){}
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setFecha(String fecha) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date fech = format.parse(fecha);
        this.fecha = fech;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setParticipantes(ArrayList<ReservaActividad> participantes) {
        this.participantes = participantes;
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
    public boolean CompararHoras(String HoraActual, Actividad actividad){
        boolean aux = false;
        String[] auxActual = HoraActual.split(":");
        String[] auxActividadInit = actividad.getHoraInicio().split(":");
        String[] auxActividadFin = actividad.getHoraFin().split(":");
        
        if((Integer.parseInt(auxActual[0])>Integer.parseInt(auxActividadInit[0]))
           && (Integer.parseInt(auxActual[0])< Integer.parseInt(auxActividadFin[0])))
        {
           aux = true;
        }
        else if((Integer.parseInt(auxActual[0])==Integer.parseInt(auxActividadInit[0]))
           && (Integer.parseInt(auxActual[0])== Integer.parseInt(auxActividadFin[0])))
        {
            if((Integer.parseInt(auxActual[1])>=Integer.parseInt(auxActividadInit[1]))
           && (Integer.parseInt(auxActual[1])<= Integer.parseInt(auxActividadFin[1])))
            {
                aux = true;
            }
        }
        else
        {
            aux = false;
        }
        return aux;
    }
    @Override
    public String toString() 
    {
        return "Actividad "+id+", Tipo "+tipo+", Inicio "+horaInicio
                +", horaFin "+horaFin+", Fecha "+fecha;
    }
}