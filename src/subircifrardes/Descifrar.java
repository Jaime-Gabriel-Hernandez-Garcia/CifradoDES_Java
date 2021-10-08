/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subircifrardes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;

/**
 *
 * @author ACER01
 */
public class Descifrar extends javax.swing.JFrame {

    /**
     * Creates new form Descifrar
     */
    public Descifrar() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelCifrado = new javax.swing.JPanel();
        EtiTitulo = new javax.swing.JLabel();
        EtiClave = new javax.swing.JLabel();
        ClaveTexto = new javax.swing.JTextField();
        EtiArchivo = new javax.swing.JLabel();
        ArchivoTexto = new javax.swing.JTextField();
        BotonArchivo = new javax.swing.JButton();
        BotonDescifrar = new javax.swing.JButton();
        EtiAviso1 = new javax.swing.JLabel();
        EtiAviso2 = new javax.swing.JLabel();
        BotonIrCifrar = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCifrado.setBackground(new java.awt.Color(153, 204, 255));
        PanelCifrado.setForeground(new java.awt.Color(153, 204, 255));

        EtiTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        EtiTitulo.setForeground(new java.awt.Color(0, 0, 0));
        EtiTitulo.setText("Descifrar");

        EtiClave.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EtiClave.setForeground(new java.awt.Color(0, 0, 0));
        EtiClave.setText("Clave: ");

        EtiArchivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EtiArchivo.setForeground(new java.awt.Color(0, 0, 0));
        EtiArchivo.setText("Archivo:");

        BotonArchivo.setText("Seleccionar");
        BotonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonArchivoActionPerformed(evt);
            }
        });

        BotonDescifrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonDescifrar.setText("Descifrar");
        BotonDescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDescifrarActionPerformed(evt);
            }
        });

        BotonIrCifrar.setText("Ir a Cifrado");
        BotonIrCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIrCifrarActionPerformed(evt);
            }
        });

        BotonInicio.setText("Inicio");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCifradoLayout = new javax.swing.GroupLayout(PanelCifrado);
        PanelCifrado.setLayout(PanelCifradoLayout);
        PanelCifradoLayout.setHorizontalGroup(
            PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCifradoLayout.createSequentialGroup()
                .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCifradoLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BotonDescifrar))
                    .addGroup(PanelCifradoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiArchivo)
                            .addComponent(EtiClave)
                            .addComponent(BotonInicio))
                        .addGap(18, 18, 18)
                        .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClaveTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCifradoLayout.createSequentialGroup()
                                .addComponent(ArchivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonArchivo))
                            .addGroup(PanelCifradoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EtiAviso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EtiAviso2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(BotonIrCifrar))))
                    .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelCifradoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCifradoLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCifradoLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(EtiTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCifradoLayout.setVerticalGroup(
            PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCifradoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiClave)
                    .addComponent(ClaveTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiArchivo)
                    .addComponent(ArchivoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonArchivo))
                .addGap(18, 18, 18)
                .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCifradoLayout.createSequentialGroup()
                        .addComponent(BotonDescifrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCifradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelCifradoLayout.createSequentialGroup()
                                .addComponent(EtiAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EtiAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonInicio)))
                    .addComponent(BotonIrCifrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCifrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCifrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String rutaArchivo;
    
    private void BotonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonArchivoActionPerformed
        
        CifrarClase d = new CifrarClase();
        rutaArchivo = d.SubirArchivo();
        ArchivoTexto.setText(rutaArchivo);
        
    }//GEN-LAST:event_BotonArchivoActionPerformed

    private void BotonDescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDescifrarActionPerformed
        
        boolean jalo = true;
        try {
            String keys = this.ClaveTexto.getText();
            DescifrarClase d = new DescifrarClase();
            SecretKey keyf = d.convertStringToSecretKeyto(keys);

            if (keyf != null) {
                rutaArchivo = this.ArchivoTexto.getText();
                System.out.println(keyf);
                jalo = d.Descifrararch(keyf, rutaArchivo);
                if (jalo == true) {
                    EtiAviso1.setText("Archivo descifrado exitosamente");
                    EtiAviso2.setText("");
                    

                } else {
                    EtiAviso1.setText("Archivo cifrado sin exito");
                    EtiAviso2.setText("Revisar la clavea");

                }
            } else {
                EtiAviso1.setText("Archivo cifrado sin exito");
                EtiAviso2.setText("Revisar la claves");
            }

        } catch (Exception ex) {
            Logger.getLogger(Descifrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonDescifrarActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        
        Principal VPrincipal = new Principal();
        VPrincipal.setVisible(true);
        
        
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonIrCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIrCifrarActionPerformed
        
        Cifrar VCifrar = new Cifrar();
        VCifrar.setVisible(true);
        
        
    }//GEN-LAST:event_BotonIrCifrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/looEtiTitulol/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descifrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descifrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArchivoTexto;
    private javax.swing.JButton BotonArchivo;
    private javax.swing.JButton BotonDescifrar;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonIrCifrar;
    private javax.swing.JTextField ClaveTexto;
    private javax.swing.JLabel EtiArchivo;
    private javax.swing.JLabel EtiAviso1;
    private javax.swing.JLabel EtiAviso2;
    private javax.swing.JLabel EtiClave;
    private javax.swing.JLabel EtiTitulo;
    private javax.swing.JPanel PanelCifrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}