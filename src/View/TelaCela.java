package View;

import DAO.CelaDAO;
import entidades.Cela;
import javax.swing.JOptionPane;

public class TelaCela extends javax.swing.JFrame {

    public TelaCela() {
        
        initComponents();
    }

    private void initComponents() {

        Cadastro_Guarda_JL = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        txfNomeCela = new javax.swing.JTextField();
        lbl_sistema = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbl_nome1 = new javax.swing.JLabel();
        lbl_nome2 = new javax.swing.JLabel();
        txf_cpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbl_title.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbl_title.setText("CADASTRO DE CELA");

        lbl_nome.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome.setText("NÚMERO DA CELA :");

        lbl_tel.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N

        txfNomeCela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeCelaActionPerformed(evt);
            }
        });

        lbl_sistema.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_sistema.setText("SENHA :");

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton1.setText("AVALIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton2.setText("CANCELAR");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/image10.png"))); // NOI18N

        lbl_nome1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome1.setText("NOME GUARDA:");

        lbl_nome2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome2.setText("CPF:");

        try {
            txf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout Cadastro_Guarda_JLLayout = new javax.swing.GroupLayout(Cadastro_Guarda_JL);
        Cadastro_Guarda_JL.setLayout(Cadastro_Guarda_JLLayout);
        Cadastro_Guarda_JLLayout.setHorizontalGroup(
            Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(lbl_title))
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(lbl_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfNomeCela, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Cadastro_Guarda_JLLayout.setVerticalGroup(
            Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNomeCela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addGap(27, 27, 27)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sistema)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tel)
                .addGap(18, 18, 18)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/image10.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Cela cela = new Cela();
        CelaDAO celadao = new CelaDAO();
        
        cela.setNome(txfNomeCela.getText());
        
        celadao.cadastrodecela(cela);
        
       JOptionPane.showConfirmDialog(null,"Cela cadastrada: \n"+cela.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfNomeCelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeCelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeCelaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro_Guarda_JL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nome1;
    private javax.swing.JLabel lbl_nome2;
    private javax.swing.JLabel lbl_sistema;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txfNomeCela;
    private javax.swing.JFormattedTextField txf_cpf;
    // End of variables declaration//GEN-END:variables
}
