package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Screen extends Application {

    private static String path;

    private static String title;

    private static String iconPath;

    private static Stage stage;

    public void initial(){
        setPath("initial");
        setTitle("Home");
        launch();
    }

    public void restart(String path, String title){
        setPath(path);
        setTitle(title);
        getStage().close();

        try {
            start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource(getPath()));

        Scene scene = new Scene(root);

        stage.setTitle(getTitle());
        //stage.getIcons().add(new Image(getIconPath()));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        setStage(stage);
    }

    private Stage getStage() {
        return stage;
    }

    private void setStage(Stage stage) {
        Screen.stage = stage;
    }

    private String getPath() {
        return path;
    }

    private void setPath(String path) {
        Screen.path = "/views/" + path + ".fxml";
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        Screen.title = title;
    }

    private String getIconPath() {
        return iconPath;
    }
}
