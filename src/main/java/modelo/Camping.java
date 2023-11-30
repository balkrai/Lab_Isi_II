package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Camping {

    private static Camping camping;
    private static ArrayList<Parcela> parcelas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Historico> historicos;
    private static ArrayList<Reserva> reservas;
    private ArrayList<Actividad> actividades;
    private ArrayList<ReservaActividad> reservas_actividades;
    private ArrayList<Tienda> tiendas;
    private Actividad actActual;
    private static int idReserva = 4;

    private Camping() {
        parcelas = new ArrayList<Parcela>();
        clientes = new ArrayList<Cliente>();
        trabajadores = new ArrayList<Trabajador>();
        historicos = new ArrayList<Historico>();
        reservas = new ArrayList<Reserva>();
        actividades = new ArrayList<Actividad>();
        reservas_actividades = new ArrayList<ReservaActividad>();
        tiendas = new ArrayList<Tienda>();
    }

    public static ArrayList<Parcela> getParcelas() {
        return parcelas;
    }
    
    public static void anyadirReserva(Reserva r) {
        reservas.add(r);
    }

    public static int generarIdReserva() {
        idReserva++;
        return idReserva;
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }

    public void addReservaActividad(ReservaActividad res) {
        reservas_actividades.add(res);
    }

    public ArrayList<Parcela> getParcelasDisponibles(Date ini, Date fin) {
        System.err.println("Entro donde toca");
        ArrayList<Parcela> resultado = new ArrayList<>();
        System.out.println("Cantidad de parcelas " + parcelas.size());
        for (Parcela p : this.parcelas) {
            if (p.getReservas().isEmpty()) {
                resultado.add(p);
            } else {
                for (Reserva r : p.getReservas()) {
                    System.err.println("Reservas de p");
                    System.err.println(p.getReservas());
                    if (ini.before(r.getFechaInicio()) && fin.before(r.getFechaInicio())) {
                        resultado.add(p);
                    } else if (ini.after(r.getFechaFin())) {
                        resultado.add(p);
                    }
                }
            }
        }
        return resultado;
    }

    public static Camping getInstancia() {
        if (camping == null) {
            camping = new Camping();
        }
        return camping;
    }

    public void setActActual(Actividad actActual) {
        this.actActual = actActual;
    }

    public Actividad getActActual() {
        return actActual;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }
    
    public void setReserva(Parcela p, int yearIni, int monthIni, int dateIni, int yearFin, int monthFin, int dateFin, Cliente c){
        reservas.add(new Reserva(reservas.size(), new Date(yearIni,monthIni,dateIni,0,0,0), new Date(yearFin,monthFin,dateFin,0,0,0),c,p));
    }

    public Cliente loginC(String usu, String pass) {
        Cliente c = null;
        boolean encontrado = false;
        int i = 0;

        while (i < clientes.size() && encontrado == false) {
            if (clientes.get(i).getUsuario().equals(usu)
                    && clientes.get(i).getContrasenya().equals(pass)) {
                c = clientes.get(i);
                encontrado = true;
            }
            i++;
        }

        return c;
    }

    public Trabajador loginT(String usu, String pass) {
        Trabajador t = null;
        boolean encontrado = false;
        int i = 0;

        while (i < trabajadores.size() && encontrado == false) {
            if (trabajadores.get(i).getUsuario().equals(usu)
                    && trabajadores.get(i).getContrasenya().equals(pass)) {
                t = trabajadores.get(i);
                encontrado = true;
            }
            i++;
        }

        return t;
    }

    public void cargarDatos() throws ParseException {
        ParcelaDao dao_parcela = new ParcelaDao();
        ReservaDAO dao_reserva = new ReservaDAO();
        for(int i=0;i<dao_parcela.maxId();i++)
        {
            Parcela p = new Parcela(i, i, Boolean.TRUE, i);
            p = dao_parcela.leerParcela(i);
            parcelas.add(p);
        }
        for(int i=0;i<dao_reserva.maxId();i++)
        {
            Date d = new Date();
            Cliente c = new Cliente("", "", 1);
            Parcela p = new Parcela(1, 1, Boolean.TRUE, 1);
            Reserva r = new Reserva(i, d, d, c, p);
            r = dao_reserva.leerReserva(i);
            reservas.add(r);
        }
     
    }
}
