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
import model.cadastroFornecedor;

/**
 *
 * @author João Victor Riul
 */
public class FornecedorDAO {
    
    private final Connection connection;

    public FornecedorDAO(Connection connection) {
        this.connection = connection;
    }
    
    public cadastroFornecedor insert(cadastroFornecedor cadFornecedor) throws SQLException{
 
            String sql ="insert into cadFornecedor(nomefornecedor, cnpjfornecedor, endfornecedor, ramofornecedor, contatofornecedor) values(?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, cadFornecedor.getNome());
            statement.setString(2, cadFornecedor.getCnpj());
            statement.setString(3, cadFornecedor.getEndereco());
            statement.setString(4, cadFornecedor.getRamo());
            statement.setString(5, cadFornecedor.getContato());
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if(resultSet.next()){
                int id = resultSet.getInt("Id");
                cadFornecedor.setId(id);
            }
            return cadFornecedor;
    }
}  