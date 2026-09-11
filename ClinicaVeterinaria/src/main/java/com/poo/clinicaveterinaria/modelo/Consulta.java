/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private int id;
    private String fecha;
    private String motivo;
    private Veterinario veterinario;
    private List<Medicamento> medicamentos;

    public Consulta(int id, String fecha, String motivo, Veterinario veterinario) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
        this.veterinario = veterinario;
        this.medicamentos = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }

    public List<Medicamento> getMedicamentos() { return medicamentos; }
    public void setMedicamentos(List<Medicamento> medicamentos) { this.medicamentos = medicamentos; }

    public void agregarMedicamento(Medicamento medicamento) {
        if (medicamento != null) {
            this.medicamentos.add(medicamento);
        }
    }
}
