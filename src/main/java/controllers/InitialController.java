package controllers;

import application.Screen;
import com.jfoenix.controls.JFXPasswordField;
import helpers.Authenticator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InitialController {

    private Screen screen = new Screen();
    private Authenticator authenticator;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private Label txtErro;

    @FXML
    private void redefinir(){
        txtPassword.setText("");
    }

    @FXML
    private void login(){
        if (!"".equals(txtPassword.getText())){
            try {

                authenticator = new Authenticator(txtPassword.getText());
                if (authenticator.validar()) logar(); else showError(2);

            }catch (Exception e){
                e.printStackTrace();
                showError(3);
            }

        }else{ showError(1); }
    }

    private void showError(int i){

        String error = "ERRO: ";

        switch (i){
            case 1:
                error += "A senha nao pode ser nula";
                break;
            case 2:
                error += "A senha esta invalida";
                break;
            case 3:
                error += "Desconhecido";
                break;
        }

        txtErro.setText(error);
    }

    private void logar(){ screen.restart("home", "AAAAA", true); }
}
