package com.example.bdproyectofinalv2.negocio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NegocioLogIn implements INegocioLogIn {

    public BigDecimal validarCredenciales(String usuario, String contrasena) {
        try (Connection connection = NegocioConexionBD.obtenerConexion()) {
            String sql = "SELECT DUEÑOID FROM PR_USUARIOS WHERE USUARIO = ? AND CONTRASEÑA = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, usuario);
                preparedStatement.setString(2, contrasena);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getBigDecimal("DUEÑOID");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
