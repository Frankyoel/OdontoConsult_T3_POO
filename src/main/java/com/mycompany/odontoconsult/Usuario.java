/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odontoconsult;

/**
 *
 * @author YOVERA-2
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String rol;

    public Usuario(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public boolean iniciarSesion() {
        // Lógica para iniciar sesión
        return true; // Ejemplo
    }

    public void cerrarSesion() {
        // Lógica para cerrar sesión
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Correo: " + correo + ", Rol: " + rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}