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
        Parcela parcela = new Parcela(1, 100, true, 100.0f);
        Parcela parcela2 = new Parcela(2, 12, false, 10.0f);
        Parcela parcela3 = new Parcela(3, 50, true, 20.0f);

        parcelas.add(parcela);
        parcelas.add(parcela2);
        parcelas.add(parcela3);

        Cliente c1 = new Cliente("c1", "c1",0);
        clientes.add(c1);
        Cliente c2 = new Cliente("c2", "c2",1);
        clientes.add(c2);
        Cliente c3 = new Cliente("c3", "c3",2);
        clientes.add(c3);
        Cliente c4 = new Cliente("c4", "c4",3);
        clientes.add(c4);

        Reserva reserva = new Reserva(1, new Date(123, 10, 7, 0, 0, 0), new Date(123, 10, 7, 0, 0, 0), c1, parcela);
        c1.AgregaReserva(reserva);
        
        reservas.add(reserva);

        Trabajador t1 = new Trabajador("t1", "t1");
        trabajadores.add(t1);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Actividad a1 = new Actividad(1, "piscina", formato.parse("05/11/2023"), "15:00", "17:00", false);
        actividades.add(a1);
        Actividad a2 = new Actividad(2, "piscina", formato.parse("05/11/2023"), "17:00", "19:00", false);
        actividades.add(a2);

        ReservaActividad ra1 = new ReservaActividad(formato.parse("05/11/2023"), a1, "15:00", null, c1);
        ReservaActividad ra2 = new ReservaActividad(formato.parse("05/11/2023"), a1, "15:00", null, c2);
        ReservaActividad ra3 = new ReservaActividad(formato.parse("05/11/2023"), a1, "15:00", null, c3);
        ReservaActividad ra4 = new ReservaActividad(formato.parse("05/11/2023"), a1, "15:00", null, c4);
        a1.setReserva(ra1);
        a1.setReserva(ra2);
        a1.setReserva(ra3);
        a1.setReserva(ra4);
    }
}
