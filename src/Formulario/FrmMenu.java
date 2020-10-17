package Formulario;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemALta = new javax.swing.JMenuItem();
        itemListado = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        ItemBusca = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemMod = new javax.swing.JMenuItem();
        itemBaja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Trabajadores");

        itemALta.setMnemonic('o');
        itemALta.setText("Ingreso de empleados");
        itemALta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemALtaActionPerformed(evt);
            }
        });
        fileMenu.add(itemALta);

        itemListado.setMnemonic('s');
        itemListado.setText("LIstado de todos los empleados");
        itemListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListadoActionPerformed(evt);
            }
        });
        fileMenu.add(itemListado);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        MenuConsulta.setText("Consultas");

        ItemBusca.setText("Buscar por Nombre o por Legajo");
        ItemBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscaActionPerformed(evt);
            }
        });
        MenuConsulta.add(ItemBusca);

        menuBar.add(MenuConsulta);

        jMenu1.setText("Bajas o Modificaciones");

        itemMod.setText("Modificaciones");
        itemMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModActionPerformed(evt);
            }
        });
        jMenu1.add(itemMod);

        itemBaja.setText("Bajas");
        itemBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaActionPerformed(evt);
            }
        });
        jMenu1.add(itemBaja);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itemALtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemALtaActionPerformed
     FrmAlta objAlta = new FrmAlta();
     this.pnlMenu.add(objAlta);
     objAlta.show();
    }//GEN-LAST:event_itemALtaActionPerformed

    private void itemListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListadoActionPerformed
     FrmListado objLis = new FrmListado();
     this.pnlMenu.add(objLis);
     objLis.show();
    }//GEN-LAST:event_itemListadoActionPerformed

    private void ItemBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscaActionPerformed
        FrmConLegajoNombre  objConLeg= new FrmConLegajoNombre();
        this.pnlMenu.add(objConLeg);
        objConLeg.show();
    }//GEN-LAST:event_ItemBuscaActionPerformed

    private void itemModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModActionPerformed
        FrmModif  ObjM= new FrmModif();
        this.pnlMenu.add(ObjM);
        ObjM.show();
    }//GEN-LAST:event_itemModActionPerformed

    private void itemBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaActionPerformed
       FrmBajas  ObjB= new FrmBajas();
        this.pnlMenu.add(ObjB);
        ObjB.show();
    }//GEN-LAST:event_itemBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemBusca;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemALta;
    private javax.swing.JMenuItem itemBaja;
    private javax.swing.JMenuItem itemListado;
    private javax.swing.JMenuItem itemMod;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JDesktopPane pnlMenu;
    // End of variables declaration//GEN-END:variables

}
