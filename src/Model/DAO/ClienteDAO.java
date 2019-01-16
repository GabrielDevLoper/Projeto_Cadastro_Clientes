package Model.DAO;

import Connection.ConexaoPGSQL;
import Model.Bean.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    ConexaoPGSQL conex = new ConexaoPGSQL();
    
    
    public void Salvar(Cliente cliente){
        conex.Conectar();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("insert into cliente(nome,cpf,telefone) values(?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao inserir Dados!");
        }finally{
        conex.Desconectar();
    }
        
    }
    
    public ArrayList<Cliente> Listar(){
        conex.Conectar();
        conex.rs = null;
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try {
            PreparedStatement stmt = conex.con.prepareStatement("select *from cliente");
            conex.rs = stmt.executeQuery();
            while(conex.rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(conex.rs.getInt("id"));
                cliente.setNome(conex.rs.getString("nome"));
                cliente.setCpf(conex.rs.getString("cpf"));
                cliente.setTelefone(conex.rs.getString("telefone"));
                clientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conex.Desconectar();
        }
        
        
        
        return clientes;
    }
    
    public void Excluir(Cliente cliente){
        conex.Conectar();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("delete from cliente where id = ?");
            stmt.setInt(1, cliente.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Dados Excluido com Sucesso");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir "+ex.getMessage());
        }finally{
            conex.Desconectar();
        }
    }
    
    public void Editar(Cliente cliente){
        conex.Conectar();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("update cliente set nome=? , cpf=?, telefone=? where id = ?");
            stmt.setString(1, cliente.getNome()); 
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showConfirmDialog(null, "Dados Alterado com Sucesso");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar dados"+ex.getMessage());
        }finally{
            conex.Desconectar();
        }
        
    }
    
     public ArrayList<Cliente> BuscarPorNome(String nome){
       conex.Conectar();
        conex.rs = null;
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        PreparedStatement stmt;
        try {
            stmt = conex.con.prepareStatement("select *from cliente where nome like ?");
            stmt.setString(1, "%"+nome+"%");
            conex.rs = stmt.executeQuery();
            
            while(conex.rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(conex.rs.getInt("id"));
                cliente.setNome(conex.rs.getString("nome"));
                cliente.setCpf(conex.rs.getString("cpf"));
                cliente.setTelefone(conex.rs.getString("telefone"));
                
                clientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conex.Desconectar();
        }
        return clientes;
       
       
   }
    
}
