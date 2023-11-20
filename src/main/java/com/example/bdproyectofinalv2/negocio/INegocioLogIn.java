package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Cliente;

public interface INegocioLogIn {
    Cliente validarCredenciales (String usuario, String contraseña);
}
