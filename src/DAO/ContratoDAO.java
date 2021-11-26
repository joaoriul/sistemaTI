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
import model.cadastroContrato;
import model.cadastroFornecedor;

/**
 *
 * @author João Victor Riul
 */
public class ContratoDAO {
    
    private final Connection connection;

    public ContratoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public cadastroContrato insert(cadastroContrato cadContrato) throws SQLException{
 
            String sql ="insert into cadContrato(nomeempresa, tipocontrato, duracaocontrato, valorcontrato, obscontrato) values(?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, cadContrato.getEmpresa());
            statement.setString(2, cadContrato.getTipo());
            statement.setString(3, cadContrato.getDuracao());
            statement.setString(4, cadContrato.getValor());
            statement.setString(5, cadContrato.getObs());
            statement.execute();
            
            ResultSet resultSet = statement.getGeneratedKeys();
            
            if(resultSet.next()){
                int id = resultSet.getInt("Id");
                cadContrato.setId(id);
            }
            return cadContrato;
    }
public void insert(cadastroFornecedor novoFornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}