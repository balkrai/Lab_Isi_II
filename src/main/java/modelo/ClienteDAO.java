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
public class ClienteDAO {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Mu3drr4_1:23_4";
    
    private static final String CREATE = 
            "INSERT INTO Usuario (idUsuario,Usuario,Contraseña,Tipo_usuario)" +
            "VALUES (?,?,?,?)";
    
    private static final String READ = 
            "SELECT idUsuario,Usuario,Contraseña,Tipo_usuario " +
            "  FROM Usuario " +
            " WHERE idUsuario = ?";
    
    private static final String UPDATE =
            "UPDATE Usuario " +
            "   SET idUsuario=?,Usuario=?,Contraseña=?,Tipo_usuario=1"+
            " WHERE idUsuario = ?";
    
    private static final String DELETE =
            "DELETE FROM Usuario " +
            " WHERE idUsuario = ?";
    
    public ClienteDAO(){}
    
    public void crearCliente(Cliente c)
    {
        try 
        {          
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            PreparedStatement max_id = oracleConn.prepareStatement("select max(idCliente) as maximo from Usuario");
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
    
    public Cliente leerCliente(String idUsuario)
    {
        Cliente c = new Cliente(idUsuario, "",1);
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setString(1, idUsuario);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                c.setUsuario(rs.getString(idUsuario));
                c.setContrasenya(rs.getString("Contraseña"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER USUARIO "+idUsuario);
        }
        
        return c;
    }
    
    public void actualizarCliente(Cliente c)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);
            //borja no estas basado en datos
            update.setInt(1, 0);//basicamente los clientes no tienen id xd arregladlo
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
                
    }
    
    public void borrarCliente(String usuario)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);

            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setString(1, usuario);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR CLIENTE "+usuario);
        }
    }
}