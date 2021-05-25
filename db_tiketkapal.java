
package UASKelompok5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class db_tiketkapal {
    public static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/db_tiketkapal"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Gagal Koneksi");
          // System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        
        return mysqlconfig;
    }
     

    
}
