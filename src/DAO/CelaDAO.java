/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entidades.Cela;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author work-
 */
public class CelaDAO {
    
    public void cadastrodecela(Cela cela){
                        
            String sql = "INSERT INTO cela (nome) VALUES (?)";
            
            PreparedStatement ps = null;
            
        try {
            ps= Conexao.conectar().prepareStatement(sql);
            ps.setString(1, cela.getNome());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showConfirmDialog(null,"Erro ao Salvar"+ex);
        }
        
    }
}
