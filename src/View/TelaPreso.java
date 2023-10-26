package View;

import DAO.PresoDAO;
import entidades.Preso;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TelaPreso extends JFrame {

    private TelaPreso() {

        Cadastro_Guarda_JL = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_cpf = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        lbl_end = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txf_cpf = new javax.swing.JFormattedTextField();
        txf_sentenca = new javax.swing.JTextField();
        txf_foto = new javax.swing.JTextField();
        lbl_end1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lbl_title.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        lbl_title.setText("CADASTRO DE PRESOS");

        lbl_nome.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_nome.setText("NOME:");

        lbl_cpf.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_cpf.setText("CPF:");

        lbl_tel.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_tel.setText("SENTENÇA:");

        txf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nomeActionPerformed(evt);
            }
        });

        lbl_end.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_end.setText("CELA:");

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
        txf_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_cpfActionPerformed(evt);
            }
        });

        txf_sentenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_sentencaActionPerformed(evt);
            }
        });

        txf_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_fotoActionPerformed(evt);
            }
        });

        lbl_end1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        lbl_end1.setText("FOTO:");

        jButton3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jButton3.setText("SELECIONAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout Cadastro_Guarda_JLLayout = new javax.swing.GroupLayout(Cadastro_Guarda_JL);
        Cadastro_Guarda_JL.setLayout(Cadastro_Guarda_JLLayout);
        Cadastro_Guarda_JLLayout.setHorizontalGroup(
            Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                            .addComponent(lbl_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(258, 258, 258))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cadastro_Guarda_JLLayout.createSequentialGroup()
                                            .addComponent(txf_cpf)
                                            .addGap(42, 42, 42)))
                                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                        .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_end, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txf_sentenca, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(111, 111, 111)
                                .addComponent(jButton1))
                            .addGroup(Cadastro_Guarda_JLLayout.createSequentialGroup()
                                .addComponent(lbl_end1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txf_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_sentenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cpf)
                    .addComponent(lbl_end))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_end1)
                    .addComponent(jButton3))
                .addGap(44, 44, 44)
                .addGroup(Cadastro_Guarda_JLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
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
                .addGap(17, 17, 17)
                .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastro_Guarda_JL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           Preso preso = new Preso();
           PresoDAO dao = new PresoDAO();
           
           preso.setNome(txf_nome.getText());
           preso.setCpf(txf_cpf.getText());
           preso.setSentenca(txf_sentenca.getText());
           
           dao.cadastrarpreso(preso);
           
        
       JOptionPane.showConfirmDialog(null,"Preso Cadastrado:\n"+preso.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txf_sentencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_sentencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_sentencaActionPerformed

    private void txf_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_cpfActionPerformed

    private void txf_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_fotoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens","jpg","png","jpeg");
        file.setFileFilter(filter);
        
        int respostDofileChooser = file.showOpenDialog(null);
        
        if(respostDofileChooser == JFileChooser.APPROVE_OPTION){
            File arquivoSelecionado = file.getSelectedFile();
            txf_foto.setText(arquivoSelecionado.getAbsolutePath());
        }
        else{
            JOptionPane.showConfirmDialog(null,"Nada selecionado");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cadastro_Guarda_JL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_cpf;
    private javax.swing.JLabel lbl_end;
    private javax.swing.JLabel lbl_end1;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JFormattedTextField txf_cpf;
    private javax.swing.JTextField txf_foto;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_sentenca;
    // End of variables declaration//GEN-END:variables
}
