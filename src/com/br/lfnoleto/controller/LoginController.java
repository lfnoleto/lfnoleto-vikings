package com.br.lfnoleto.controller;


import com.br.lfnoleto.model.bean.Usuario;
import com.br.lfnoleto.model.dao.ModuloConexao;
import com.br.lfnoleto.model.dao.UsuarioDao;

import com.br.lfnoleto.model.main.MainScenaBase;
import com.br.lfnoleto.model.mascaras.TextFieldFormatter;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;


import javax.swing.*;
import javax.swing.text.MaskFormatter;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.sql.*;


	public class LoginController implements Initializable {


		//

		//*

		//* refazendo a class controller 26-11-2016

		//* os butaoes vao seguir seguinte sistema de nome bt de butao e depois a inicial da onde ele exemplo

		//* "tbCuser" butao da cena do user

		//

		@FXML
		private AnchorPane cena1,cena2,cena3,cena4;

		@FXML
		private JFXButton  tbCEntra,tbCCancelar,tbCAEntra,tbCACancelar,tbCCEntra,tbCCCancelar;

		@FXML
		private JFXTextField txCuser,txCALogin,txCCNome,txCCTelefone,txCCLogin;

		@FXML
		JFXPasswordField txCSenha,txCASenha,txCCSenha,txCCSenhaC;

		@FXML
		private Hyperlink hlCAdm;


		//

		//*  aqui vai ser os action de cada button em ondem começa pela cena 1

		//*  atualizado dia 27-11-2016

		//*

		//*

		//

		public void tbCEntraAction(ActionEvent evt)  {

		 	    UsuarioDao usuarioDao = new UsuarioDao();

		 		if(usuarioDao.checkLogin(this.txCuser.getText(),this.txCSenha.getText())){

					try {


						new MainScenaBase().start(new Stage());
						((Node)evt.getSource()).getScene().getWindow().hide();

					}catch (Exception e){

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Erro ao chamar um cena Entre em contato com o Suporte tecnico /n"+ e);
						alert.show();

					}


				  }else{


		 			try {

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Nome de Usuário ou Senha Está Incorreto, ou Você Não Tem Permissões");
						alert.show();


					}catch (Exception e){

		 				Alert alert = new Alert(Alert.AlertType.INFORMATION);
		 				alert.setTitle("Erro");
		 				alert.setHeaderText(null);
		 				alert.setContentText("Entre em contato com o Suporte tecnico");
		 				alert.show();

					}

				}


			 }
            UsuarioDao usuarioDao = new UsuarioDao();
		public  void tbCEntraActionE(KeyEvent event){

		 	if(event.getCode() == KeyCode.ENTER){

				if(usuarioDao.checkLogin(this.txCuser.getText(),this.txCSenha.getText()))

				{
					try {


						new MainScenaBase().start(new Stage());
						((Node) event.getSource()).getScene().getWindow().hide();

					} catch (Exception e) {

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Erro ao chamar um cena Entre em contato com o Suporte tecnico /n" + e);
						alert.show();

					}
				} else{


					try {

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Nome de Usuário ou Senha Está Incorreto, ou Você Não Tem Permissões");
						alert.show();

						this.txCuser.setText(null);
						this.txCSenha.setText(null);


					}catch (Exception e){

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Erro");
						alert.setHeaderText(null);
						alert.setContentText("Entre em contato com o Suporte tecnico");
						alert.show();

					}

				}



			}






			 }

		public void tbCCancelarAction(ActionEvent evt){

			try{

				 System.exit(0);

			}catch (Exception e){

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("ERRO");
				alert.setHeaderText(null);
				alert.setContentText("Erro ao Fenha o Sistema /n" + e);
				alert.show();



			}


		}

		public  void hlCAdmAction(ActionEvent evt){

			this.cena2.setVisible(false);
			this.cena3.setVisible(true);


		}

		public void tbCAEntraAction(ActionEvent evt){

			UsuarioDao usuarioDao = new UsuarioDao();

			if(usuarioDao.checkLoginEnter(this.txCALogin.getText(),this.txCASenha.getText())){

				try {
					this.cena3.setVisible(false);
					this.cena4.setVisible(true);

				}catch (Exception e){


					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("ERRO");
					alert.setHeaderText(null);
					alert.setContentText("Erro ao chamar a cena entre em contato com Suporte Técnico do Sistema"+e);
					alert.show();

				}


			}else{

					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("ERRO");
					alert.setHeaderText(null);
					alert.setContentText("Nome de Usuário ou Senha Está Incorreto, ou Você Não Nem Permissões");
					alert.show();


			}

		}

		public void tbCAEntraActionE(KeyEvent event){

			UsuarioDao usuarioDao = new UsuarioDao();

			if(event.getCode() == KeyCode.ENTER){

				if(usuarioDao.checkLoginEnter(this.txCALogin.getText(),this.txCASenha.getText())){

					try{

						this.cena3.setVisible(false);
						this.cena4.setVisible(true);


					}catch (Exception e){

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Erro ao chamar a cena entre em contato com Suporte Técnico do Sistema"+e);
						alert.show();
						this.txCALogin.setText(null);
						this.txCASenha.setText(null);



					}


				}else{


					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("ERRO");
					alert.setHeaderText("Nome de Usuário ou Senha Está Incorreto, ou Você Não Tem Permissões");
					alert.setContentText("Essa Cadastro de Novo Usuário Só Pode Ser Feito Com Senha de Adminitrador");
					alert.show();
					this.txCALogin.setText(null);
					this.txCASenha.setText(null);


				}

			}





		}

		public void tbCACancelar(ActionEvent evt){


			try{
				this.cena3.setVisible(false);
				this.cena2.setVisible(true);

			}catch (Exception e){

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText("Erro ao Volta Entre em Contato com Suporte Técnico do Sistema");
				alert.show();

			}

		}

		public void tbCCEntraAction(ActionEvent evt){

			if(this.txCCNome.getText()!=null && this.txCCTelefone!=null&& this.txCCLogin!= null && this.txCCSenha!=null && this.txCCSenhaC !=null){

				if(this.txCCSenha.getText().equals(this.txCCSenhaC.getText())){

					try {

						UsuarioDao usuarioDao = new UsuarioDao();
						Usuario usuario = new Usuario();

						usuario.setUsuario(this.txCCNome.getText());
						usuario.setFone(this.txCCTelefone.getText());
						usuario.setLogin(this.txCCLogin.getText());
						usuario.setSenha(this.txCCSenha.getText());
						usuarioDao.create(usuario);

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("salvo");
						alert.setHeaderText(null);
						alert.setContentText("Salvo com sucesso");
						alert.show();

						this.txCCNome.setText(null);
						this.txCCTelefone.setText(null);
						this.txCCLogin.setText(null);
						this.txCSenha.setText(null);
						this.txCCSenhaC.setText(null);



					}catch (Exception e){

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("Erro ao Gravar Os Dados no Banco de Dado./n"+e);
						alert.show();





					}





				}else{

					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("ERRO");
					alert.setHeaderText(null);
					alert.setContentText("As Senha Não Confere.");
					alert.show();

				}






			}else{

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("ERRO");
				alert.setHeaderText(null);
				alert.setContentText("Todos Os Campos do Cadastro de Usuario Deve Ser Preenchidos");
				alert.show();

			}




		}

		public void tbCCEntraActionE(KeyEvent event){

			if(event.getCode()== KeyCode.ENTER){

				Usuario usuario = new Usuario();
				UsuarioDao usuarioDao = new UsuarioDao();

				if(this.txCCNome!=null && this.txCCTelefone!=null && this.txCCLogin!=null && this.txCCSenha!=null && this.txCCSenhaC!=null){

					if(this.txCCSenha.getText().equals(this.txCCSenhaC.getText())){

						try {
							usuario.setUsuario(this.txCCNome.getText());
							usuario.setFone(this.txCCTelefone.getText());
							usuario.setLogin(this.txCCLogin.getText());
							usuario.setSenha(this.txCCSenha.getText());
							usuarioDao.create(usuario);

							Alert alert = new Alert(Alert.AlertType.INFORMATION);
							alert.setTitle("salvo");
							alert.setHeaderText(null);
							alert.setContentText("Salvo com sucesso");
							alert.show();


						}catch (Exception e){

							Alert alert = new Alert(Alert.AlertType.INFORMATION);
							alert.setTitle("ERRO");
							alert.setHeaderText(null);
							alert.setContentText("Erro ao Gravar Os Dados no Banco de Dado./n"+e);
							alert.show();


						}



					}else{

						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("ERRO");
						alert.setHeaderText(null);
						alert.setContentText("As Senha Não Confere.");
						alert.show();



					}




				}else{
					Alert alert = new Alert(Alert.AlertType.INFORMATION);
					alert.setTitle("ERRO");
					alert.setHeaderText(null);
					alert.setContentText("Todos Os Campos do Cadastro de Usuario Deve Ser Preenchidos");
					alert.show();

				}



			}


		}

		public void tbCCCancelarAction(ActionEvent evt){


			try {

				this.cena4.setVisible(false);
				this.cena2.setVisible(true);

			}catch (Exception e){

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText("Erro ao Volta Entre em Contato com Suporte Técnico do Sistema." + e);
				alert.show();


			}




		}

		public void mascaraTelefone(){

			TextFieldFormatter telefone = new TextFieldFormatter();
			telefone.setMask("(##)####-####");
			telefone.setCaracteresValidos("1234567890");
			telefone.setTf(this.txCCTelefone);
			telefone.formatter();


		}





		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub


		}



}