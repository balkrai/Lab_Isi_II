/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vicen
 */
public class HistoricoDAO 
{
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Mu3drr4_1";
    
    private static final String CREATE = 
            "INSERT INTO Historico (idHistorico,precio,Fecha_inicio,Fecha_fin,idUsuario)" +
            "VALUES (?,?,?,?,?)";
    
    private static final String READ = 
            "SELECT idHistorico, precio, Fecha_inicio, Fecha_fin, idUsuario " +
            "  FROM Historico " +
            " WHERE idHistorico = ?";
    
    private static final String UPDATE =
            "UPDATE Historico " +
            "   SET idHistorico = ?, precio = ?, Fecha_inicio = ?, Fecha_fin = ?, idUsuario = ?" +
            " WHERE idHistorico = ?";
    
    private static final String DELETE =
            "DELETE FROM Historico " +
            " WHERE idHistorico = ?";
    
    public HistoricoDAO(){}
    
    public void crearHistorico(Historico historico)
    {
        try 
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
            oracleConn.setAutoCommit(false);
            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            insert.setInt(1, historico.getId());
            insert.setFloat(2, historico.getPrecio());
            insert.setString(3, sdf.format(historico.getFechaLlegada()));
            insert.setString(4, sdf.format(historico.getFechaSalida()));
            insert.setInt(5, historico.getIdCliente());
            insert.executeUpdate();
        
            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close(); 
            
        } 
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR TIENDA " + historico.getId());
        }  
    }
    
    public Historico leerHistorico(int idHistorico)
    {
        Historico historico = new Historico();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            // Sentencia de insert
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, idHistorico);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                historico.setId(rs.getInt("idReserva"));
                historico.setPrecio(rs.getFloat("precio"));
                Date fecha = sdf.parse(rs.getString("Fecha_inicio"));
                historico.setFechaLlegada(fecha);
                fecha = sdf.parse(rs.getString("Fecha_fin"));
                historico.setFechaSalida(fecha);
                historico.setIdCliente(rs.getInt("idUsuario"));
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL LEER TIENDA "+idHistorico);
        }
        
        return historico;
    }
    
    public void actualizarHistorico(Historico historico)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);
            // Sentencia de insert
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);

            update.setInt(1, historico.getId());
            update.setFloat(2, historico.getPrecio());
            update.setString(3, sdf.format(historico.getFechaLlegada()));
            update.setString(4, sdf.format(historico.getFechaSalida()));
            update.setInt(5, historico.getIdCliente());
            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL ACTUALIZAR TIENDA "+historico.getId());
        }
                
    }
    
    public void borrarTienda(int idHistorico)
    {
        try
        {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,PASSWORD);

            oracleConn.setAutoCommit(false);

            // Sentencia de borrado
            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idHistorico);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR TIENDA "+idHistorico);
        }
    }
}
