package com.andrecalisto.login.controller;

import com.andrecalisto.login.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaLoginController {

    @FXML
    private Hyperlink cadastreLink;

    @FXML
    private Button entrarButton;

    @FXML
    private PasswordField senhaField;

    @FXML
    private TextField usuarioField;
    
    @FXML
    private Label msgLabel;

    @FXML
    void cadastrar(ActionEvent event) throws IOException {
        App.setRoot("telaCadastro");
    }

    @FXML
    void login(ActionEvent event) {
        if(usuarioField.getText().equals("andrecalisto") && senhaField.getText().equals("123456")){
            msgLabel.setText("Login realizado com Sucesso");
        }else{
            msgLabel.setText("Usuário ou Senha incorretos");
        }
    }

}
