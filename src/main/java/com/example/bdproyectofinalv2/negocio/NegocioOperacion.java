package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Examen;
import com.example.bdproyectofinalv2.dominio.Mascota;
import com.example.bdproyectofinalv2.dominio.Tratamiento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NegocioOperacion implements INegocioOperacion {

    @Override
    public BigDecimal crearExamen(BigDecimal veterinarioId, BigDecimal mascotaId, String descripcion) {
        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "INSERT INTO PR_EXAMEN (FECHAHORA, VETERINARIOID, MASCOTAID, DESCRIPCIÓNRESULTADO, FACTURAID) " +
                    "VALUES (?, ?, ?, ?, null)";
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                Timestamp fechaHora = new Timestamp(System.currentTimeMillis());
                statement.setTimestamp(1, fechaHora);
                System.out.println(veterinarioId);
                statement.setBigDecimal(2, veterinarioId);
                System.out.println(veterinarioId);
                statement.setBigDecimal(3, mascotaId);

                // Verifica si la descripción es nula antes de asignarla
                if (descripcion != null) {
                    statement.setString(4, descripcion);
                } else {
                    statement.setNull(4, Types.VARCHAR);
                }

                // Ejecutar la inserción
                statement.executeUpdate();

                // Obtener el ID generado
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        // Utiliza un BigDecimal para manejar el ID generado
                        BigDecimal examenId = generatedKeys.getBigDecimal(1);
                        return examenId;
                    } else {
                        throw new SQLException("Error al obtener el ID generado.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public BigDecimal obtenerIdVeterinario(String nombreVeterinario) {
        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "SELECT ID FROM PR_PERSONAL WHERE UPPER(POSICIÓN) = 'VETERINARIO' AND NOMBRE = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nombreVeterinario);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        BigDecimal id = resultSet.getBigDecimal(1);
                        return id;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al obtener el ID del veterinario: " + e.getMessage());
        }
        return null;
    }

    @Override
    public BigDecimal obtenerIdMascota(BigDecimal duenhoId, String nombreMascota) {
        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "SELECT ID FROM PR_MASCOTA WHERE DUEÑOID = ? AND NOMBRE = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setBigDecimal(1, duenhoId);
                statement.setString(2, nombreMascota);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        BigDecimal id = resultSet.getBigDecimal("ID");
                        return id;
                    } else {
                        // Devuelve un valor nulo si no se encuentra ninguna mascota
                        return null;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    public ObservableList<String> listarMascotas(BigDecimal duenhoId) {
        ObservableList<String> listaMascotas = FXCollections.observableArrayList();

        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "SELECT NOMBRE FROM PR_MASCOTA WHERE DUEÑOID = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Establecer el valor del parámetro DUEÑOID
                statement.setBigDecimal(1, duenhoId);

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        listaMascotas.add(resultSet.getString("NOMBRE"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMascotas;
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
