package modelo;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Camping {

    private static Camping camping;
    private static ArrayList<Parcela> parcelas;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Trabajador> trabajadores;
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
    public static int getCantidadReservas()
    {
        return reservas.size();
    }
    public static void anyadirParcela(Parcela p) {
        parcelas.add(p);
    }
    public static ArrayList<Parcela> getParcelas() {
        return parcelas;
    }
    public static void anyadirCliente(Cliente c){
        clientes.add(c);
    }
    
    public static void anyadirTrabajador(Trabajador t){
        trabajadores.add(t);
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

    public void cargarDatos() throws ParseException, NoSuchAlgorithmException {
        ParcelaDao dao_parcela = new ParcelaDao();
        ReservaDAO dao_reserva = new ReservaDAO();
        ActividadDAO dao_actividad = new ActividadDAO();
        TrabajadorDAO dao_trabajador = new TrabajadorDAO();
        ClienteDAO dao_cliente = new ClienteDAO();
        TiendaDAO dao_tienda = new TiendaDAO();
        ReservaActividadDAO dao_reserva_actividad = new ReservaActividadDAO();
        HistoricoDAO dao_historico = new HistoricoDAO();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
        for(int i=1;i<=dao_parcela.maxId();i++)
        {
            Parcela p = new Parcela(i, i, Boolean.TRUE, i);
            p = dao_parcela.leerParcela(i);
            parcelas.add(p);
        }
        for(int i=1;i<=dao_reserva.maxId();i++)
        {
            Date d = new Date();
            Cliente c = new Cliente("", "", 1);
            Parcela p = new Parcela(1, 1, Boolean.TRUE, 1);
            Reserva r = new Reserva();
            r = dao_reserva.leerReserva(i);
            reservas.add(r);
        }
        for(int i = 1; i <= dao_actividad.maxId();i++)
        {
            
            Actividad a = new Actividad();
            a = dao_actividad.leerActividad(i);
            actividades.add(a);
        }
        for(int i = 1; i <= dao_cliente.maxId();i++)
        {
            Cliente c = new Cliente();
            c = dao_cliente.leerCliente(i);
            clientes.add(c);
        }
        for(int i = 1; i <= dao_trabajador.maxId();i++)
        {
            Trabajador t = new Trabajador();
            t = dao_trabajador.leerTrabajador(i);
            trabajadores.add(t);
        }
        for(int i=1;i<=dao_tienda.maxId();++i)
        {
            Tienda t = new Tienda();
            t = dao_tienda.leerTienda(i);
            tiendas.add(t);
        }

        for(int i=1;i<=dao_reserva_actividad.maxId();++i)
        {
            ReservaActividad ra = new ReservaActividad();
            ra = dao_reserva_actividad.leerReservaActividad(i);
            reservas_actividades.add(ra);
        }
        
        for(int i=1;i<=dao_historico.maxId();++i)
        {
            Historico h = new Historico();
            h = dao_historico.leerHistorico(i);
            historicos.add(h);
        }
    }
}
