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
public class TiendaDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Mu3drr4_1:23_4";
    
    private static final String CREATE = 
            "INSERT INTO tienda (id,nombre,m2)" +
            "VALUES (?,?,?)";
    
    private static final String READ = 
            "SELECT idTienda, nombre, m2 " +
            "  FROM tienda " +
            " WHERE idTienda = ?";
    
    private static final String UPDATE =
            "UPDATE tienda " +
            "   SET idTienda = ?, nombre = ?, m2 = ?, " +
            " WHERE idTienda = ?";
    
    private static final String DELETE =
            "DELETE FROM tienda " +
            " WHERE idTienda = ?";
    
    public TiendaDAO(){}
    
    public void crearTienda(Tienda tienda)
    {
        try 
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            insert.setInt(1, tienda.getIdTienda());
            insert.setString(2, tienda.getNombre());
            insert.setInt(3, tienda.getm2());
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR TIENDA "+tienda.getIdTienda());
        }  
    }
    
    public Tienda leerTienda(int idTienda) throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, SQLException
    {
        Tienda tienda = new Tienda();
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            // Sentencia de insert
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, idTienda);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                tienda.setIdTienda(rs.getInt("idTienda"));
                tienda.setNombre(rs.getString("nombre"));
                tienda.setm2(rs.getInt("m2"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER TIENDA "+idTienda);
        }
        
        return tienda;
    }
    
    public void actualizarTienda(Tienda tienda) throws ClassNotFoundException, 
           InstantiationException, IllegalAccessException, SQLException
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            // Sentencia de insert
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);

            update.setInt(1, tienda.getIdTienda());
            update.setString(2, tienda.getNombre());
            update.setInt(3, tienda.getm2());
            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR TIENDA "+tienda.getIdTienda());
        }
                
    }
    
    public void borrarTienda(int idTienda) throws ClassNotFoundException, 
           InstantiationException, IllegalAccessException, SQLException 
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);

            // Sentencia de borrado
            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idTienda);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR TIENDA "+idTienda);
        }
    }
}