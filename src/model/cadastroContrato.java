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
public class cadastroContrato {
    
    private int id;
    private String empresa;
    private String tipo;
    private String duracao;
    private String valor;
    private String obs;

    public cadastroContrato(int id, String empresa, String tipo, String duracao, String valor, String obs) {
        this.id = id;
        this.empresa = empresa;
        this.tipo = tipo;
        this.duracao = duracao;
        this.valor = valor;
        this.obs = obs;
    }
     public cadastroContrato(String empresa, String tipo, String duracao, String valor, String obs) {
        this.empresa = empresa;
        this.tipo = tipo;
        this.duracao = duracao;
        this.valor = valor;
        this.obs = obs;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
