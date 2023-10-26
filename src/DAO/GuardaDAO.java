/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexao.Conexao;
import entidades.Guarda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
public class GuardaDAO {
    
    public void cadastrarGuarda(Guarda guarda){
        
            String sql = "INSERT INTO guardas (nome,cpf,data_nascimento,telefone,endereco,senha) VALUES (?,?,?,?,?,?)";
            
            PreparedStatement ps = null;
            
        try {
            ps= Conexao.conectar().prepareStatement(sql);
            ps.setString(1, guarda.getNome());
            ps.setString(2,guarda.getCpf());
            ps.setString(3, guarda.getDatanas());
            ps.setString(4, guarda.getTel());
            ps.setString(5, guarda.getEnd());
            ps.setString(6, guarda.getSenha());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
          JOptionPane.showConfirmDialog(null,"Erro ao Salvar"+ex);
        }finally{
            Conexao.desconectar();
        }
        
        
    }
}
