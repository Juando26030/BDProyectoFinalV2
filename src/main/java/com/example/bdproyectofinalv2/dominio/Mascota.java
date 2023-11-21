package com.example.bdproyectofinalv2.dominio;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Mascota {

    private BigDecimal id; //Surrogate key
    private String nombre;
    private BigDecimal tipoMascotaId;
    private String descripcion;
    private Timestamp fechaNacimiento;
    private Timestamp fechaRegistro;
    private BigDecimal estadoId;
    private BigDecimal dueñoId;
}
