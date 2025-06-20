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

public class MedidaMitigacion {
    private String id;
    private String descripcion;
    private Date fechaImplementacion;
    private String estado;

    public MedidaMitigacion(String id, String descripcion, Date fechaImplementacion, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaImplementacion = fechaImplementacion;
        this.estado = estado;
    }

    public void implementar() {
        // Lógica para implementar medida
    }

    public String verificarEstado() {
        return "Estado de la Medida: " + estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaImplementacion() {
        return fechaImplementacion;
    }

    public void setFechaImplementacion(Date fechaImplementacion) {
        this.fechaImplementacion = fechaImplementacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
