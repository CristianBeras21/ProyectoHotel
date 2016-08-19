
package com.hotel.logica;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cristian beras
 */
public class Conexion {

    String db = "basereserva";
    String url = "jdbc:mysql://127.0.0.1/" + db;
    String user = "root";
    String pass = "";

    public Conexion() {
    }


    public Connection conectar(){
          Connection link=null;
          
          try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link= (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
              JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }


}
