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
import java.math.BigDecimal;
import java.util.Objects;

public class EventosExamen {

    @FXML
    private INegocioOperacion negocioOperacion;
    private BigDecimal duenhoId;

    public Button btnCrear;
    public Label lblRegistro;
    public Label lblVeterinario;
    public Label lblMascota;
    @FXML
    private ComboBox<String> cmbBoxVeterinario;
    @FXML
    private ComboBox<String> cmbBoxMascota;
    public Button btnConsultar;
    public Button btnLogOut;
    public Label lblDescripcion;
    public TextField txtFieldDescripcion;


    //METODOS OPERACIONES------------------------------------------------------
    public EventosExamen() {
        negocioOperacion = new NegocioOperacion();
    }

    @FXML
    private void initialize() {
        inicializarComboBoxVeterinarios();
    }
    public void setDuenhoId(BigDecimal duenhoId) {
        this.duenhoId = duenhoId;

        // Llamada al método para inicializar la ComboBox de mascotas
        inicializarComboBoxMascotas(duenhoId);
    }

    public void inicializarComboBoxVeterinarios() {
        if (cmbBoxVeterinario != null) {
            ObservableList<String> listaVeterinarios = negocioOperacion.listarVeterinarios();
            cmbBoxVeterinario.setItems(listaVeterinarios);
        } else {
            System.err.println("Error: cmbBoxVeterinario es nulo");
        }
    }
    public void inicializarComboBoxMascotas(BigDecimal duenhoId) {
        if (cmbBoxMascota != null) {
            ObservableList<String> listaMascotas = negocioOperacion.listarMascotas(duenhoId);
            cmbBoxMascota.setItems(listaMascotas);
        } else {
            System.err.println("Error: cmbBoxMascotas es nulo");
        }
    }
    private BigDecimal obtenerIdVeterinario(String nombreVeterinario) {
        // Implementar lógica para obtener el ID del veterinario según el nombre
        // Consultar la base de datos o utilizar un mapa local, según tu implementación
        return BigDecimal.ONE; // Reemplazar con la lógica real
    }

    private BigDecimal obtenerIdMascota(String nombreMascota) {
        // Implementar lógica para obtener el ID de la mascota según el nombre
        // Consultar la base de datos o utilizar un mapa local, según tu implementación
        return BigDecimal.ONE; // Reemplazar con la lógica real
    }

    //METODOS PANTALLAS------------------------------------------------------------------

    public void mBtnCrear(ActionEvent event) throws IOException {
        // Obtener el ID del veterinario seleccionado
        BigDecimal veterinarioId = negocioOperacion.obtenerIdVeterinario(cmbBoxVeterinario.getValue());

        // Obtener el ID de la mascota seleccionada
        BigDecimal mascotaId = negocioOperacion.obtenerIdMascota(duenhoId, cmbBoxMascota.getValue());

        // Obtener la descripción del examen
        String descripcion = txtFieldDescripcion.getText();

        // Llamar al método para crear el examen
        BigDecimal examenId = negocioOperacion.crearExamen(veterinarioId, mascotaId, descripcion);
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
