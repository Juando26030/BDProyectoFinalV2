package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Examen;
import com.example.bdproyectofinalv2.dominio.Mascota;
import com.example.bdproyectofinalv2.dominio.Tratamiento;

public interface INegocioOperacion {
    //PARTE EXAMEN---------------------------------------------------
    Examen crearExamen (Mascota mascotaAct); // Generar constructor
    void listarVeterinarios();
    void listarMascotas();

    //PARTE TRATAMIENTO
    Boolean agregarTratamiento (Examen examenAct, Tratamiento tratamientoAct, int cant);
    Boolean modificarTratamiento (Examen examenAct, Tratamiento tratamientoAct, int newCant);
    Boolean eliminarTratamiento (Examen examenAct, Tratamiento tratamientoAct);
    void actualizarTotalPagar();
    void listarConsultas();
    void listarAgregar();
    void listarModificar();
    void listarEliminar();

}