
package Formulario;
import Desarrollo.Busqueda;
import javax.swing.JOptionPane;
public class FrmConLegajoNombre extends javax.swing.JInternalFrame {
Busqueda ObjB = new Busqueda();
  
    public FrmConLegajoNombre() {
        initComponents();
        this.PanelNombres.setVisible(false);
        this.PanelPorLegajo.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBusqueda = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbLegajo = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        txtNom = new javax.swing.JTextField();
        txtNroLeg = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PanelPorLegajo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        txtBNombre = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        lblActivo = new javax.swing.JLabel();
        PanelNombres = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaNombre = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 1090, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR POR"));

        GrupoBusqueda.add(rbLegajo);
        rbLegajo.setSelected(true);
        rbLegajo.setText("NUMERO DE LEGAJO");

        GrupoBusqueda.add(rbNombre);
        rbNombre.setText("NOMBRE");

        txtNroLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroLegActionPerformed(evt);
            }
        });
        txtNroLeg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroLegKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbLegajo)
                    .addComponent(rbNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNroLeg, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLegajo)
                    .addComponent(txtNroLeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNombre)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 130));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 853, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1070, 80));

        PanelPorLegajo.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("NUMERO DE LEGAJO:");

        jLabel2.setText("NOMBRE: ");

        jLabel3.setText("SUELDO: ");

        jLabel4.setText("ACTIVO: ");

        lblSueldo.setText(" ");

        javax.swing.GroupLayout PanelPorLegajoLayout = new javax.swing.GroupLayout(PanelPorLegajo);
        PanelPorLegajo.setLayout(PanelPorLegajoLayout);
        PanelPorLegajoLayout.setHorizontalGroup(
            PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPorLegajoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPorLegajoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(lblActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPorLegajoLayout.createSequentialGroup()
                        .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(lblSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanelPorLegajoLayout.setVerticalGroup(
            PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPorLegajoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSueldo))
                .addGap(29, 29, 29)
                .addGroup(PanelPorLegajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblActivo))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(PanelPorLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 340, 270));

        PanelNombres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaNombre);

        PanelNombres.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 270));

        jPanel1.add(PanelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 370, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 1090, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroLegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroLegActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (this.rbNombre.isSelected()) {
            if (this.txtNom.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre");
            } else {
                //CASO 2
                String Nom = this.txtNom.getText();
                
                ObjB.setNom(Nom);
                //ObjB.BuscaxNom();
                this.PanelNombres.setVisible(true);
                this.TablaNombre.setModel(ObjB.MuestroTit());
                this.TablaNombre.setModel(ObjB.BuscaxNom());
             }
           
        } 
        else {
            //CASO 1
            if (this.txtNroLeg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero de Legajo ");
            } 
            else {
               
                    int Leg = Integer.parseInt(this.txtNroLeg.getText());
                    boolean Existe = ObjB.BuscaxLeg(Leg);
                    this.PanelPorLegajo.setVisible(true);
                    
                    if (Existe==true) {
                    this.lblLegajo.setText(String.valueOf(ObjB.getLegajo()));
                    this.lblActivo.setText(String.valueOf(ObjB.isAct()));
                    this.lblSueldo.setText(String.valueOf(ObjB.getSdo()));
                    this.txtBNombre.setText(String.valueOf(ObjB.getNom()));
                    this.txtBNombre.setEditable(false);
                        }
                    else {
                        JOptionPane.showMessageDialog(null, "Nro de legajo inexistente");
                }
                   
                
                
            }
           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNroLegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroLegKeyTyped
        if (this.txtNroLeg.getText().length()>=6) {
            evt.consume();
        } 
    }//GEN-LAST:event_txtNroLegKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBusqueda;
    private javax.swing.JPanel PanelNombres;
    private javax.swing.JPanel PanelPorLegajo;
    private javax.swing.JTable TablaNombre;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActivo;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JRadioButton rbLegajo;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JTextField txtBNombre;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNroLeg;
    // End of variables declaration//GEN-END:variables
}
