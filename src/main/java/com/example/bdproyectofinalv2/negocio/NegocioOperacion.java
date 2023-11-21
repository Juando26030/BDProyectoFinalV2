package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Examen;
import com.example.bdproyectofinalv2.dominio.Mascota;
import com.example.bdproyectofinalv2.dominio.Tratamiento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NegocioOperacion implements INegocioOperacion {

    @Override
    public Examen crearExamen(Mascota mascotaAct) {
        // Implementación
        return null;
    }

    @Override
    public ObservableList<String> listarVeterinarios() {
        ObservableList<String> listaVeterinarios = FXCollections.observableArrayList();

        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "SELECT NOMBRE FROM PR_PERSONAL WHERE UPPER(POSICIÓN) = 'VETERINARIO'";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    listaVeterinarios.add(resultSet.getString("NOMBRE"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaVeterinarios;
    }

    @Override
    public void listarMascotas() {
        // Implementación
    }

    @Override
    public Boolean agregarTratamiento(Examen examenAct, Tratamiento tratamientoAct, int cant) {
        // Implementación
        return null;
    }

    @Override
    public Boolean modificarTratamiento(Examen examenAct, Tratamiento tratamientoAct, int newCant) {
        // Implementación
        return null;
    }

    @Override
    public Boolean eliminarTratamiento(Examen examenAct, Tratamiento tratamientoAct) {
        // Implementación
        return null;
    }

    @Override
    public void actualizarTotalPagar() {
        // Implementación
    }

    @Override
    public void listarConsultas() {
        // Implementación
    }

    @Override
    public void listarAgregar() {
        // Implementación
    }

    @Override
    public void listarModificar() {
        // Implementación
    }

    @Override
    public void listarEliminar() {
        // Implementación
    }
}
