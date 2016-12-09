package com.br.lfnoleto.model.dao;
import java.sql.*;



public class ModuloConexao {

	public static Connection conector(){
		Connection conexao = null;
		//linha a baixo chama o driver
		String driver = "com.mysql.jdbc.Driver";
		//armazenado infomaçao referente ao banco
		//String url = "jdbc:mysql://localhost:3306/cadastro_cliente";
		String url = "jdbc:mysql://localhost:3306/vikings";
		String user ="root";
		String password ="";
		// Estabelecendo a conexao com o banco

		try {
			
			Class.forName(driver);
			return conexao = DriverManager.getConnection(url,user,password);
			
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	
		
	}
	
	
	
	
	
	
}
