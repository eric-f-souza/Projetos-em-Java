package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class DAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/bdagenda?useTimezone=true&serverTimezone=UTC";
	private String user ="root";
	private String password = "Corintios@01";
	
	
	private Connection conexao() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
			
		}
	}	
	
	
	public boolean add(Contatos contato) {
		String sql = "INSERT INTO contatos (nome, sobrenome, data_nascimento, telefone01, telefone02, telefone03, grau_parentesco) values (?, ?, ?, ?, ?, ?, ?)";			
		try {
			Connection con = conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getSobrenome());
            stmt.setString(3, contato.getDataNascimento());
            stmt.setString(4, contato.getTelefone01());
            stmt.setString(5, contato.getTelefone02());
            stmt.setString(6, contato.getTelefone03());
            stmt.setString(7, contato.getGrauParentesco());
            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Boa");
            return true;
        } catch (Exception ex) {
            System.out.println(ex);;
            System.out.println("Erro");
            return false;
        }
	}
	
	public ArrayList<Contatos> listaContatos(){
		ArrayList<Contatos> listaContatos = new ArrayList<Contatos>();
		
		String sql = "SELECT * FROM contatos order by nome";
		
		try {
			Connection con = conexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();  
			
			while(rs.next()){
				Contatos contato = new Contatos();
				contato.setId(rs.getLong(1));
				contato.setNome(rs.getString(2));
				contato.setSobrenome(rs.getString(3));
				contato.setDataNascimento(rs.getString(4));
				contato.setTelefone01(rs.getString(5));
				contato.setTelefone02(rs.getString(6));
				contato.setTelefone03(rs.getString(7));
				contato.setGrauParentesco(rs.getString(8));
				listaContatos.add(contato);					
			}
			stmt.close();
            con.close();
            rs.close();		           

		} catch (SQLException ex) {
			System.out.println(ex);;
			return null;
		}
		return listaContatos;
     }
	
	
	public void selecionarContatos(Contatos contato) {
		String sql = "SELECT * FROM contatos where id = ?";
		
		try {
			Connection con = conexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			ResultSet rs = stmt.executeQuery();  
			while(rs.next()){
				contato.setId(rs.getLong(1));
				contato.setNome(rs.getString(2));
				contato.setSobrenome(rs.getString(3));
				contato.setDataNascimento(rs.getString(4));
				contato.setTelefone01(rs.getString(5));
				contato.setTelefone02(rs.getString(6));
				contato.setTelefone03(rs.getString(7));
				contato.setGrauParentesco(rs.getString(8));
			}
			stmt.close();
			rs.close();
            con.close();
           	           
		} catch (SQLException ex) {
			System.out.println(ex);
			
		}
		
	}
	
	public boolean editarContato(Contatos contato){
		String sql = "UPDATE contatos set nome = ?, sobrenome = ?, data_nascimento = ?, telefone01 = ?, telefone02 = ?, telefone03 = ?, grau_parentesco = ? where id = ?;";
		try {
			Connection con = conexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getSobrenome());
            stmt.setString(3, contato.getDataNascimento());
            stmt.setString(4, contato.getTelefone01());
            stmt.setString(5, contato.getTelefone02());
            stmt.setString(6, contato.getTelefone03());
            stmt.setString(7, contato.getGrauParentesco());
            stmt.setLong(8, contato.getId());
            stmt.execute();
            stmt.close();
            con.close();
            return true;
		}catch(Exception e){
			System.out.println(e);
			return false;
		}
	}
	
	public boolean deletarContato(Contatos contato){
		String sql = "DELETE FROM contatos where id = ?;";
		
		try {
			Connection con = conexao();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
            con.close();
            return true;
           	           
		} catch (SQLException ex) {
			System.out.println(ex);
			return false;
			
		}
		
	}

}


