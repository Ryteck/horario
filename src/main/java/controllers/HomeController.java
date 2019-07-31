package controllers;

import application.Screen;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HomeController {

    private Screen screen = new Screen();

    private int paneSelect;

    private Pane[] panes;

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
    private Pane pane7;

    @FXML
    private AnchorPane modularPane;

    @FXML
    public void initialize() {
        panes = new Pane[]{pane1, pane2, pane3, pane4, pane5, pane6, pane7};
        paneSelect = 0;
        actionButton1();

    }

    @FXML
    private void actionButton1(){ if (paneSelect != 1) selectButton(1); }

    @FXML
    private void actionButton2(){ if (paneSelect != 2) selectButton(2); }

    @FXML
    private void actionButton3() { if (paneSelect != 3) selectButton(3); }

    @FXML
    private void actionButton4(){ if (paneSelect != 4) selectButton(4); }

    @FXML
    private void actionButton5(){ if (paneSelect != 5) selectButton(5); }

    @FXML
    private void actionButton6(){ if (paneSelect != 6) selectButton(6); }

    @FXML
    private void actionButton7(){ if (paneSelect != 7) selectButton(7); }

    @FXML
    private void actionButton8(){ screen.restart("initial", "Home", false); }

    private void selectButton(int valor){
        atualizarPanes(valor - 1);
        loadViews(valor);
        paneSelect = valor;
    }

    private void atualizarPanes(int pane){

        for (int cont = 0; cont < panes.length; cont++){
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
                resource += "turmas";
                break;
            case 5:
                resource += "tabela";
                break;
            case 6:
                resource += "settings";
                break;
            case 7:
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
