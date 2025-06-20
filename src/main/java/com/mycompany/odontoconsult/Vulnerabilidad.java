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

public class Vulnerabilidad {
    private String id;
    private String descripcion;
    private String nivelRiesgo;
    private Date fechaDeteccion;

    public Vulnerabilidad(String id, String descripcion, String nivelRiesgo, Date fechaDeteccion) {
        this.id = id;
        this.descripcion = descripcion;
        this.nivelRiesgo = nivelRiesgo;
        this.fechaDeteccion = fechaDeteccion;
    }

    public String evaluarRiesgo() {
        
        return "Nivel de Riesgo: " + nivelRiesgo;
    }

    public void asociarAmenaza(Amenaza amenaza) {
        System.out.println("Asociando amenaza");
    }
}