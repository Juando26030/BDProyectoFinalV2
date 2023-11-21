package com.example.bdproyectofinalv2;

import com.example.bdproyectofinalv2.negocio.INegocioLogIn;
import com.example.bdproyectofinalv2.negocio.NegocioLogIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

public class EventosLogIn {

    @FXML
    private INegocioLogIn negocioLogIn;

    public Label txtAcceso;
    public Button btnLogIn;
    public Label lblIngresar;
    public Label lblUsuario;
    public Label lblContraseña;
    public TextField txtFieldUsuario;
    public TextField txtFieldContraseña;

    public EventosLogIn() {
        negocioLogIn = new NegocioLogIn();
    }

    public void mBtnLogIn(ActionEvent event) throws IOException {
        String usuario = txtFieldUsuario.getText();
        String contrasena = txtFieldContraseña.getText();

        // Verificar si los campos están en blanco
        if (usuario.isEmpty() || contrasena.isEmpty()) {
            txtAcceso.setText("Por favor, ingrese usuario y contraseña.");
        } else {
            BigDecimal duenhoId = negocioLogIn.validarCredenciales(usuario, contrasena);

            if (duenhoId != null) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("examenView.fxml"));
                Parent examenParent = loader.load();
                EventosExamen eventosExamenController = loader.getController();
                eventosExamenController.inicializarComboBoxVeterinarios();

                Parent inicioParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("examenView.fxml")));
                Scene inicioScene = new Scene(inicioParent);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(inicioScene);
                window.show();
            } else {
                txtAcceso.setText("Usuario o contraseña no válidos");
            }
        }
    }
}
