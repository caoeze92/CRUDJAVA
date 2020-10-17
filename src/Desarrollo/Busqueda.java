package Desarrollo;
import  Bdd.Conexion;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;



public class Busqueda {
    
    private int Legajo; 
    private String Nom;
    private double Sdo;
    private boolean Act;

    public Busqueda(int Legajo, String Nom, double Sdo, boolean Act) {
        this.Legajo = Legajo;
        this.Nom = Nom;
        this.Sdo = Sdo;
        this.Act = Act;
    }

    public Busqueda() {
    }
    
    Conexion ObjCon = new Conexion();
    PreparedStatement ObjPs;
    ResultSet Registro;
    /*******************************ESTRUCTUIRA DEL DATATABLE***********************************/
    DefaultTableModel ModeloTablaNombre;
    String [] Tit = {"NOMBRE", "NUMERO DE LEGAJO", "SUELDO", "ACTIVO"};
    String [][] Datos = {};
    /*******************************************************************************************/
    
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
    // CASO 2 VA POR METODO SETTER
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setLegajo(int Legajo) {
        this.Legajo = Legajo;
    }

    public void setSdo(double Sdo) {
        this.Sdo = Sdo;
    }

    public void setAct(boolean Act) {
        this.Act = Act;
    }

    //CASO 1 VA POR PARAMETREOS
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
    // CASO 2 VA POR METODO SETTER
    public DefaultTableModel BuscaxNom(){
        String NomSql = "select Nom, NroLeg, Sueldo, Activo from empleado where Nom like '"+ this.getNom() +"';";
        try {
             ObjPs =ObjCon.Conectar().prepareStatement(NomSql);
             Registro=ObjPs.executeQuery();  ///// igual al rayo del workbench
             
             
                while (Registro.next()){
                 /// ejecuta esto si lo encuentra
                 this.setNom(Registro.getString(1));
                 this.setLegajo(Registro.getInt(2));
                 
                 this.setSdo(Registro.getDouble(3));
                 this.setAct(Registro.getBoolean(4));
                 
                  Object [] Fila =  {this.getNom(), this.getLegajo(), this.getSdo(),this.isAct()};
                  ModeloTablaNombre.addRow(Fila);
                  
                 }
                
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error en la busqueda por nombre"+e);
            
        }
       return ModeloTablaNombre;
    }
    public DefaultTableModel MuestroTit (){
         ModeloTablaNombre = new DefaultTableModel (Datos, Tit);
         return ModeloTablaNombre;
    }
  
   
}
