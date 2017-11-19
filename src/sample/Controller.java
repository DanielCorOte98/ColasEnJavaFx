package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button insertarBtn, buscarBtn, extraerBtn, tamanoBtn, vaciarBtn;
    @FXML
    ListView elementosLV;
    @FXML
    TextField insertarTxt, buscarTxt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Cola cola = new Cola();

        this.insertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cola.insertar(Integer.parseInt(insertarTxt.getText()));
                elementosLV.getItems().addAll(cola.mostrar());
            }
        });
    }
}
