/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odontoconsult;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author YOVERA-2
 */
public class OdontoConsult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cita> citas = new ArrayList<>();
        HistorialMedico historial = new HistorialMedico("Sin observaciones", "Sin tratamientos");

        while (true) {
            System.out.println("\n--- MENÚ CONSULTORIO ODONTOLÓGICO ---");
            System.out.println("1. Crear Cita");
            System.out.println("2. Ver Citas Confirmadas");
            System.out.println("3. Ver Historial Médico");
            System.out.println("4. Agregar Tratamiento al Historial");
            System.out.println("5. Generar Reporte de Evento de Seguridad");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del paciente: ");
                    String nombrePaciente = sc.nextLine();

                    System.out.print("Ingrese hora (HH:mm): ");
                    String hora = sc.nextLine();

                    System.out.print("Ingrese motivo de la cita: ");
                    String motivo = sc.nextLine();

                    Paciente paciente = new Paciente(nombrePaciente, "", "Paciente", "HIST-" + UUID.randomUUID(), new Date());
                    Cita nuevaCita = new Cita(new Date(), hora, motivo);
                    nuevaCita.confirmarCita();
                    citas.add(nuevaCita);

                    System.out.println("Cita creada exitosamente para " + paciente.getNombre());
                    break;

                case 2:
                    if (citas.isEmpty()) {
                        System.out.println("No hay citas registradas.");
                    } else {
                        System.out.println(" Citas Confirmadas:");
                        for (int i = 0; i < citas.size(); i++) {
                            Cita c = citas.get(i);
                            System.out.println((i + 1) + ". Fecha: " + c.getFecha() + ", Hora: " + c.getHora() + ", Motivo: " + c.getMotivo());
                        }
                    }
                    break;

                case 3:
                    System.out.println("HISTORIAL MÉDICO:");
                    System.out.println(historial.verHistorial());
                    break;

                case 4:
                    System.out.print("Ingrese nuevo tratamiento: ");
                    String nuevoTratamiento = sc.nextLine();
                    String tratamientosActuales = historial.getTratamientos();
                    if (!tratamientosActuales.equals("Sin tratamientos")) {
                        tratamientosActuales += "\n- " + nuevoTratamiento;
                    } else {
                        tratamientosActuales = "- " + nuevoTratamiento;
                    }
                    historial.setTratamientos(tratamientosActuales);
                    System.out.println("Tratamiento agregado correctamente.");
                    break;

                case 5:
                    EventoSeguridad evento = new EventoSeguridad(
                            "EVT-" + UUID.randomUUID(),
                            new Date(),
                            "Acceso sospechoso al sistema",
                            "Alto",
                            "Se realizó un análisis forense"
                    );
                    evento.generarReporte();
                    break;

                case 6:
                    System.out.println("¡Gracias por usar el sistema odontológico!");
                    return;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
