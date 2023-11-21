package com.example.bdproyectofinalv2.negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NegocioConexionBD {

    // Datos de conexión a la base de datos (modifica según tu configuración)
    private static final String URL = "jdbc:oracle:thin:@orion.javeriana.edu.co:1521/LAB";
    private static final String USUARIO = "is332016";
    private static final String CONTRASENA = "Alfa02603";

    // Método para obtener una conexión a la base de datos
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}
