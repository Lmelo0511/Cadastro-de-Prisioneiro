/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import conexao.Conexao;
import entidades.Preso;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author work-
 */
public class PresoDAO {
    public void cadastrarpreso(Preso preso){
                
            String sql = "INSERT INTO preso (nome, cpf, sentenca, cela) VALUES (?,?,?,?)";
            
            PreparedStatement ps = null;
            
        try {
            ps= Conexao.conectar().prepareStatement(sql);
            ps.setString(1, preso.getNome());
            ps.setString(2,preso.getCpf());
            ps.setString(3, preso.getSentenca());
            ps.setString(4, preso.getCela());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
          JOptionPane.showConfirmDialog(null,"Erro ao Salvar"+ex);
        }
        
    }
    
    public List<Preso> read(){
        Conexao.conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String urlp = "SELECT * FROM Presos";
        
        List<Preso> presos = new ArrayList<>();
        
        try {
            ps= Conexao.conectar().prepareStatement(urlp);
            ps.executeQuery();
            
            while(rs.next()){
                Preso preso  = new Preso();
                preso.setId(rs.getString("id"));
                preso.setNome(rs.getString("nome"));
                preso.setCpf(rs.getString("cpf"));
                preso.setSentenca(rs.getString("sentenca"));
                preso.setCela(rs.getString("cela"));
                presos.add(preso);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JOptionPane.showInputDialog(ex));
        }finally{
            Conexao.desconectar();
            try {
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null,"Erro ao fechar Statement"+ex);
            }
            try {
                rs.close();
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null,"Erro ao fechar Result"+ex);
            }
        }
        return presos;
    }
}
