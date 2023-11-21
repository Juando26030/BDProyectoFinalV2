package com.example.bdproyectofinalv2;

import com.example.bdproyectofinalv2.negocio.INegocioOperacion;
import com.example.bdproyectofinalv2.negocio.NegocioOperacion;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class EventosExamen {

    @FXML
    private INegocioOperacion negocioOperacion;

    public Button btnCrear;
    public Label lblRegistro;
    public Label lblVeterinario;
    public Label lblMascota;
    @FXML
    private ComboBox<String> cmbBoxVeterinario;
    public ComboBox cmbBoxMascota;
    public Button btnConsultar;
    public Button btnLogOut;
    public Label lblDescripcion;
    public TextField txtFieldDescripcion;

    public EventosExamen() {
        negocioOperacion = new NegocioOperacion();
    }

    @FXML
    private void initialize() {
        inicializarComboBoxVeterinarios();
    }

    public void inicializarComboBoxVeterinarios() {
        if (cmbBoxVeterinario != null) {
            ObservableList<String> listaVeterinarios = negocioOperacion.listarVeterinarios();
            cmbBoxVeterinario.setItems(listaVeterinarios);
        } else {
            System.err.println("Error: cmbBoxVeterinario es nulo");
        }
    }

    public void mBtnCrear(ActionEvent event) throws IOException {
        Parent inicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tratamientoView.fxml")));
        Scene inicioScene = new Scene(inicioParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(inicioScene);
        window.show();
    }

    public void mBtnConsultar(ActionEvent event) throws IOException {
        Parent inicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("consultarView.fxml")));
        Scene inicioScene = new Scene(inicioParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(inicioScene);
        window.show();
    }

    public void mBtnLogOut(ActionEvent event) throws IOException {
        Parent inicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("logInView.fxml")));
        Scene inicioScene = new Scene(inicioParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(inicioScene);
        window.show();
    }
}
