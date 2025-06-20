/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

/**
 *
 * @author YOVERA-2
 */
public class Amenaza {
    private String id;
    private String tipo;
    private String descripcion;

    public Amenaza(String id, String tipo, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public void analizarAmenaza() {
        // Lógica para analizar amenaza
    }

    public void relacionarVulnerabilidad(Vulnerabilidad vulnerabilidad) {
        // Lógica para relacionar con una vulnerabilidad
    }
}
