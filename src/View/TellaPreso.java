package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class TellaPreso extends JFrame{

    public TellaPreso(){

        setTitle("Ficha para Cadastro de Prisioneiro");
        setVisible(true);
        setSize(629, 622);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.DARK_GRAY);
        
        JLabel titulo = new JLabel("                    Novo Cadastro"); 
        titulo.setBounds(10, 80, 400, 100);
        Font fonte = new Font("Arial", Font.BOLD, 20);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(fonte);

        TextField cadastroNome = new TextField();
        cadastroNome.setBounds(15, 245, 380, 50);
        cadastroNome.setText("Nome: ");

        TextField cadastroIdentificacao = new TextField();
        cadastroIdentificacao.setBounds(15, 315, 380, 50);
        cadastroIdentificacao.setText("Identificação: ");
         
        TextField cadastroCela = new TextField(20);
        cadastroCela.setBounds(15, 385, 380, 50);
        cadastroCela.setText("Número da Cela: ");

        TextField cadastroSentenca = new TextField(20);
        cadastroSentenca.setBounds(15, 455, 380, 50);
        cadastroSentenca.setText("Sentença: ");
        
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(15, 525, 380, 50);
        botaoCadastrar.setBackground(Color.GRAY);
        botaoCadastrar.setForeground(Color.BLACK);


        Border borda = BorderFactory.createLineBorder(Color.WHITE);

        JLabel foto = new JLabel();
        foto.setBounds(413, 35, 180, 180);
        foto.setBorder(borda);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nome = cadastroNome.getText();
                String Cela = cadastroCela.getText();
                String Identificação = cadastroIdentificacao.getText();
                String cadastroSentenca = cadastroSentenca.getText();

                if(Nome.equals("") || Cela.equals("") || Identificação.equals("")){

                    JOptionPane.showMessageDialog(null, "Preencha os campos abaixo!");

                } else {
                    System.out.println("Nome: " + Nome);
                    System.out.println("Identificação: " + Identificação);
                    System.out.println("Cela: " + Cela);
                    System.out.println("Sentença: " + cadastroSentenca);
                    JOptionPane.showMessageDialog(null, "Cadastro com sucesso!");
                
                    // Limpa os campos para fazer um novo cadastro
                    cadastroNome.setText("Nome: ");
                    cadastroIdentificacao.setText("Identificação: ");
                    cadastroCela.setText("Cela: ");
                    cadastroSentenca.setText("Senteça: ");
                }
            }
        });
   
        add(cadastroNome);
        add(cadastroIdentificacao);
        add(cadastroCela);
        add(cadastroSentenca);
        add(botaoCadastrar);
        add(cadastroCela);
        add(titulo);
        add(foto);
    }
}