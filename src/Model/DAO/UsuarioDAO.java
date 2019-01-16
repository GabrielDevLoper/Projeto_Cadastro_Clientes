package Model.DAO;


import Connection.ConexaoPGSQL;
import Model.Bean.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    ConexaoPGSQL conex = new ConexaoPGSQL();
    
    public void Salvar(Usuario usuario){
        conex.Conectar();
        try {
            PreparedStatement stmt = conex.con.prepareStatement("insert into usuario(login,senha) values(?,?)");
            stmt.setString(1, usuario.getLogin());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao inserir Dados!");
        }finally{
        conex.Desconectar();
    }
    
    }  
    
    public  boolean  ChecarLogin(String login, String senha){
    
        conex.Conectar();
        conex.rs = null;
        
        boolean check = false;
        
        PreparedStatement stmt;
        try {
            stmt = conex.con.prepareStatement("select *from usuario where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            conex.rs = stmt.executeQuery();
            
            if(conex.rs.next()){
                check = true;
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conex.Desconectar();
        }
        return check;
}
    
}
