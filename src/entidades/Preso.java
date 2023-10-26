/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Preso {
    private String id;
    private String nome;
    private String cpf;
    private String sentenca ;
    private String Cela;
    
    public int contPreso = 0;

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

    public String getSentenca() {
        return sentenca;
    }

    public void setSentenca(String sentenca) {
        this.sentenca = sentenca;
    }

    public String getCela() {
        return Cela;
    }

    public void setCela(String Cela) {
        this.Cela = Cela;
    }


   public String toString(){
       return "Nome: "+getNome()+"\nCpf: "+getCpf()+"\nSentença:"+getSentenca()+"\nCela:"+getCela()+
               "\nQuantidade de Presos Cadastrado = "+contPreso;
   }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}