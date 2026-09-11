/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.Vista;

import com.poo.clinicaveterinaria.modelo.Consulta;
import com.poo.clinicaveterinaria.modelo.Medicamento;
import com.poo.clinicaveterinaria.modelo.Mascota;
import com.poo.clinicaveterinaria.modelo.Propietario;
import java.util.List;

public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("==========================================");
        System.out.println("       PROPIETARIOS Y SUS MASCOTAS       ");
        System.out.println("==========================================");
        for (Propietario p : propietarios) {
            System.out.println("Propietario: " + p.getNombre() + " (ID: " + p.getId() + ") - Tel: " + p.getTelefono());
            System.out.println("Mascotas:");
            for (Mascota m : p.getMascotas()) {
                System.out.println("  - " + m.getNombre() + " (" + m.getEspecie() + ", " + m.getRaza() + ") - Edad: " + m.getEdad() + " años");
            }
            System.out.println("------------------------------------------");
        }
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("\n==========================================");
        System.out.println("           HISTORIAL DE CONSULTAS         ");
        System.out.println("==========================================");
        for (Consulta c : consultas) {
            System.out.println("Consulta ID: " + c.getId() + " | Fecha: " + c.getFecha());
            System.out.println("Motivo: " + c.getMotivo());
            System.out.println("Atendido por: Dr(a). " + c.getVeterinario().getNombre() + " (" + c.getVeterinario().getEspecialidad() + ")");
            System.out.println("------------------------------------------");
        }
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("\n==========================================");
        System.out.println("         MEDICAMENTOS RECETADOS           ");
        System.out.println("==========================================");
        for (Consulta c : consultas) {
            System.out.println("Consulta ID " + c.getId() + ":");
            if (c.getMedicamentos().isEmpty()) {
                System.out.println("  (Sin medicamentos recetados)");
            } else {
                for (Medicamento m : c.getMedicamentos()) {
                    System.out.println("  - " + m.getNombre() + " | Dosis: " + m.getDosis());
                }
            }
            System.out.println("------------------------------------------");
        }
    }
}