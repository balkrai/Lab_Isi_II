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
public class ActividadDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    
    private static final String CREATE = 
            "INSERT INTO Usuario (id,tipo,fecha,horaInicio,horaFin,finalizada)" +
            "VALUES (?,?,?,?,?,?)";
    
    private static final String READ = 
            "SELECT id,tipo,fecha,horaInicio,horaFin,finalizada,participantes " +
            "  FROM Actividad " +
            " WHERE id = ?";
    
    private static final String UPDATE =
            "UPDATE Actividad " +
            "   SET id=?,tipo=?,fecha=?,horaInicio=?,horaFin=?,finalizada=?,participantes=?"+
            " WHERE id = ?";
    
    private static final String DELETE =
            "DELETE FROM Actividad " +
            " WHERE id = ?";
    
    public ActividadDAO(){}
    
    public int maxId() {
        int res = 0;
        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement("select max(idActividad) as maximo from Actividad");
            ResultSet rs = read.executeQuery();
            if(rs.next())
                res = rs.getInt("maximo");
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void crearActividad(Actividad a)
    {
        try 
        {   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");       
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            
            insert.setInt(1, a.getId());
            insert.setString(2, a.getTipo());
            insert.setString(3, sdf.format(a.getFecha()));
            insert.setString(4, a.getHoraInicio());
            insert.setString(5, a.getHoraFin());
            insert.setBoolean(6, a.getFinalizada());
            //insert.setArray(7, a.getParticipantes());
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR ACTIVIDAD "+a.getId());
        }  
    }
    
    public Actividad leerActividad(int id)
    {
        
        Actividad a = new Actividad();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, id);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                a.setId(rs.getInt("id"));
                a.setTipo(rs.getString("tipo"));
                a.setFecha(sdf.format(rs.getString("fecha")));
                a.setHoraInicio(rs.getString("horaInicio"));
                a.setHoraFin(rs.getString("horaFin"));
                a.setFinalizada(rs.getBoolean("finalizada"));
                //a.setParticipantes(rs.getArray("participantes"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER ACTIVIDAD "+id);
        }
        
        return a;
    }
    
    public void actualizarActividad(Actividad a)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);
            update.setInt(1, a.getId());
            update.setString(2, a.getTipo());
            update.setString(3, sdf.format(a.getFecha()));
            update.setString(4, a.getHoraInicio());
            update.setString(5, a.getHoraFin());
            update.setBoolean(6, a.getFinalizada());

            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR ACTIVIDAD "+a.getId());
        }
                
    }
    
    public void borrarActividad(int id)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);

            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, id);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR ACTIVIDAD "+id);
        }
    }
}