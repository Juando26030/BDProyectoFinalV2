package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Duenho;

import java.math.BigDecimal;

public interface INegocioLogIn {
    BigDecimal validarCredenciales (String usuario, String contraseña);
}
