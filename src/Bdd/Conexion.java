package Bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private final String Bdd = "jdbc:mysql://Localhost/empresa";
    private final String Usu = "root";
    private final String Clave = "";
    
    private final String Driver = "com.mysql.jdbc.Driver";
    Connection Varcon;

    public Conexion()  {
        
        Varcon = null;
        try {
             Class.forName(Driver);
             Varcon = DriverManager.getConnection(Bdd, Usu, Clave);
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error\n"+ e, "Driver",JOptionPane.ERROR_MESSAGE);
        }catch (SQLException var) {
            JOptionPane.showMessageDialog(null, "Error getconnection\n" + var);
        }
       
    }

    

    
    
    
    
   public Connection Conectar(){
   
       return Varcon;
   }
   
   
   
   public void Desconectar(){
       
       try {
           Varcon.close();
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "No se pudo cerrar" + e);       
       }
       
   }
}
