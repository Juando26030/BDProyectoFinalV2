package com.example.bdproyectofinalv2.dominio;

import java.math.BigDecimal;
import java.security.Timestamp;

public class Personal {

    private BigDecimal id; //Surrogate key
    private BigDecimal tipoDocumentoId;
    private BigDecimal numDocumento;
    private BigDecimal sexoId;
    private String nombre;
    private String direccion;
    private BigDecimal telefono;
    private Timestamp fechaNacimiento;
    private String posicion;
    private BigDecimal salarioAnual;
    private BigDecimal equipoId;
    private BigDecimal clinicaId;
}
