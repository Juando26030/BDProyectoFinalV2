package com.example.bdproyectofinalv2.dominio;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Examen {

    private BigDecimal id; //Surrogate key
    private Timestamp fechaYHora;
    private BigDecimal veterinarioId;
    private String descripcionResultado;
    private BigDecimal mascotaId;
    private BigDecimal facturaId;
}
