package modelo;

import java.awt.Color;
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
public class ClienteDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "1234";
    
    private static final String CREATE = 
            "INSERT INTO usuarios (idUsuario,Usuario,Contraseña,Tipo_usuario)" +
            "VALUES (?,?,?,?)";
    
    private static final String READ = 
            "SELECT idUsuario,Usuario,Contraseña,Tipo_usuario " +
            "  FROM usuarios " +
            " WHERE idUsuario = ?";
    
    private static final String UPDATE =
            "UPDATE usuarios " +
            "   SET idUsuario=?,Usuario=?,Contraseña=?,Tipo_usuario=1"+
            " WHERE idUsuario = ?";
    
    private static final String DELETE =
            "DELETE FROM usuarios " +
            " WHERE idUsuario = ?";
    
    public ClienteDAO(){}
    
    public int maxId() {
        int res = 0;
        try(Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);) {
            Class.forName(DRIVER).newInstance();
            PreparedStatement read = oracleConn.prepareStatement("select max(idUsuario) as maximo from usuarios");
            ResultSet rs = read.executeQuery();
             if(rs.next())
                res = rs.getInt("maximo");
             
            read.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }


        return res;
    }
    
    
    public void crearCliente(Cliente c)
    {
        try(Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);    ) 
        {          
            Class.forName(DRIVER).newInstance();
            
            oracleConn.setAutoCommit(false);
            
            PreparedStatement max_id = oracleConn.prepareStatement("select max(idCliente) as maximo from usuarios");
            ResultSet rs = max_id.executeQuery();
            int id_creacion=0;
            if(rs.next())
                id_creacion=rs.getInt("maximo")+1;
            
            insert.setInt(1, id_creacion);
            insert.setString(2, c.getUsuario());
            insert.setString(3, c.getContrasenya());
            insert.setInt(4, 1);
            
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR CLiente "+c.getUsuario());
        }  
    }
    
    public Cliente leerCliente(int idUsuario)
    {
        Cliente c = new Cliente("", "",idUsuario);
        Connection oracleConn = null;
        PreparedStatement read = null;
        
        try
        {
            Class.forName(DRIVER).newInstance();
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            read = oracleConn.prepareStatement(READ);
            read.setInt(1, idUsuario);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                c.setUsuario(rs.getString("Usuario"));
                c.setContrasenya(rs.getString("Contraseña"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER USUARIO "+idUsuario);
        }
        finally
        {
            try
            {
                oracleConn.close();
                read.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }     
        }
        
        return c;
    }
    
    public void actualizarCliente(Cliente c)
    {
        Connection oracleConn = null;
        PreparedStatement update = null;
        
        try
        {
            Class.forName(DRIVER).newInstance();
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            update = oracleConn.prepareStatement(UPDATE);
            //borja no estas basado en datos
            update.setInt(1, c.getId());
            update.setString(2, c.getUsuario());
            update.setString(3, c.getContrasenya());

            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR CLIENTE "+c.getUsuario());
        }
        finally
        {
            try
            {
                oracleConn.close();
                update.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }  
        }
    }
    
    public void borrarCliente(int idUsuario)
    {
        Connection oracleConn = null;
        PreparedStatement delete = null;
        
        try
        {
            Class.forName(DRIVER).newInstance();
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);

            delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idUsuario);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR CLIENTE "+idUsuario);
        }
        finally
        {
            try
            {
                oracleConn.close();
                delete.close();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }  
        }
    }
}