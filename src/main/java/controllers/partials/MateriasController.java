package controllers.partials;

import application.Global;
import com.jfoenix.controls.JFXColorPicker;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import helpers.Authenticator;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import models.Cor;
import models.Materia;

public class MateriasController {

    private Authenticator auth;

    private Cor cor;
    private Materia materia;

    @FXML
    private JFXColorPicker colorP;

    @FXML
    private JFXTextField txtNome;

    @FXML
    private JFXTreeTableView tableMaterias;

    @FXML
    public void initialize() {

    }

    @FXML
    private void redefinir(){
        txtNome.setText("");
        colorP.setValue(Color.color(1.0, 1.0, 1.0));
    }

    @FXML
    private void salvar(){
        cor = new Cor(colorP.getValue());
        materia = new Materia(txtNome.getText(), cor);
        if (auth.materias(materia)){
            Global.materias.add(materia);
        }else{

        }
    }

    @FXML
    private void excluir(){

    }
}
