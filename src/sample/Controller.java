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
                textoLbl.setText("Insertado "+insertarTxt.getText());
                cola.insertar(Integer.parseInt(insertarTxt.getText()));
                elementosLV.getItems().clear();
                insertarTxt.clear();
                cola.mostrar(elementosLV);
            }
        });
        this.extraerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textoLbl.setText("Número Extraido: "+cola.extraer());
                elementosLV.getItems().remove(0);
            }
        });
        this.vaciarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                elementosLV.getItems().clear();
                cola.vaciar();
                textoLbl.setText("Vaciado");
            }
        });
        this.tamanoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textoLbl.setText("El tamaño de la\ncola es: "+String.valueOf(cola.tamano()));
            }
        });
        this.buscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textoLbl.setText("El número "+buscarTxt.getText()+"\nencontrado en\nla posición: "+cola.buscar(Integer.parseInt(buscarTxt.getText())));
            }
        });
    }
}
