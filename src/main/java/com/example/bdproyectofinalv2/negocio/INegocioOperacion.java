package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Examen;
import com.example.bdproyectofinalv2.dominio.Mascota;
import com.example.bdproyectofinalv2.dominio.Tratamiento;
import javafx.collections.ObservableList;

import java.math.BigDecimal;
import java.util.List;

public interface INegocioOperacion {
    //PARTE EXAMEN---------------------------------------------------
    BigDecimal crearExamen(BigDecimal veterinarioId, BigDecimal mascotaId, String descripcion);

    BigDecimal obtenerIdVeterinario(String nombreVeterinario);
    BigDecimal obtenerIdMascota(BigDecimal duenhoId, String nombreMascota);
    ObservableList<String> listarVeterinarios();
    ObservableList<String> listarMascotas(BigDecimal duenhoId);

    //PARTE TRATAMIENTO------------------------------------------------
    Boolean agregarTratamiento (Examen examenAct, Tratamiento tratamientoAct, int cant);
    Boolean modificarTratamiento (Examen examenAct, Tratamiento tratamientoAct, int newCant);
    Boolean eliminarTratamiento (Examen examenAct, Tratamiento tratamientoAct);
    void actualizarTotalPagar();
    void listarConsultas();
    void listarAgregar();
    void listarModificar();
    void listarEliminar();

}
