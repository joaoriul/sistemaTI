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
public class cadastroFornecedor {
    
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String ramo;
    private String contato;

    public cadastroFornecedor(int id, String nome, String cnpj, String endereco, String ramo, String contato) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ramo = ramo;
        this.contato = contato;
    }
     public cadastroFornecedor(String nome, String cnpj, String endereco, String ramo, String contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ramo = ramo;
        this.contato = contato;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
        }
}