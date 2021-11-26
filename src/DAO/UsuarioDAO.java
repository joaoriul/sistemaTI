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
import java.util.ArrayList;
import model.cadastroUsuario;

/**
 *
 * @author João Victor Riul
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public cadastroUsuario insert(cadastroUsuario cadUsuario) throws SQLException{
 
            String sql ="insert into cadUsuario(nomeusuario, cpfusuario, telusuario, empusuario, strusuario) values(?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, cadUsuario.getNome());
            statement.setString(2, cadUsuario.getCpf());
            statement.setString(3, cadUsuario.getTelefone());
            statement.setString(4, cadUsuario.getEmpresa());
            statement.setString(5, cadUsuario.getSetor());
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if(resultSet.next()){
                int id = resultSet.getInt("Id");
                cadUsuario.setId(id);
            }
            return cadUsuario;
    }
}  