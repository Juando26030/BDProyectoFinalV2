package com.example.bdproyectofinalv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class EventosCRUDTratamiento {
    public Label lblActivos;
    public Button btnActualizar;
    public Label lblTratamientos;
    public ListView listViewTratamientos;
    public Label lblAgregar;
    public Label lblModificar;
    public Label lblEliminar;
    public ComboBox cmbBoxAgregar;
    public ComboBox cmbBoxModificar;
    public ComboBox cmbBoxEliminar;
    public Label lblTotalPagar;
    public Label txtTotalPagar;
    public Button btnPagar;
    public Button btnVolver;

    //METODOS PANTALLAS-----------------------------------------------------------
    public void mBtnVolver(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("examenView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }
    public void mBtnPagar(ActionEvent event) throws IOException
    {
        Parent InicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pagarView.fxml")));
        Scene InicioScene = new Scene(InicioParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(InicioScene);
        window.show();
    }

    //METODOS OPERACIONES-----------------------------------------------------------
    public void mBtnActualizar()
    {
    }
}
