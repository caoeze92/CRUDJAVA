package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Bajas {
    
     /// BAJA, SE COMPONE DE UNA BUSQUEDA;
    /// MUESTRA DE DATOS (SI SE ENCONTRO) 
    /// 1- PODER BORRARLO
    /// 2- PODER CANCELAR LA MODIFICAION
    
    private int Legajo;  ///OBLIGATORIO
    private String Nom;  //DATOS A MOSTRAR
    private double Sdo;  //DATOS A MOSTRAR
    private boolean Act; //DATOS A MOSTRAR

    public Bajas() {
        
    }
    
     Conexion ObjCon = new Conexion();
     PreparedStatement ObjPs;
     ResultSet Registro;

    public void setLegajo(int Legajo) {
        this.Legajo = Legajo;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setSdo(double Sdo) {
        this.Sdo = Sdo;
    }

    public void setAct(boolean Act) {
        this.Act = Act;
    }

    public int getLegajo() {
        return Legajo;
    }

    public String getNom() {
        return Nom;
    }

    public double getSdo() {
        return Sdo;
    }

    public boolean isAct() {
        return Act;
    }
 
     
     
      public boolean BuscaxLeg(int Legajo){
        String LegSql = "select NroLeg, Nom, Activo, Sueldo from empleado where NroLeg = '"+ Legajo +"';";
        
        try {
             ObjPs =ObjCon.Conectar().prepareStatement(LegSql);
            
             Registro=ObjPs.executeQuery();  ///// igual al rayo del workbench
            
            ///////////LEE REGISTTRO POR REGISTRO/////////////////
            
            if(Registro.next()){
                 /// ejecuta esto si lo encuentra
                 this.setLegajo(Registro.getInt(1));
                 this.setNom(Registro.getString(2));
                 this.setAct(Registro.getBoolean(3));
                 this.setSdo(Registro.getDouble(4));
                 
                 return true;
            }
            else{
                return false;
            }
                 
        }      
        
        
        catch(SQLException e){
                JOptionPane.showMessageDialog(null,"error"+e);
                return false;
                
        } 
        
      }
      
      
       public void Borrar (int LegajoViejo){
         
          String BajaSql = "delete from empleado where NroLeg = '"+ LegajoViejo +"';";
          try {
              
               ObjPs =ObjCon.Conectar().prepareStatement(BajaSql);
               int Registro = ObjPs.executeUpdate();
               
               if (Registro>0) {
                   JOptionPane.showMessageDialog(null, "Registro eliminado");
              }
              
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null,"error de baja"+e);
          }
       }
}
