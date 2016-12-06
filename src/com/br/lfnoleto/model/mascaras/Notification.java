package com.br.lfnoleto.model.mascaras;

import org.controlsfx.control.Notifications;


import javafx.event.EventHandler;
import javafx.geometry.Pos;

import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;


/**
 * Created by Lucas-PC on 05/12/2016.
 */
public class Notification {


    public void notification(int x){

                switch (x){

                    case 1:

                        Notifications notifications = Notifications.create()
                                .title("ERRO LOGIN")
                                .text("Nome de Usuário ou Senha Está Incorreto, ou Você Não Tem Permissões")
                                .graphic(null)
                                .hideAfter(Duration.seconds(5))
                                .position(Pos.CENTER)
                                .onAction(new EventHandler<javafx.event.ActionEvent>() {
                                    @Override
                                    public void handle(javafx.event.ActionEvent event) {

                                        System.out.print("isso mesmo");

                                    }

                                });
                        notifications.showConfirm();

                        break;


                }






    }



}
