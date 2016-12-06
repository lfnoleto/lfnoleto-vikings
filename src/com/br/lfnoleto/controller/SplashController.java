package com.br.lfnoleto.controller;

import com.br.lfnoleto.model.mascaras.Notification;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Lucas-PC on 05/12/2016.
 */
public class SplashController implements Initializable{

    @FXML
    private StackPane roott;




    @Override
    public void initialize(URL url, ResourceBundle rd) {

        new SplashScreee().start();



    }



    class  SplashScreee extends Thread{

        @Override
        public void run()  {

            try {
                Thread.sleep(5000);

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {


                        Parent root;
                        root = null;
                        try {
                              root =   FXMLLoader.load(getClass().getResource("/com/br/lfnoleto/view/loginCss/ScenaLogin.fxml"));

                        } catch (IOException ex) {
                            Logger.getAnonymousLogger(SplashController.class.getName()).log(Level.SEVERE,null,ex);


                        }

                        Scene scene = new Scene(root);
                        Stage stage = new Stage();
                        stage.setScene(scene);
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.show();
                        roott.getScene().getWindow().hide();

                    }
                });




            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }
}
