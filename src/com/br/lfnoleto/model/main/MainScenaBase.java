package com.br.lfnoleto.model.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainScenaBase extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("Scenabase.fxml"));
		//stage.getIcons().add(new Image(getClass().getResourceAsStre("img/icone.png"<img src="">));  
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.initStyle(StageStyle.UNDECORATED);
		stage.show();	
		
	}

}
