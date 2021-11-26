/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.equipamento.TelaAddEquipamento;
import util.connection;
import DAO.EquipamentoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.cadastroEquipamento;
/**
 *
 * @author João Victor Riul
 */
public class cEquipamento {
    
    private TelaAddEquipamento view;

    public cEquipamento(TelaAddEquipamento view) {
        this.view = view;
    }
    
    public void addEquipamento(){
        String nome = view.getTxtEquipamento().getText();
        String marca = view.getTxtMarca().getText();
        String modelo = view.getTxtModelo().getText();
        String serie = view.getTxtSerie().getText();
        
        cadastroEquipamento novoEquipamento = new cadastroEquipamento (nome, marca, modelo, serie);
        try {
            Connection conexao = new connection().getConnection();
            EquipamentoDAO equipamentoDao = new EquipamentoDAO(conexao);
            equipamentoDao.insert(novoEquipamento);
            
            JOptionPane.showMessageDialog(null, "Novo equipamento cadastrado!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
}
