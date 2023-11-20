package com.example.bdproyectofinalv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosConsultar {
    public Label lblConsultar;
    public Button btnConsultar;
    public DatePicker dateDesde;
    public DatePicker dateHasta;
    public Label lblDesde;
    public Label lblHasta;
    public ListView listViewConsultas;
    public Button btnVolver;

    public void mBtnVolver(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("examenView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnConsultar()
    {
    }
}
