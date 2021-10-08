/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subircifrardes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER01
 */
public class Cifrar extends javax.swing.JFrame {

    /**
     * Creates new form Cifrar
     */
    public Cifrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelCifrar = new javax.swing.JPanel();
        EtiTitulo = new javax.swing.JLabel();
        ClaveTexto = new javax.swing.JTextField();
        BotonClave = new javax.swing.JButton();
        EtiquetaClave = new javax.swing.JLabel();
        EtiquetaArchivo = new javax.swing.JLabel();
        ArchivoTexto = new javax.swing.JTextField();
        BotonArchivo = new javax.swing.JButton();
        BotonCifrar = new javax.swing.JButton();
        EtiAviso1 = new javax.swing.JLabel();
        EtiAviso2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCifrar.setBackground(new java.awt.Color(153, 204, 255));

        EtiTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        EtiTitulo.setForeground(new java.awt.Color(0, 0, 0));
        EtiTitulo.setText("Cifrado");

        ClaveTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveTextoActionPerformed(evt);
            }
        });

        BotonClave.setText("Clave");
        BotonClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClaveActionPerformed(evt);
            }
        });

        EtiquetaClave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EtiquetaClave.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaClave.setText("Clave:");

        EtiquetaArchivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EtiquetaArchivo.setForeground(new java.awt.Color(0, 0, 0));
        EtiquetaArchivo.setText("Archivo: ");

        ArchivoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoTextoActionPerformed(evt);
            }
        });

        BotonArchivo.setText("Seleccionar");
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        BotonCifrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonCifrar.setText("Cifrar");
        BotonCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCifrarActionPerformed(evt);
            }
        });

        jButton1.setText("Ir a Descifrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Inicio");

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCifrarLayout = new javax.swing.GroupLayout(PanelCifrar);
        PanelCifrar.setLayout(PanelCifrarLayout);
        PanelCifrarLayout.setHorizontalGroup(
            PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCifrarLayout.createSequentialGroup()
                .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCifrarLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelCifrarLayout.createSequentialGroup()
                                .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelCifrarLayout.createSequentialGroup()
                                        .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCifrarLayout.createSequentialGroup()
                                                .addComponent(EtiquetaClave)
                                                .addGap(35, 35, 35)
                                                .addComponent(ClaveTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelCifrarLayout.createSequentialGroup()
                                                .addComponent(EtiquetaArchivo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ArchivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonArchivo)
                                            .addComponent(BotonClave)))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))
                            .addGroup(PanelCifrarLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(93, 93, 93)))
                        .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtiAviso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiAviso2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                    .addGroup(PanelCifrarLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(BotonCifrar))
                    .addGroup(PanelCifrarLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(EtiTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCifrarLayout.setVerticalGroup(
            PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCifrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiTitulo)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClaveTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonClave)
                    .addComponent(EtiquetaClave))
                .addGap(18, 18, 18)
                .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaArchivo)
                    .addComponent(ArchivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonArchivo))
                .addGap(18, 18, 18)
                .addComponent(BotonCifrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCifrarLayout.createSequentialGroup()
                        .addComponent(EtiAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCifrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelCifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCifrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClaveTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveTextoActionPerformed
        
        this.ClaveTexto.setEditable(false);
        
        
        if(this.ClaveTexto.getText().length() != 8){
            
            JOptionPane panel = new JOptionPane();
            panel.setVisible(true);
            
        }        
        
        
    }//GEN-LAST:event_ClaveTextoActionPerformed

    SecretKey clave;
    String claves;
    
    private void BotonClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClaveActionPerformed

        CifrarClase cl = new CifrarClase();
        try {
             clave = cl.llave();
             claves = cl.convertSecretKeyToString(clave);
             System.out.println(clave);
             ClaveTexto.setText(claves);
             this.ClaveTexto.setEditable(false);
        } catch (Exception ex) {
            Logger.getLogger(Cifrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonClaveActionPerformed

    boolean ingreso=false;
    SecretKey claveCifrado;
    boolean accion;
    String rutaTexto;
    
    private void BotonCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCifrarActionPerformed
        // TODO add your handling code here:
        
        
        CifrarClase cifrando = new CifrarClase();
        try {
            
            if(ingreso = true){
                 claveCifrado= cifrando.convertStringToSecretKeyto(this.ClaveTexto.getText());
                 claves = this.ClaveTexto.getText();
            }else if(ingreso == false){
                 claveCifrado = clave;   
            }
            
            if(claveCifrado != null){
                System.out.println(claveCifrado);
                rutaTexto = this.ArchivoTexto.getText();
                accion = cifrando.CifrarArch(claveCifrado, rutaTexto);
                System.out.println(accion);
                
                if (accion == true){
                    
                    JOptionPane.showMessageDialog(null,"Tu archivo fue Cifrado con exito");
                    
                    EtiAviso1.setText("Archivo cifrado exitosamente");
                    EtiAviso1.setText("Tu clave es: " + claves);
             
                }else{
                     EtiAviso1.setText("Archivo cifrado sin exito");
                     EtiAviso2.setText("Revisar la clave");
            } 
            }else{
                EtiAviso1.setText("Archivo cifrado sin exito"); 
                EtiAviso2.setText("Revisar la clave");
            }
           
           
        } catch (Exception ex) {
            Logger.getLogger(Cifrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
 
    }//GEN-LAST:event_BotonCifrarActionPerformed

    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        // TODO add your handling code here:
        
        CifrarClase cifrando = new CifrarClase();
        rutaTexto = cifrando.SubirArchivo();
        ArchivoTexto.setText(rutaTexto);
        
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void ArchivoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArchivoTextoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        Descifrar VDescifrar = new Descifrar();
        VDescifrar.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArchivoTexto;
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton BotonCifrar;
    private javax.swing.JButton BotonClave;
    private javax.swing.JTextField ClaveTexto;
    private javax.swing.JLabel EtiAviso1;
    private javax.swing.JLabel EtiAviso2;
    private javax.swing.JLabel EtiTitulo;
    private javax.swing.JLabel EtiquetaArchivo;
    private javax.swing.JLabel EtiquetaClave;
    private javax.swing.JPanel PanelCifrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}