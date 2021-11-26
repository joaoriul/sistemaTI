/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.contrato.TelaAddContrato;
import util.connection;
import DAO.ContratoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.cadastroContrato;
/**
 *
 * @author João Victor Riul
 */
public class cContrato {
    
    private TelaAddContrato view;

    public cContrato(TelaAddContrato view) {
        this.view = view;
    }
    
    public void addContrato(){
        String empresa = view.getTxtEmpresa().getText();
        String tipo = view.getTxtTipo().getText();
        String duracao = view.getTxtDuracao().getText();
        String valor = view.getTxtValor().getText();
        String obs = view.getTxtObservacao().getText();
        
        cadastroContrato novoContrato = new cadastroContrato (empresa, tipo, duracao, valor, obs);
        try {
            Connection conexao = new connection().getConnection();
            ContratoDAO contratoDAO = new ContratoDAO(conexao);
            contratoDAO.insert(novoContrato);
            
            JOptionPane.showMessageDialog(null, "Novo contrato cadastrado!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddContrato.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
}
