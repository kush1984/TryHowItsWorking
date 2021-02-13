package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MyController {
    public Button btnLogin;
    public TextField txtUsername;
    public PasswordField pwPassword;
    public ComboBox cbOperators;


    static Stage thisstage;
    ObservableList<String> operatorsList = FXCollections.observableArrayList();

    public void initialize(URL location, ResourceBundle resources)   {
        cbOperators.setItems(operatorsList);
    }


    public void On_cbOperatorsAction(ActionEvent actionEvent) {
        txtUsername.setText(cbOperators.getValue().toString());
    }

    public void On_btnLoginClick(ActionEvent actionEvent) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Please input username!");
            alert.showAndWait();
            return;

    }
}
