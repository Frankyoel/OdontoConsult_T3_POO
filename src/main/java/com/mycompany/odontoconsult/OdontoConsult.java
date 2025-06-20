/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odontoconsult;

import java.util.Date;

/**
 *
 * @author YOVERA-2
 */
public class OdontoConsult {

  public static void main(String[] args) {
        // Crear un evento de seguridad
        EventoSeguridad evento = new EventoSeguridad(
            "EVT-001",
            new Date(),
            "Acceso no autorizado al sistema",
            "Alto",
            "Se bloqueó la cuenta del usuario"
        );

        // Generar y guardar el reporte
        evento.generarReporte();

        // Crear un empleado
        Empleados empleado = new Empleados(
            "Juan Pérez",
            "juan@example.com",
            "Administrador",
            "Ingeniero de Sistemas",
            "Seguridad Informática"
        );

        // Reportar el evento de seguridad
        empleado.reportarEventoSeguridad(evento);

        // Mostrar información del empleado
        System.out.println(empleado.getInfo());
    }
}
