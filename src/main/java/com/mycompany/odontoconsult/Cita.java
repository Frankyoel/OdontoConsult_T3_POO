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
        System.out.println("La cita para el " + fecha + " a las " + hora + " ha sido confirmada.");
    }

    public void cancelarCita() {
        System.out.println("La cita para el " + fecha + " ha sido cancelada.");
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}