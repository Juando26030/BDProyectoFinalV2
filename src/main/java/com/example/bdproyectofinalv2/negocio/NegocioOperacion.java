package com.example.bdproyectofinalv2.negocio;

import com.example.bdproyectofinalv2.dominio.Examen;
import com.example.bdproyectofinalv2.dominio.Mascota;
import com.example.bdproyectofinalv2.dominio.Tratamiento;

public class NegocioOperacion implements INegocioOperacion{
    @Override
    public Examen crearExamen(Mascota mascotaAct) {
        return null;
    }

    @Override
    public void listarVeterinarios() {

    }

    @Override
    public void listarMascotas() {

    }

    @Override
    public Boolean agregarTratamiento(Examen examenAct, Tratamiento tratamientoAct, int cant) {
        return null;
    }

    @Override
    public Boolean modificarTratamiento(Examen examenAct, Tratamiento tratamientoAct, int newCant) {
        return null;
    }

    @Override
    public Boolean eliminarTratamiento(Examen examenAct, Tratamiento tratamientoAct) {
        return null;
    }

    @Override
    public void actualizarTotalPagar() {

    }

    @Override
    public void listarConsultas() {

    }

    @Override
    public void listarAgregar() {

    }

    @Override
    public void listarModificar() {

    }

    @Override
    public void listarEliminar() {

    }
}
