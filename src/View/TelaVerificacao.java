package View;

public class TelaVerificacao extends javax.swing.JFrame {

    public TelaVerificacao() {

        initComponents();
    }

    private void initComponents() {

        Telaverificacao = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txfNomeCela = new javax.swing.JTextField();
        lbl_sistema = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nome2 = new javax.swing.JLabel();
        txf_cpf = new javax.swing.JFormattedTextField();
        txfNomeCela1 = new javax.swing.JTextField();
        lbl_nome3 = new javax.swing.JLabel();
        lbl_nome4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txfNomeCela2 = new javax.swing.JTextField();
        txfNomeCela3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(629, 622));

        Telaverificacao.setOpaque(false);
        Telaverificacao.setPreferredSize(new java.awt.Dimension(629, 622));

        lbl_title.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbl_title.setText("VERIFICAÇÃO DE PRESO");
        lbl_title.setBounds(00, 550, 300, 300);

        lbl_nome.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome.setText("NOME :");
        lbl_nome.setBounds(00, 550, 300, 300);

        txfNomeCela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeCelaActionPerformed(evt);
            }
        });

        lbl_sistema.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_sistema.setText("CPF:");

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/image10.png"))); // NOI18N

        lbl_nome2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome2.setText("CELA:");

        try {
            txf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txfNomeCela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeCela1ActionPerformed(evt);
            }
        });

        lbl_nome3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome3.setText("ID:");

        lbl_nome4.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome4.setText("SENTENÇA:");

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton1.setText("VERIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txfNomeCela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeCela2ActionPerformed(evt);
            }
        });

        txfNomeCela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeCela3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton2.setText("VERIFICAR TODOS PRESOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaverificacaoLayout = new javax.swing.GroupLayout(Telaverificacao);
        Telaverificacao.setLayout(TelaverificacaoLayout);
        TelaverificacaoLayout.setHorizontalGroup(
            TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaverificacaoLayout.createSequentialGroup()
                .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaverificacaoLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lbl_title))
                    .addGroup(TelaverificacaoLayout.createSequentialGroup()
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaverificacaoLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lbl_nome3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(txfNomeCela, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TelaverificacaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TelaverificacaoLayout.createSequentialGroup()
                                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_nome)
                                                .addComponent(lbl_sistema, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(lbl_nome4)
                                            .addComponent(lbl_nome2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txf_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                            .addComponent(txfNomeCela1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txfNomeCela2)
                                            .addComponent(txfNomeCela3)))
                                    .addGroup(TelaverificacaoLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton2)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        TelaverificacaoLayout.setVerticalGroup(
            TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaverificacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaverificacaoLayout.createSequentialGroup()
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfNomeCela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome3))
                        .addGap(10, 10, 10)
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(35, 35, 35)
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfNomeCela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sistema)
                            .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nome4)
                            .addComponent(txfNomeCela2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaverificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nome2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNomeCela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/image10.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Telaverificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Telaverificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfNomeCelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeCelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeCelaActionPerformed

    private void txfNomeCela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeCela1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeCela1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfNomeCela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeCela2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeCela2ActionPerformed

    private void txfNomeCela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeCela3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNomeCela3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVerificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVerificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Telaverificacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nome2;
    private javax.swing.JLabel lbl_nome3;
    private javax.swing.JLabel lbl_nome4;
    private javax.swing.JLabel lbl_sistema;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txfNomeCela;
    private javax.swing.JTextField txfNomeCela1;
    private javax.swing.JTextField txfNomeCela2;
    private javax.swing.JTextField txfNomeCela3;
    private javax.swing.JFormattedTextField txf_cpf;
    // End of variables declaration//GEN-END:variables
}
