/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

/**
 *
 * @author YOVERA-2
 */
public class Empleados extends Usuario {
    private String puesto;
    private String especialidad;

    public Empleados(String nombre, String correo, String rol, String puesto, String especialidad) {
        super(nombre, correo, rol);
        this.puesto = puesto;
        this.especialidad = especialidad;
    }

    public void agendarCita() {
        // Lógica para agendar cita
    }

    public void registrarPaciente() {
        // Lógica para registrar paciente
    }

    public String getInfo() {
        return super.getInfo() + ", Puesto: " + puesto + ", Especialidad: " + especialidad;
    }

    public void reportarEventoSeguridad(EventoSeguridad evento) {
        // Lógica para reportar evento de seguridad
    }
}