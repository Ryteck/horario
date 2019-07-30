package controllers;

import application.Screen;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HomeController {

    private Screen screen = new Screen();

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private Pane pane3;

    @FXML
    private Pane pane4;

    @FXML
    private Pane pane5;

    @FXML
    private Pane pane6;

    @FXML
    private AnchorPane modularPane;

    @FXML
    public void initialize() { actionButton1(); }

    @FXML
    private void actionButton1(){
        atualizarPanes(0);
        loadViews(1);
    }

    @FXML
    private void actionButton2(){
        atualizarPanes(1);
        loadViews(2);
    }

    @FXML
    private void actionButton3() {
        atualizarPanes(2);
        loadViews(3);
    }

    @FXML
    private void actionButton4(){
        atualizarPanes(3);
        loadViews(4);
    }

    @FXML
    private void actionButton5(){
        atualizarPanes(4);
        loadViews(5);
    }

    @FXML
    private void actionButton6(){
        atualizarPanes(5);
        loadViews(6);
    }

    @FXML
    private void actionButton7(){ screen.restart("initial", "Home", false); }

    private void atualizarPanes(int pane){

        Pane[] panes = {pane1, pane2, pane3, pane4, pane5, pane6};

        for (int cont = 0; cont < 6; cont++){
            if (cont == pane){
                panes[cont].getStyleClass().addAll("pane-active-button");
                continue;
            }
            panes[cont].getStyleClass().clear();
        }
    }


    private void loadViews(int i){

        String resource = "/views/partials/";

        switch (i){
            case 1:
                resource += "home";
                break;
            case 2:
                resource += "materias";
                break;
            case 3:
                resource += "professores";
                break;
            case 4:
                resource += "tabela";
                break;
            case 5:
                resource += "settings";
                break;
            case 6:
                resource += "backups";
                break;
        }

        resource += ".fxml";

        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(resource));
            modularPane.getChildren().clear();
            modularPane.getChildren().add(pane);
            modularPane.setTopAnchor(pane, 0.0);
            modularPane.setBottomAnchor(pane, 0.0);
            modularPane.setRightAnchor(pane, 0.0);
            modularPane.setLeftAnchor(pane, 0.0);
        } catch (IOException e) { e.printStackTrace(); }
    }
}
