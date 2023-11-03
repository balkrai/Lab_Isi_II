package modelo;

import java.util.ArrayList;

public class Actividad {
    private String tipo;
    private ArrayList<ReservaActividad> reservas = 
            new ArrayList<ReservaActividad>();
    private ArrayList<ReservaActividad> participantes =
            new ArrayList<ReservaActividad>();
    public Actividad(String tipo)
    {
        if(tipo == "piscina" || tipo == "fronton" || tipo == "club_social")
            this.tipo = tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
}