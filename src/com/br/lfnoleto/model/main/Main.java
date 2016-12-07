package com.br.lfnoleto.model.main;
	
import java.io.IOException;

import com.br.lfnoleto.controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	@Override
	public void start(Stage stage) throws IOException {
			
			Parent parent =  FXMLLoader.load(getClass().getResource("/com/br/lfnoleto/view/Splash/SplashFXML.fxml"));
			//stage.getIcons().add(new Image(getClass().getResourceAsStre("img/icone.png"<img src="">));  
			Scene scene = new Scene(parent);
			scene.setFill(null);
			stage.setScene(scene);
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();		
			
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}
