package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/**Módulo de conxão**/
	// Parâmetros 
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/bdagenda?useTimezone=true&serverTimezone=UTC";
	private String user ="root";
	private String password = "Corintios@01";
	
	// Método conexão 
	
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
	
	// Teste
	
	/*
	 * public void testeConexao() { try { Connection con = conexao();
	 * System.out.println(con); } catch (Exception e) { System.out.println(e); }
	 * 
	 * }
	 */
}
