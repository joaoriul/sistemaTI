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
public class cadastroEquipamento {
    
    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private String serie;
    
       public cadastroEquipamento(int id, String nome, String marca, String modelo, String serie) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
    }
       

    public cadastroEquipamento(String nome, String marca, String modelo, String serie) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

 
}
