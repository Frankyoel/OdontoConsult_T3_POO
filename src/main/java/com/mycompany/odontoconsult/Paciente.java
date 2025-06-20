/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

import java.util.Date;

/**
 *
 * @author YOVERA-2
 */

public class Paciente extends Usuario {
    private String numeroHistorial;
    private Date fechaRegistro;

    public Paciente(String nombre, String correo, String rol, String numeroHistorial, Date fechaRegistro) {
        super(nombre, correo, rol);
        this.numeroHistorial = numeroHistorial;
        this.fechaRegistro = fechaRegistro;
    }

    public String consultarHistorial() {
        // Lógica para consultar historial
        return "Historial de " + getNombre();
    }

    public void agendarCita() {
        System.out.println(" Cita guardada ");
    }

    public String getInfo() {
        return super.getInfo() + ", Número de Historial: " + numeroHistorial + ", Fecha de Registro: " + fechaRegistro;
    }
}