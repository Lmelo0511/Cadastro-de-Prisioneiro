/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Guarda {
    private int id;
    private String nome;
    private String cpf;
    private String datanas;
    private String tel;
    private String end;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanas() {
        return datanas;
    }

    public void setDatanas(String datanas) {
        this.datanas = datanas;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int contGuarda = 0;
    
   public String toString(){
       return "Nome: "+nome+"\nCpf: "+cpf+"\nData de nascimento: "+datanas+"\ntelefone: "+tel+"\nendereço: "+end+"\nsenha: ok"+senha
               + "\nQuantidade de Guardas cadastrado = "+contGuarda;
   }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}