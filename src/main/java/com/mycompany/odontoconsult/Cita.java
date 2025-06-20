/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

/**
 *
 * @author YOVERA-2
 */
import java.util.Date;

public class Cita {
    private Date fecha;
    private String hora;
    private String motivo;

    public Cita(Date fecha, String hora, String motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void confirmarCita() {
        // Lógica para confirmar cita
    }

    public void cancelarCita() {
        // Lógica para cancelar cita
    }
}