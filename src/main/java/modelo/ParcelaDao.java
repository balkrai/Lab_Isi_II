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
public class ParcelaDao {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Mu3drr4_1:23_4";
    
    private static final String CREATE = 
            "INSERT INTO Parcela (idParcela,m2,Precio,Luz,idtienda)" +
            "VALUES (?,?,?,?)";
    
    private static final String READ = 
            "SELECT idParcela,m2,Precio,Luz,idtienda " +
            "  FROM Parcela " +
            " WHERE idParcela = ?";
    
    private static final String UPDATE =
            "UPDATE Parcela " +
            "   SET idParcela=?,m2=?,Precio=?,Luz=?,idtienda=?"+
            " WHERE idParcela = ?";
    
    private static final String DELETE =
            "DELETE FROM Parcela " +
            " WHERE idParcela = ?";
    
    public ParcelaDao(){}
    
    public void crearParcela(Parcela p)
    {
        try 
        {          
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            insert.setInt(1, p.getId());
            insert.setInt(2, p.getm2());
            insert.setDouble(3, (double)p.getPrecio());
            insert.setBoolean(4, p.getLuz());
            insert.setInt(5, 1);//falta lo de las tiendas
            
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR PARCELA "+p.getId());
        }  
    }
    
    public Parcela leerParcela(int idParcela)
    {
        Parcela p = new Parcela(idParcela, idParcela, Boolean.TRUE, idParcela);
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, idParcela);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                p.setm2(rs.getInt("m2"));
                p.setLuz(rs.getBoolean("Luz"));
                p.setPrecio((float)rs.getDouble("Precio"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER PARCELA "+idParcela);
        }
        
        return p;
    }
    
    public void actualizarParcela(Parcela p)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);

            update.setInt(1, p.getId());
            update.setInt(2, p.getm2());
            update.setDouble(3, (double)p.getPrecio());
            update.setBoolean(4, p.getLuz());
            update.setInt(5, 1);
            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR Parcela "+p.getId());
        }
                
    }
    
    public void borrarParcela(int idParcela)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);

            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idParcela);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR PARCELA "+idParcela);
        }
    }
}