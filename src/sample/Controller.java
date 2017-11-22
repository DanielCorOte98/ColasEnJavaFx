package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML
    Label textoLbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Cola cola = new Cola();

        this.insertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cola.insertar(Integer.parseInt(insertarTxt.getText()));
                elementosLV.getItems().clear();
                cola.mostrar(elementosLV);
                insertarTxt.clear ();
            }
        });
        this.extraerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cola.extraer();
                elementosLV.getItems().remove(0);
            }
        });
        this.vaciarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                elementosLV.getItems().clear();
            }
        });
        this.tamanoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textoLbl.setText("El tamaño de la cola es: "+String.valueOf(cola.tamano()));
            }
        });
        this.buscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               textoLbl.setText("El número "+buscarBtn.getText()+"\n  encontrado en la \n posición "+cola.buscar(Integer.parseInt(buscarTxt.getText())));

            }
        });
    }
}
