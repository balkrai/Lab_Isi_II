package fachada;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.ReservaActividad;

/**
 *
 * @author vicen
 */
public class Emparejamiento 
{
    private ArrayList<ReservaActividad> participantes, jugador1, jugador2;
    private DefaultListModel<ReservaActividad> modelo;
    int contador, numEmparejamiento;
    boolean hecho;
    
    public Emparejamiento(DefaultListModel<ReservaActividad> m, ArrayList<ReservaActividad> p)
    {
        modelo = m;
        participantes = p;
        jugador1 = new ArrayList<>();
        jugador2 = new ArrayList<>();
        numEmparejamiento = 1;
        hecho = false;
        contador = 0;
    }
    
    public boolean participanteSeleccionado(ReservaActividad r)
    {
        boolean resultado;
        if(r == null)
        {
            JOptionPane.showMessageDialog(null, 
            "SELECCIONA UN PARTICIPANTE", "Inane error",
            JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        else
        {
            ++contador;
            resultado = true;
        }
        return resultado;
    }
    
    public DefaultListModel<ReservaActividad> emparejar(ReservaActividad r)
    {
        if(contador % 2 != 0)
        {   
            jugador1.add(r);
            JOptionPane.showMessageDialog(null, 
            "Selecciona el oponente de "+r, "Inane error",
            JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            jugador2.add(r);
            JOptionPane.showMessageDialog(null, 
            "Emparejamiento confirmado: "+jugador1.get(jugador1.size() - 1)+
            " y "+jugador2.get(jugador2.size() - 1), "Inane error",
            JOptionPane.ERROR_MESSAGE);
        }
        modelo.removeElement(r);
        return modelo;
    }
    
    public int getEmparejados()
    {
        return contador;
    }
    
    public DefaultListModel<ReservaActividad> elegirGanador()
    {
        JOptionPane.showMessageDialog(null, 
        "TODOS LOS EMPAREJAMIENTOS REALIZADOS", 
        "Inane error",JOptionPane.ERROR_MESSAGE);
        for(int i = 0; i < jugador1.size(); ++i)
        {
            Boolean valido = false;
            while(!valido)
            {
                valido = true;
                String ganador = JOptionPane.showInputDialog("Emparejamiento "
                +numEmparejamiento+": ¿Ganador? "+jugador1.get(i)+"(0) o "
                +jugador2.get(i)+"(1)");
                if(Integer.parseInt(ganador) == 0)
                {
                    modelo.addElement(jugador1.get(i));
                    participantes.remove(jugador2.get(i));
                }
                else if(Integer.parseInt(ganador) == 1)
                {
                    modelo.addElement(jugador2.get(i));
                    participantes.remove(jugador1.get(i));
                }
                else
                {
                    valido = false;
                    JOptionPane.showMessageDialog(null, 
                    "INTRODUCE UN VALOR VALIDO", "Inane error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            ++numEmparejamiento;
                    
        }
        if(jugador1.size() == 1)
        {
            JOptionPane.showMessageDialog(null, "GANADOR: "
            +modelo.get(0), "Inane error",
            JOptionPane.ERROR_MESSAGE);
            hecho = true;
        }
        contador = 0;
        jugador1.clear();
        jugador2.clear();
        return modelo;
    }
    
    public boolean hecho()
    {
        return hecho;
    }
}
