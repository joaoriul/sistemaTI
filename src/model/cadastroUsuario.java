/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author João Victor Riul
 */
public class cadastroUsuario {
    
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String empresa;
    private String setor;

    public cadastroUsuario(int id, String nome, String cpf, String telefone, String empresa, String setor) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.empresa = empresa;
        this.setor = setor;
    }

    public cadastroUsuario(String nome, String cpf, String telefone, String empresa, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.empresa = empresa;
        this.setor = setor;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
}
