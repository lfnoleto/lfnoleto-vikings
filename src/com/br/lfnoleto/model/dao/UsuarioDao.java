package com.br.lfnoleto.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import com.br.lfnoleto.model.bean.Usuario;
import javafx.scene.control.Alert;
import sun.font.SunFontManager.FamilyDescription;

public class UsuarioDao {

	public void create(Usuario p){


		Connection con = ConnectFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			
			stmt = con.prepareStatement("INSERT INTO tbusuario (usuario,fone,login,senha) values (?,?,?,?)");
            stmt.setString(1, p.getUsuario());
            stmt.setString(2, p.getFone());
            stmt.setString(3, p.getLogin());
            stmt.setString(4, p.getSenha());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Salva");
		}finally{
			ConnectFactory.closeConnection(con, stmt);
		}




	}

	public boolean checkLogin(String login, String senha){

		Connection con = ConnectFactory.getConnection();
		PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT  * FROM vikings.tbusuario WHERE login =? and senha = ?");
            stmt.setString(1,login);
            stmt.setString(2,senha);
            rs = stmt.executeQuery();
            if(rs.next()){

                check = true;

            }

        }catch (SQLException e){

            JOptionPane.showMessageDialog(null,"Erro De Sql"+e);

        }finally {
            ConnectFactory.closeConnection(con,stmt,rs);
        }
         return check;
	}

	public boolean checkLoginEnter(String login, String senha){

	    Connection con = ConnectFactory.getConnection();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    boolean check = false;

	    try {
	        stmt = con.prepareStatement("SELECT * FROM vikings.tbusuario WHERE usuario = 'administrador' AND login = ? AND  senha = ?");
            stmt.setString(1,login);
            stmt.setString(2,senha);
            rs = stmt.executeQuery();
            if(rs.next()){

                check = true;
            }

        }catch (SQLException e){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("ERRO NO SQL");
            alert.setHeaderText(null);
            alert.setContentText("ERRO NO SQL USER:\n"+e);
            alert.show();


        }finally {

            ConnectFactory.closeConnection(con,stmt,rs);
        }

        return check;
    }
}
