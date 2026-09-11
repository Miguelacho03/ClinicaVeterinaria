/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.controlador;

import com.poo.clinicaveterinaria.Vista.VeterinariaVista;
import com.poo.clinicaveterinaria.modelo.*;
import java.util.ArrayList;
import java.util.List;

public class ClinicaController {

    private VeterinariaVista vista;
    private List<Propietario> listaPropietarios;
    private List<Consulta> listaConsultas;

    public ClinicaController() {
        this.vista = new VeterinariaVista();
        this.listaPropietarios = new ArrayList<>();
        this.listaConsultas = new ArrayList<>();
    }

    public void iniciarSistema() {
        cargarDatosDePrueba();
        
        // Delegación de impresiones a la vista
        vista.mostrarPropietariosConMascotas(listaPropietarios);
        vista.mostrarConsultas(listaConsultas);
        vista.mostrarMedicamentosRecetados(listaConsultas);
    }

    private void cargarDatosDePrueba() {
        // 1. Crear Mascotas y Propietarios (Agregación)
        Mascota m1 = new Mascota(1, "Lucas", "Perro", 3, "Labrador", 15.5);
        Mascota m2 = new Mascota(2, "Michi", "Gato", 2, "Siames", 4.2);

        Propietario p1 = new Propietario("101", "Carlos Mendoza", "3001234567");
        Propietario p2 = new Propietario("102", "Ana Martínez", "3109876543");

        p1.agregarMascota(m1);
        p2.agregarMascota(m2);

        listaPropietarios.add(p1);
        listaPropietarios.add(p2);

        // 2. Crear Veterinarios y Medicamentos
        Veterinario v1 = new Veterinario("V01", "Dra. Sofia Gomez", "General");
        Veterinario v2 = new Veterinario("V02", "Dr. Andrés López", "Cirugía");

        Medicamento med1 = new Medicamento(1, "Amoxicilina", "500mg cada 12h");
        Medicamento med2 = new Medicamento(2, "Meloxicam", "2mg cada 24h");

        // Uso de relación de Dependencia (Veterinario receta medicamento)
        v1.recetar(med1);
        v2.recetar(med2);

        // 3. Crear Consultas (Composición con Medicamento y Asociación con Veterinario)
        Consulta c1 = new Consulta(1001, "2026-09-10", "Chequeo general y vacuna", v1);
        c1.agregarMedicamento(med1);

        Consulta c2 = new Consulta(1002, "2026-09-11", "Dolor en pata posterior", v2);
        c2.agregarMedicamento(med2);

        listaConsultas.add(c1);
        listaConsultas.add(c2);
    }
}
