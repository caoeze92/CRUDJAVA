package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Trabajadores {
    
    private String Nom;
    private int NroLeg;
    private boolean Activo;
    private double Sueldo;
    
    Conexion ObjCon = new Conexion();
    PreparedStatement z;
    ResultSet Registro;
    private String alta= "INSERT INTO empleado (NroLeg, Nom, Sueldo, Activo) VALUES (?,?,?,?);";
    private String Consulta = "select Nom, NroLeg, Sueldo, Activo from empleado;";
    
    
    
    /***********************  DATOS DEL DATA TABLE   *****//////
    DefaultTableModel objT;
    private final String [] Tit = {"Nombre","Sueldo","N° Legajo", "Activo"};
    private String [][] Datos = {};
    /*****************************************************//////
    ///////////////////////CONSTRUCTOR CON PARAMETROS PARA TOMAR DATOS/////////////
    public Trabajadores(String Nom, int NroLeg, boolean Activo, double Sueldo) {
        this.Nom = Nom;
        this.NroLeg = NroLeg;
        this.Activo = Activo;
        this.Sueldo = Sueldo;
    }

   
    ///////////////////////CONSTRUCTOR SIN PARAMAETROS PARA EL DATA TABLE/////////////////
    public Trabajadores(){
        
    }

    public String getNom() {
        return Nom;
    }

    public int getNroLeg() {
        return NroLeg;
    }

    public boolean isActivo() {
        return Activo;
    }

    public double getSueldo() {
        return Sueldo;
    }
    
    
     private void setNom(String Nom) {
        this.Nom = Nom;
    }

    private void setNroLeg(int NroLeg) {
        this.NroLeg = NroLeg;
    }

    private void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    private void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
     
    
    public void Insert() {
        try {
            z = ObjCon.Conectar().prepareStatement(alta);///// ALTA DE DATO
            z.setInt(1, this.getNroLeg());
            z.setString(2, this.getNom());
            z.setDouble(3, this.getSueldo());
            z.setBoolean(4, this.isActivo());
            
            int m = z.executeUpdate();
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de Insert \n"+e, "Altas", JOptionPane.ERROR_MESSAGE);
        }
         
    }
    
    public DefaultTableModel Titulos(){
         objT = new DefaultTableModel(Datos, Tit);
         return objT;
    }
    
    
    public DefaultTableModel MostrarDatos(){
        try {
            z =ObjCon.Conectar().prepareStatement(Consulta);
            Registro =z.executeQuery();  ///// igual al rayo del workbench
            
            ///////////LEE REGISTTRO POR REGISTRO/////////////////
            
            while(Registro.next()){
                 
                 
                 this.setNom(Registro.getString(1));
                 this.setNroLeg(Registro.getInt(2));
                 this.setSueldo(Registro.getDouble(3));
                 this.setActivo(Registro.getBoolean(4));
                 
                 
                 
                 ///////////SOLO PARA EL DATA TABLE////////////////////
                 Object [] VectorDatos = {this.getNom(), this.getSueldo(),this.getNroLeg(), this.isActivo()};
                 objT.addRow(VectorDatos);
                 /////////////////////////////////////////////////////
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los datos ", "error", JOptionPane.ERROR_MESSAGE);
        }
        
        
       
        return objT;
    }
}
