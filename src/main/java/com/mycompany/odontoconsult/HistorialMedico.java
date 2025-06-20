/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

/**
 *
 * @author YOVERA-2
 */
public class HistorialMedico {
    private String observaciones;
    private String tratamientos;

    public HistorialMedico(String observaciones, String tratamientos) {
        this.observaciones = observaciones;
        this.tratamientos = tratamientos;
    }

    public void actualizarHistorial() {
        // Lógica para actualizar historial
    }

    public String verHistorial() {
        return "Observaciones: " + observaciones + "\nTratamientos: " + tratamientos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }
}