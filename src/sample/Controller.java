package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Node;

public class Controller {
    @FXML

    private void addSceneMotion(ActionEvent event) throws IOException {

        Parent View2 = FXMLLoader.load(getClass().getResource("DashScreen.fxml"));
        Scene scene2 = new Scene(View2);
        Stage Window = (Stage)((Node) event.getSource()).getScene().getWindow();

        Window.setScene(scene2);
        Window.show();
    }
}
