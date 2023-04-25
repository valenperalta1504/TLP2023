/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author PC09
 */
public class conexion {

    Connection conectar = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/peralta_y_martinez", "root", null);
            JOptionPane.showMessageDialog(null, "Conexión exitosa", "conexion", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Sin conexión", "conexión", JOptionPane.ERROR_MESSAGE);

        }
        return conectar;
    }
}
