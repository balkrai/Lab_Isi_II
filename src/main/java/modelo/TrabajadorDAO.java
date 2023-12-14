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
public class TrabajadorDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    
    private static final String CREATE = 
            "INSERT INTO Usuario (idUsuario,Usuario,Contraseña,Tipo_usuario)" +
            "VALUES (?,?,?,?)";
    
    private static final String READ = 
            "SELECT idUsuario,Usuario,Contraseña,Tipo_usuario " +
            "  FROM usuarios " +
            " WHERE idUsuario = ?";
    
    private static final String UPDATE =
            "UPDATE usuarios " +
            "   SET idUsuario=?,Usuario=?,Contraseña=?,Tipo_usuario=0"+
            " WHERE idUsuario = ?";
    
    private static final String DELETE =
            "DELETE FROM usuarios " +
            " WHERE idUsuario = ?";
    
    public TrabajadorDAO(){}
    
    public int maxId() {
        int res = 0;
        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement("select max(idUsuario) as maximo from usuarios");
            ResultSet rs = read.executeQuery();
             if(rs.next())
                res = rs.getInt("maximo");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void crearTrabajador(Trabajador t)
    {
        try 
        {          
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            PreparedStatement max_id = oracleConn.prepareStatement("select max(idUsuario) as maximo from usuarios");
            ResultSet rs = max_id.executeQuery();
            int id_creacion=0;
            if(rs.next())
                id_creacion=rs.getInt("maximo")+1;
            
            insert.setInt(1, id_creacion);
            insert.setString(2, t.getUsuario());
            insert.setString(3, t.getContrasenya());
            insert.setInt(4, 0);
            
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR TRABAJADOR "+t.getUsuario());
        }  
    }
    
    public Trabajador leerTrabajador(int idUsuario)
    {
        Trabajador t = new Trabajador("", "",idUsuario);
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, idUsuario);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                t.setUsuario(rs.getString(idUsuario));
                t.setContrasenya(rs.getString("Contraseña"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER USUARIO "+idUsuario);
        }
        
        return t;
    }
    
    public void actualizarTrabajador(Trabajador t)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);
            
            update.setInt(1, t.getId());
            update.setString(2, t.getUsuario());
            update.setString(3, t.getContrasenya());

            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR TRABAJADOR "+t.getUsuario());
        }
                
    }
    
    public void borrarTrabajador(int idUsuario)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);

            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idUsuario);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR TRABAJADOR "+idUsuario);
        }
    }
}