
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Modificacion {
    /// SE COMPONE DE UNA BUSQUEDA;
    /// MUESTRA DE DATOS (SI SE ENCONTRO) 
    /// 1- PODER MODIFICARLO 
    /// 2- PODER CANCELAR LA MODIFICAION
    
    private int Legajo; 
    private String Nom;
    private double Sdo;
    private boolean Act;
    ////////////////// ESTE SE USA PARA TOMAR LOS DATOS QEU MODIFICO
     public Modificacion(int Legajo, String Nom, double Sdo, boolean Act) {
        this.Legajo = Legajo;
        this.Nom = Nom;
        this.Sdo = Sdo;
        this.Act = Act;
    }
        //////////////////////ESTE SE USA PARA LA BUSQEUDA 
    public Modificacion() {
    }
    
    Conexion ObjCon = new Conexion();
    PreparedStatement ObjPs;
    ResultSet Registro;

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
    
    
      public void Actualizar (int LegajoViejo){
          int Act;
          if (this.isAct()==true) {
              Act = 0;
          } else {
              Act = 1;
          }
          
          String ActSql = "update empleado set NroLeg = '"+this.getLegajo()+"', Nom = '"+this.getNom()+"', Sueldo = '"+this.getSdo()+"', Activo= '"+Act+"' where NroLeg = '"+LegajoViejo+"';";
          
          try {
              
               ObjPs =ObjCon.Conectar().prepareStatement(ActSql);
               int Registro = ObjPs.executeUpdate();
               
               if (Registro>0) {
                   JOptionPane.showMessageDialog(null, "Datos Actualizados");
              }
              
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null,"error de modificacion"+e);
          }
}
    
    
}


  