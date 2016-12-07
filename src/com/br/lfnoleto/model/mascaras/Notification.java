package com.br.lfnoleto.model.mascaras;

import javafx.scene.control.Alert;
import org.controlsfx.control.Notifications;


import javafx.event.EventHandler;
import javafx.geometry.Pos;

import javafx.util.Duration;

import javax.swing.*;


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
                                .position(Pos.BASELINE_LEFT)
                                .onAction(new EventHandler<javafx.event.ActionEvent>() {
                                    @Override
                                    public void handle(javafx.event.ActionEvent event) {

                                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setTitle("ERRO");
                                        alert.setHeaderText(null);
                                        alert.setContentText("Suporte Técnico Email:Sistemasvikings@gmail.com");
                                        alert.show();



                                    }

                                });
                        notifications.showConfirm();

                        break;

                    case 2:

                        Notifications erro2 = Notifications.create()
                                .title("ERRO")
                                .text("Erro ao chamar um cena Entre em contato com o Suporte tecnico ")
                                .graphic(null)
                                .hideAfter(Duration.seconds(5))
                                .position(Pos.CENTER)
                                .onAction(new EventHandler<javafx.event.ActionEvent>() {
                                    @Override
                                    public void handle(javafx.event.ActionEvent event) {

                                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                        alert.setTitle("ERRO");
                                        alert.setHeaderText(null);
                                        alert.setContentText("Suporte Técnico Email:Sistemasvikings@gmail.com");
                                        alert.show();

                                    }

                                });
                                 erro2.showConfirm();

                        break;


                }






    }

    public void exception(int x, final Exception e) {

        switch (x) {

            case 1:

                Notifications erro1 = Notifications.create()
                        .title("ERRO LOGIN")
                        .text("Deu um erro no exception")
                        .graphic(null)
                        .hideAfter(Duration.seconds(5))
                        .position(Pos.BASELINE_LEFT)
                        .onAction(new EventHandler<javafx.event.ActionEvent>() {
                            @Override
                            public void handle(javafx.event.ActionEvent event) {

                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("ERRO");
                                alert.setHeaderText(null);
                                alert.setContentText("Suporte Técnico Email:Sistemasvikings@gmail.com:" + e);
                                alert.show();


                            }

                        });
                         erro1.showConfirm();

                break;

            case 2 :

                Notifications erro2 = Notifications.create()
                        .title("ERRO LOGIN")
                        .text("Deu um erro no exception")
                        .graphic(null)
                        .hideAfter(Duration.seconds(5))
                        .position(Pos.BASELINE_LEFT)
                        .onAction(new EventHandler<javafx.event.ActionEvent>() {
                            @Override
                            public void handle(javafx.event.ActionEvent event) {

                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("ERRO");
                                alert.setHeaderText(null);
                                alert.setContentText("Suporte Técnico Email:Sistemasvikings@gmail.com:" + e);
                                alert.show();


                            }

                        });

                         erro2.showConfirm();

                break;


        }

    }

}
