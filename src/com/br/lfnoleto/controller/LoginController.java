package com.br.lfnoleto.controller;


import com.br.lfnoleto.model.bean.Usuario;
import com.br.lfnoleto.model.dao.UsuarioDao;

import com.br.lfnoleto.model.main.MainScenaBase;
import com.br.lfnoleto.model.mascaras.Notification;
import com.br.lfnoleto.model.mascaras.TextFieldFormatter;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginController implements Initializable {

		Notification notification = new Notification();
	    UsuarioDao usuarioDao = new UsuarioDao();


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

		//*  atualizado dia 06-12-2016

		//*

		//

		public void tbCEntraAction(ActionEvent evt)  {



		 		if(usuarioDao.checkLogin(this.txCuser.getText(),this.txCSenha.getText())){

					try {

						new MainScenaBase().start(new Stage());
						((Node)evt.getSource()).getScene().getWindow().hide();

					}catch (Exception e){

						notification.exception(2,e);
					}

				  }else{
						notification.notification(1);
						this.txCuser.setText(null);
						this.txCSenha.setText(null);
				  }
			 }

		public  void tbCEntraActionE(KeyEvent event){



		 	if(event.getCode() == KeyCode.ENTER)

		 		if(usuarioDao.checkLogin(this.txCuser.getText(),this.txCSenha.getText())){

					try {

						new MainScenaBase().start(new Stage());
						((Node)event.getSource()).getScene().getWindow().hide();

					}catch (Exception e){

						notification.exception(2,e);
					}

				}else{
					notification.notification(1);
					this.txCuser.setText(null);
					this.txCSenha.setText(null);
				}






			 }

		public void tbCCancelarAction(ActionEvent evt){

			try{

				 System.exit(0);

			}catch (Exception e){

			notification.exception(1,e);

			}


		}

		public  void hlCAdmAction(ActionEvent evt){

			this.cena2.setVisible(false);
			this.cena3.setVisible(true);


		}

		public void tbCAEntraAction(ActionEvent evt){

			if(usuarioDao.checkLoginEnter(this.txCALogin.getText(),this.txCASenha.getText())){

				try {
					this.cena3.setVisible(false);
					this.cena4.setVisible(true);

				}catch (Exception e){
					notification.exception(1,e);
				}

			}else{

				notification.notification(1);
				this.txCALogin.setText(null);
				this.txCASenha.setText(null);

			}

		}

		public void tbCAEntraActionE(KeyEvent event){

			UsuarioDao usuarioDao = new UsuarioDao();

			if(event.getCode() == KeyCode.ENTER){

				if(usuarioDao.checkLoginEnter(this.txCALogin.getText(),this.txCASenha.getText())){

					try {
						this.cena3.setVisible(false);
						this.cena4.setVisible(true);

					}catch (Exception e){
						notification.exception(1,e);
					}

				}else{

					notification.notification(1);
					this.txCALogin.setText(null);
					this.txCASenha.setText(null);

				}


			}

		}

		public void tbCACancelar(ActionEvent evt){

			try{

				System.exit(0);

			}catch (Exception e){

				notification.exception(1,e);

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