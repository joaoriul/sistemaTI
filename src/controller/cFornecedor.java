/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.fornecedor.TelaAddFornecedor;
import util.connection;
import DAO.FornecedorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.cadastroFornecedor;
/**
 *
 * @author João Victor Riul
 */
public class cFornecedor {
    
    private TelaAddFornecedor view;

    public cFornecedor(TelaAddFornecedor view) {
        this.view = view;
    }
    
    public void addFornecedor(){
        String nome = view.getTxtNome().getText();
        String cnpj = view.getTxtCNPJ().getText();
        String endereco = view.getTxtEndereco().getText();
        String ramo = view.getTxtRamo().getText();
        String contato = view.getTxtContato().getText();
        
        cadastroFornecedor novoFornecedor = new cadastroFornecedor (nome, cnpj, endereco, ramo, contato);
        try {
            Connection conexao = new connection().getConnection();
            FornecedorDAO FornecedorDAO = new FornecedorDAO(conexao);
            FornecedorDAO.insert(novoFornecedor);
            
            JOptionPane.showMessageDialog(null, "Novo Fornecedor cadastrado!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
}
