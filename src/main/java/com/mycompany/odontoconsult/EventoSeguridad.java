/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

import java.util.Date;

public class EventoSeguridad {
    private String id;
    private Date fecha;
    private String descripcion;
    private String impacto;
    private String respuestaTomada;

    public EventoSeguridad(String id, Date fecha, String descripcion, String impacto, String respuestaTomada) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.impacto = impacto;
        this.respuestaTomada = respuestaTomada;
    }

    public void registrarEvento() {
        // Lógica para registrar evento
    }

    public String generarReporte() {
        // Generar y guardar el reporte en un archivo
        String reporte = "ID: " + id + "\n" +
                         "Fecha: " + fecha + "\n" +
                         "Descripción: " + descripcion + "\n" +
                         "Impacto: " + impacto + "\n" +
                         "Respuesta Tomada: " + respuestaTomada;
        
        // Guardar el reporte en un archivo
        try {
            java.io.FileWriter writer = new java.io.FileWriter("reporte_" + id + ".txt");
            writer.write(reporte);
            writer.close();
            System.out.println("Reporte generado y guardado exitosamente.");
        } catch (Exception e) {
            System.err.println("Error al generar el reporte: " + e.getMessage());
        }
        return reporte;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    public String getRespuestaTomada() {
        return respuestaTomada;
    }

    public void setRespuestaTomada(String respuestaTomada) {
        this.respuestaTomada = respuestaTomada;
    }
}
