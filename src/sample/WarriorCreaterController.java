package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Model.Factory;
import sample.Model.Squad;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер покупки воина
 */
public class WarriorCreaterController implements Initializable {

    private String SelectedWarrior;

    private boolean flag;
    @FXML
    private ImageView Warrior;
    @FXML
    private Button OkBtn;

    /**
     * Начальные значения
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        flag = false;
        SelectedWarrior = "dsf";
    }

    /**
     * Нажатие на кнопку "купить"
     * @param actionEvent
     */
    @FXML
    private void OkClicked(ActionEvent actionEvent){
        Stage stage = (Stage) OkBtn.getScene().getWindow();
        System.out.println(SelectedWarrior);
        stage.close();
    }

    /**
     * Нажатие на воина
     * @param mouseEvent
     */
    @FXML
    private void warriorClick(MouseEvent mouseEvent){
        if(!flag) {
            Image img = new Image("./img/varrior/warriorSelected.png");
            Warrior.setImage(img);
            SelectedWarrior = "Warrior";
            flag = true;
        }
        else
        {
            Image img = new Image("./img/varrior/War.png");
            Warrior.setImage(img);
            flag=false;
        }
    }

    public String getSelectedWarrior() {
        return SelectedWarrior;
    }

}
