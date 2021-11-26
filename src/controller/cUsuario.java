/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import view.usuario.TelaAddUsuario;
import util.connection;
import DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.cadastroUsuario;


/**
 *
 * @author João Victor Riul
 */
public class cUsuario {
    
    private TelaAddUsuario view;

    public cUsuario(TelaAddUsuario view) {
        this.view = view;
    }
    
    public void addUsuario(){
        String nome = view.getTxtNome().getText();
        String cpf = view.getTxtCPF().getText();
        String telefone = view.getTxtTelefone().getText();
        String empresa = view.getTxtEmpresa().getText();
        String setor = view.getTxtSetor().getText();
        
        cadastroUsuario novoUsuario = new cadastroUsuario (nome, cpf, telefone, empresa, setor);
        try {
            Connection conexao = new connection().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(novoUsuario);
            
            JOptionPane.showMessageDialog(null, "Novo usuário cadastrado!!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
}
