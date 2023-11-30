package modelo;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramon
 */
public class ReservaActividadDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    
    private static final String CREATE = 
            "INSERT INTO reserva_actividad (idActividad,idReserva,Fecha,Hora_inicio,Hora_fin,Finalizada)" +
            "VALUES (?,?,?,?,?,?)";
    
    private static final String READ = 
            "SELECT idActividad,idReserva,Fecha,Hora_inicio,Hora_fin,Finalizada " +
            "  FROM reserva_actividad " +
            " WHERE idReserva = ?";
    
    private static final String UPDATE =
            "UPDATE reserva_actividad " +
            "   SET idActividad=?,idReserva=?,Fecha=?,Hora_inicio=?,Hora_fin=?,Finalizada=?"+
            " WHERE idReserva = ?";
    
    private static final String DELETE =
            "DELETE FROM reserva_actividad " +
            " WHERE idReserva = ?";
    
    public ReservaActividadDAO(){}
    
    public void crearReservaActividad(ReservaActividad reserva)
    {
        try 
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            insert.setInt(1, reserva.getIdActividad());
            insert.setInt(2, reserva.getIdReserva());
            insert.setString(3, sdf.format(reserva.getFecha()));
            insert.setString(4, reserva.getHoraInicio());
            insert.setString(5, reserva.getHoraFin());
            insert.setBoolean(6, reserva.getFinalizada());
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR RESERVA_ACTIVIDAD "+reserva.getIdReserva());
        }  
    }
    
    public ReservaActividad leerReservaActividad(int idReserva)
    {
        ReservaActividad reserva = new ReservaActividad();
        
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            // Sentencia de insert
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(2, idReserva);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                reserva.setIdActividad(rs.getInt("idActividad"));
                reserva.setIdReserva(rs.getInt("idReserva"));
                Date fecha = sdf.parse(rs.getString("Fecha"));
                reserva.setFecha(fecha);
                reserva.setHoraInicio(rs.getString("Hora_inicio"));
                reserva.setHoraFin(rs.getString("Hora_fin"));
                reserva.setFinalizada(rs.getBoolean("Finalizada"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER RESERVA_ACTIVIDAD "+idReserva);
        }
        
        return reserva;
    }
    
    public void actualizarReservaActividad(ReservaActividad reserva)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            // Sentencia de insert
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);

            update.setInt(1, reserva.getIdActividad());
            update.setInt(2, reserva.getIdReserva());
            update.setString(3, sdf.format(reserva.getFecha()));
            update.setString(4, reserva.getHoraInicio());
            update.setString(5, reserva.getHoraFin());
            update.setBoolean(6, reserva.getFinalizada());
            update.setInt(7, reserva.getIdReserva());
            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR RESERVA_ACTIVIDAD "+reserva.getIdReserva());
        }
                
    }
    
    public void borrarReservaActividad(int idReserva)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);

            // Sentencia de borrado
            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(2, idReserva);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR RESERVA_ACTIVIDAD "+idReserva);
        }
    }
}