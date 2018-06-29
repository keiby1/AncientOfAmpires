package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Model.Squad;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер первого боя
 */
public class FirstMap implements Initializable {

    private Squad squad;

    @FXML
    private ImageView img10;    //картинка замка
//-------------------------------------------------------
    /**
     * Начальная инициализация
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * Нажатие на замок
     * открывает меню покупки югита
     * @param event
     */
    @FXML
    private void img01Click(MouseEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Parent root = FXMLLoader.load(getClass().getResource("Designe/WarriorCreater.fxml"));
            stage.setTitle("Создание Юнита");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) event.getSource()).getScene().getWindow());
            stage.showAndWait();
        }
        catch (Exception e){

        }
    }


}