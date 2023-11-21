package com.example.bdproyectofinalv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosPagar {
    public Label lblPago;
    public Button btnGuardar;
    public Label lblMetodoPago;
    public ComboBox cmbBoxMetodoPago;
    public Label lblNumero;
    public TextField txtFieldNumero;
    public Label lblTotalPagar;
    public Label txtTotalPagar;
    public Button btnVolver;

    //METODOS PANTALLAS-----------------------------------------------------------
    public void mBtnGuardar(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("examenView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnVolver(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tratamientoView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }

    //METODOS OPERACIONES-----------------------------------------------------------
}
