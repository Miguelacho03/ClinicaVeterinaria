/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.modelo;

public class Mascota extends Animal {
    private String raza;
    private double peso;

    public Mascota(int id, String nombre, String especie, int edad, String raza, double peso) {
        super(id, nombre, especie, edad);
        this.raza = raza;
        this.peso = peso;
    }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}
