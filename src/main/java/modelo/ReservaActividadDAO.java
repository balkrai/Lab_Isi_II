package modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    String inputString = "s3cr37";
    
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
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            hexString.append(String.format("%02x", b & 0xff));
        }
        return hexString.toString();
    }
    
    public int maxId() throws NoSuchAlgorithmException {
        int res = 0;
        try {
            Class.forName(DRIVER).newInstance();
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(inputString.getBytes());
                String hashedPassword = bytesToHex(hash);

                Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, hashedPassword);
                PreparedStatement read = oracleConn.prepareStatement("select max(idReserva) as maximo from reserva_actividad");
                ResultSet rs = read.executeQuery();
                if(rs.next())
                    res = rs.getInt("maximo");
            }
            catch(NoSuchAlgorithmException e){
                e.printStackTrace();
            }
          
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    
    public void crearReservaActividad(ReservaActividad reserva)
    {
        try 
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Class.forName(DRIVER).newInstance();
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(inputString.getBytes());
                String hashedPassword = bytesToHex(hash);
                Connection oracleConn;
                oracleConn = DriverManager.getConnection(DBURL,USERNAME,hashedPassword);
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
            catch(NoSuchAlgorithmException e){
                e.printStackTrace();
            }
        }
        catch (Exception ex) 
        {
            System.out.println("ERROR AL CREAR RESERVA_ACTIVIDAD "+reserva.getIdReserva());
        }  
    }
    
    public ReservaActividad leerReservaActividad(int idReserva)
    {
        ReservaActividad reserva = new ReservaActividad();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            
            Class.forName(DRIVER).newInstance();
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(inputString.getBytes());
                String hashedPassword = bytesToHex(hash);
                Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,hashedPassword);

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
            catch(NoSuchAlgorithmException e){
                e.printStackTrace();
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
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            
            Class.forName(DRIVER).newInstance();
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(inputString.getBytes());
                String hashedPassword = bytesToHex(hash);
                Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,hashedPassword);

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
            catch(NoSuchAlgorithmException e){
                e.printStackTrace();
            }
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
            try{
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                byte[] hash = digest.digest(inputString.getBytes());
                String hashedPassword = bytesToHex(hash);
                Connection oracleConn = DriverManager.getConnection(DBURL,USERNAME,hashedPassword);

                oracleConn.setAutoCommit(false);

                // Sentencia de borrado
                PreparedStatement delete = oracleConn.prepareStatement(DELETE);
                delete.setInt(2, idReserva);
                delete.executeUpdate();

                oracleConn.commit();
                oracleConn.setAutoCommit(true);
                oracleConn.close();
            }
            catch(NoSuchAlgorithmException e){
                e.printStackTrace();
            }
        }
        catch(Exception e)
        {
            System.out.println("ERROR AL BORRAR RESERVA_ACTIVIDAD "+idReserva);
        }
    }
}