package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Model.Squad;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер главного меню
 */
public class MainMenuController implements Initializable{

    private FirstMap firstMap;  //parent controller
    private WarriorCreaterController warriorCreaterController; //children controller

    private Squad squad;        //model

    //----------------------------------------------

    /**
     * Нажатие на кнопку инициирует открытие окна первого боя
     * @param actionEvent
     */
    @FXML
    public void ppcBtn(ActionEvent actionEvent) {
        try {

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Designe/FirstMap.fxml"));
            stage.setTitle("Первый бой");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.NONE);
            stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
            stage.showAndWait();
        }
        catch (Exception e){

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
