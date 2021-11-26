/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.cadastroEquipamento;
import model.cadastroFornecedor;

/**
 *
 * @author João Victor Riul
 */
public class EquipamentoDAO {
    
    private final Connection connection;

    public EquipamentoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public cadastroEquipamento insert(cadastroEquipamento cadEquipamento) throws SQLException{
 
            String sql ="insert into cadEquipamento(nomeequipamento, marcaequipamento, modeloequipamento, serieequipamento) values(?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, cadEquipamento.getNome());
            statement.setString(2, cadEquipamento.getMarca());
            statement.setString(3, cadEquipamento.getModelo());
            statement.setString(4, cadEquipamento.getSerie());
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if(resultSet.next()){
                int id = resultSet.getInt("Id");
                cadEquipamento.setId(id);
            }
            return cadEquipamento;
    }

    public void insert(cadastroFornecedor novoFornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  