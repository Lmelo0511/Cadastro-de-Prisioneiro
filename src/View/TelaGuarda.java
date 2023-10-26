package View;

import DAO.GuardaDAO;
import entidades.Guarda;
import javax.swing.JOptionPane;

public class TelaGuarda extends javax.swing.JFrame {

    public TelaGuarda() {
        
        initComponents();
    }

    private void initComponents() {

        Cadastro_Guarda_JL = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        lbl_nascimento = new javax.swing.JLabel();
        lbl_sistema = new javax.swing.JLabel();
        txf_end = new javax.swing.JTextField();
        lbl_end = new javax.swing.JLabel();
        jpass_senha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txf_cpf = new javax.swing.JFormattedTextField();
        txf_datanasc = new javax.swing.JFormattedTextField();
        txf_tel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(629, 650));

        lbl_title.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbl_title.setText("CADASTRO DE GUARDAS");

        lbl_nome.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome.setText("NOME:");

        lbl_cpf.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_cpf.setText("CPF:");

        lbl_tel.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_tel.setText("TELEFONE:");

        txf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nomeActionPerformed(evt);
            }
        });

        lbl_nascimento.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nascimento.setText("DATA NASCIMENTO: ");

        lbl_sistema.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_sistema.setText("SISTEMA DE SEGURANÇA:");

        txf_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_endActionPerformed(evt);
            }
        });

        lbl_end.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_end.setText("ENDEREÇO:");

        jpass_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpass_senhaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton1.setText("CONFIRMAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton2.setText("CANCELAR");

        try {
            txf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txf_datanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txf_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout Cadastro_Guarda_JLLayout = new javax.swing.GroupLayout(Cadastro_Guarda_JL);
        Cadastro_Guarda_JL.setLayout(Cadastro_Guarda_JLLayout);
        Cadastro_Guarda_JLLayout.setHorizontalGroup(
            Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                            .addComponent(lbl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(258, 258, 258))
                                        .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                            .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txf_cpf)
                                                .addComponent(txf_datanasc))
                                            .addGap(42, 42, 42)))
                                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                        .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1)
                                    .addComponent(txf_end, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(lbl_end, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpass_senha)
                                    .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_tel))))
                        .addContainerGap(45, Short.MAX_VALUE))))
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbl_title)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Cadastro_Guarda_JLLayout.setVerticalGroup(
            Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_tel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cpf)
                    .addComponent(lbl_end))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nascimento)
                            .addComponent(lbl_sistema))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpass_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txf_datanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addContainerGap())))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ressources/image10.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nomeActionPerformed

    private void txf_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_endActionPerformed

    private void jpass_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpass_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpass_senhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Guarda guarda = new Guarda();
           GuardaDAO dao = new GuardaDAO();
           
           guarda.setNome(txf_nome.getText());
           guarda.setCpf(txf_cpf.getText());
           guarda.setDatanas(txf_datanasc.getText());
           guarda.setTel(txf_tel.getText());
           guarda.setEnd(txf_end.getText());
           guarda.setSenha(String.copyValueOf(jpass_senha.getPassword()));
           
           dao.cadastrarGuarda(guarda);
           
        
       JOptionPane.showConfirmDialog(null,"Guarda Cadastrado:\n"+guarda.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGuarda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro_Guarda_JL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpass_senha;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_end;
    private javax.swing.JLabel lbl_nascimento;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_sistema;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JFormattedTextField txf_cpf;
    private javax.swing.JFormattedTextField txf_datanasc;
    private javax.swing.JTextField txf_end;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JFormattedTextField txf_tel;
    // End of variables declaration//GEN-END:variables
}
