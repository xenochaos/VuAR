/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.explorer;

import java.awt.Color;

public class GUI extends javax.swing.JFrame {

    Color turquoise = new Color(149, 181, 208);
    Color violet = new Color(175, 129, 201);
    public GUI() {
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

        oracleConnect = new javax.swing.JPanel();
        profilsLabel = new javax.swing.JLabel();
        profilsComboBox = new javax.swing.JComboBox();
        profilsAdd = new javax.swing.JButton();
        profilsEdit = new javax.swing.JButton();
        profilsDelete = new javax.swing.JButton();
        profilsIp = new javax.swing.JLabel();
        profilsPorts = new javax.swing.JLabel();
        profilsDbNosaukums = new javax.swing.JLabel();
        profilsLietotajs = new javax.swing.JLabel();
        profilsPath = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oracleConnect.setBackground(new java.awt.Color(242, 202, 126));
        oracleConnect.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        oracleConnect.setMaximumSize(new java.awt.Dimension(435, 136));
        oracleConnect.setPreferredSize(new java.awt.Dimension(435, 136));

        profilsLabel.setText("Profils:");
        profilsLabel.setMaximumSize(new java.awt.Dimension(200, 200));
        profilsLabel.setMinimumSize(new java.awt.Dimension(0, 0));

        profilsComboBox.setBackground(new java.awt.Color(175, 129, 201));
        profilsComboBox.setForeground(new java.awt.Color(255, 51, 51));
        profilsComboBox.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsComboBox.setOpaque(false);
        profilsComboBox.setPreferredSize(new java.awt.Dimension(275, 25));
        profilsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilsComboBoxActionPerformed(evt);
            }
        });

        profilsAdd.setBackground(new java.awt.Color(149, 181, 208));
        profilsAdd.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsAdd.setPreferredSize(new java.awt.Dimension(25, 25));
        profilsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilsAddActionPerformed(evt);
            }
        });

        profilsEdit.setBackground(new java.awt.Color(149, 181, 208));
        profilsEdit.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsEdit.setPreferredSize(new java.awt.Dimension(25, 25));
        profilsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilsEditActionPerformed(evt);
            }
        });

        profilsDelete.setBackground(new java.awt.Color(149, 181, 208));
        profilsDelete.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsDelete.setPreferredSize(new java.awt.Dimension(25, 25));
        profilsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilsDeleteActionPerformed(evt);
            }
        });

        profilsIp.setBackground(new java.awt.Color(255, 204, 0));
        profilsIp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilsIp.setText("IP: ");
        profilsIp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        profilsIp.setMaximumSize(new java.awt.Dimension(200, 20));
        profilsIp.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsIp.setPreferredSize(new java.awt.Dimension(200, 20));

        profilsPorts.setBackground(new java.awt.Color(255, 153, 51));
        profilsPorts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilsPorts.setText("Ports:");
        profilsPorts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        profilsPorts.setMaximumSize(new java.awt.Dimension(200, 20));
        profilsPorts.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsPorts.setPreferredSize(new java.awt.Dimension(200, 20));

        profilsDbNosaukums.setBackground(new java.awt.Color(255, 204, 0));
        profilsDbNosaukums.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilsDbNosaukums.setText("DB:");
        profilsDbNosaukums.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        profilsDbNosaukums.setMaximumSize(new java.awt.Dimension(200, 20));
        profilsDbNosaukums.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsDbNosaukums.setPreferredSize(new java.awt.Dimension(200, 20));

        profilsLietotajs.setBackground(new java.awt.Color(255, 204, 0));
        profilsLietotajs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilsLietotajs.setText("Lietotājs:");
        profilsLietotajs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        profilsLietotajs.setMaximumSize(new java.awt.Dimension(200, 20));
        profilsLietotajs.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsLietotajs.setPreferredSize(new java.awt.Dimension(200, 20));

        profilsPath.setBackground(new java.awt.Color(255, 204, 0));
        profilsPath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilsPath.setText("Direktorija:");
        profilsPath.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        profilsPath.setMinimumSize(new java.awt.Dimension(0, 0));
        profilsPath.setPreferredSize(new java.awt.Dimension(405, 20));

        jButton1.setBackground(this.turquoise);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout oracleConnectLayout = new javax.swing.GroupLayout(oracleConnect);
        oracleConnect.setLayout(oracleConnectLayout);
        oracleConnectLayout.setHorizontalGroup(
            oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oracleConnectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oracleConnectLayout.createSequentialGroup()
                        .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profilsIp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profilsDbNosaukums, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profilsLietotajs, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(profilsPorts, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oracleConnectLayout.createSequentialGroup()
                        .addComponent(profilsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilsComboBox, 0, 591, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oracleConnectLayout.createSequentialGroup()
                        .addComponent(profilsPath, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        oracleConnectLayout.setVerticalGroup(
            oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oracleConnectLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profilsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(profilsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profilsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(profilsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profilsPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilsIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profilsDbNosaukums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilsLietotajs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(oracleConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profilsPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oracleConnect, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oracleConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilsComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_profilsComboBoxActionPerformed

    private void profilsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilsAddActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_profilsAddActionPerformed

    private void profilsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilsEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilsEditActionPerformed

    private void profilsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilsDeleteActionPerformed

    }//GEN-LAST:event_profilsDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel oracleConnect;
    private javax.swing.JButton profilsAdd;
    private javax.swing.JComboBox profilsComboBox;
    private javax.swing.JLabel profilsDbNosaukums;
    private javax.swing.JButton profilsDelete;
    private javax.swing.JButton profilsEdit;
    private javax.swing.JLabel profilsIp;
    private javax.swing.JLabel profilsLabel;
    private javax.swing.JLabel profilsLietotajs;
    private javax.swing.JLabel profilsPath;
    private javax.swing.JLabel profilsPorts;
    // End of variables declaration//GEN-END:variables
}
