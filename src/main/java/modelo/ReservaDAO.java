/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

/**
 *
 * @author vicen
 */
public class ReservaDAO {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost/isibdii?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "s3cr37";

    private static final String CREATE
            = "INSERT INTO isibdii.Reserva (idReserva,Fecha_inicio,Fecha_fin,idCliente,idParcela)"
            + "VALUES (?,?,?,?,?)";

    private static final String READ
            = "SELECT idReserva, Fecha_inicio, Fecha_fin, idCliente, idParcela "
            + "  FROM isibdii.Reserva "
            + " WHERE idReserva = ?";

    private static final String UPDATE
            = "UPDATE isibdii.Reserva "
            + "   SET idReserva = ?, Fecha_inicio = ?, Fecha_fin = ?, idCliente = ?, idParcela = ? "
            + " WHERE idReserva = ?";

    private static final String DELETE
            = "DELETE FROM Reserva "
            + " WHERE idReserva = ?";
    
    public ReservaDAO() {
        try
        {
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            m.update(PASSWORD.getBytes());
            byte[] hash = m.digest(PASSWORD.getBytes());
            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for(byte b : hash){
                hexString.append(String.format("%02x", b & 0xff));
            }
            String PASSWORD = hexString.toString();
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
    }

    public int maxId() {
        int res = 0;
        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            PreparedStatement read = oracleConn.prepareStatement("select max(idReserva) as maximo from reserva");
            ResultSet rs = read.executeQuery();
            if(rs.next())
                res = rs.getInt("maximo");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void crearReserva(Reserva reserva) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
            Class.forName(DRIVER).newInstance();
            Connection oracleConn;
            oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            oracleConn.setAutoCommit(false);
            System.out.println("modelo.ReservaDAO.crearReserva()" +sdf.format(reserva.getFechaInicio()) );
            System.out.println("modelo.ReservaDAO.crearReserva()" +sdf.format(reserva.getFechaFin()) );

            PreparedStatement insert = oracleConn.prepareStatement(CREATE);
            insert.setInt(1, reserva.getId());
            insert.setString(2, sdf.format(reserva.getFechaInicio()));
            insert.setString(3, sdf.format(reserva.getFechaFin()));
            insert.setInt(4, reserva.getIdCliente());
            insert.setInt(5, reserva.getIdParcela());
            insert.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Reserva leerReserva(int idReserva) {
        Reserva reserva = new Reserva();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);

            // Sentencia de insert
            PreparedStatement read = oracleConn.prepareStatement(READ);
            read.setInt(1, idReserva);
            ResultSet rs = read.executeQuery();

            if (rs.next()) {
                reserva.setId(rs.getInt("idReserva"));
                Date fecha = sdf.parse(rs.getString("Fecha_inicio"));
                reserva.setFechaInicio(fecha);
                fecha = sdf.parse(rs.getString("Fecha_fin"));
                reserva.setFechaFin(fecha);
                reserva.setIdCliente(rs.getInt("idCliente"));
                reserva.setIdParcela(rs.getInt("idParcela"));
            }
        } catch (Exception e) {
            System.out.println("ERROR AL LEER TIENDA " + idReserva);
        }

        return reserva;
    }

    public void actualizarTienda(Reserva reserva) {
        SimpleDateFormat sdf = new SimpleDateFormat("YYY-MM-DD");

        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            reserva.setIdCliente(1);
            oracleConn.setAutoCommit(false);
            // Sentencia de insert
            PreparedStatement update = oracleConn.prepareStatement(UPDATE);

            update.setInt(1, reserva.getId());
            update.setString(2, sdf.format(reserva.getFechaInicio()));
            update.setString(3, sdf.format(reserva.getFechaFin()));
            update.setInt(4, reserva.getIdCliente());
            update.setInt(5, reserva.getIdParcela());
            update.setInt(6, reserva.getId());

            update.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
        

    }   catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarTienda(int idReserva) {
        try {
            Class.forName(DRIVER).newInstance();
            Connection oracleConn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);

            oracleConn.setAutoCommit(false);

            // Sentencia de borrado
            PreparedStatement delete = oracleConn.prepareStatement(DELETE);
            delete.setInt(1, idReserva);
            delete.executeUpdate();

            oracleConn.commit();
            oracleConn.setAutoCommit(true);
            oracleConn.close();
         }   catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
