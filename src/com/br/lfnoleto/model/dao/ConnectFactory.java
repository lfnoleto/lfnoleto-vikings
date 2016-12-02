package com.br.lfnoleto.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ConnectFactory {

	private final static String DRIVER = "com.mysql.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3307/vikings";
	private final static String USER ="root";
	private final static String PASSWORD="";
	
	public static Connection getConnection(){
		
		try {
			
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USER,PASSWORD);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
		
		
	}
	public static void closeConnection(Connection con){
		
		try {
			
			if(con!=null){
				con.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao Fecha Connection"+e);
		}
	}
	public static void closeConnection(Connection con,PreparedStatement stmt){

		
		closeConnection(con);
		
		try {
			if(stmt!=null){
				stmt.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao Fecha Statement"+e);
		}
	}
	public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs){
		
		closeConnection(con,stmt);
		
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao Fecha Statement"+e);
		}
		
		
		
	}
	}
