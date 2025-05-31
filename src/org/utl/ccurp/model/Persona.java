/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.ccurp.model;

/**
 *
 * @author DYNABOOK
 */
public class Persona {
    //ATRIBUTOS EN ORDEN PRESENTADO EN CURP
    private String apellido = null;
    private String apellido2 = null;
    private String nombre = null;
    private String nombre2 = null;
    private int anio = 0;
    private int mes = 0;
    private int dia = 0;
    private char genero = 'n';
    private String estado = null;
    

    public Persona(String apellido, String apellido2, String nombre, String nombre2,int anio, int mes, int dia,char genero, String estado) {
    }

    public Persona() {
    }

    

    

    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "apellido=" + apellido + ", apellido2=" + apellido2 + ", nombre=" + nombre + ", nombre2=" + nombre2 + ", anio=" + anio + ", mes=" + mes + ", dia=" + dia + ", genero=" + genero + ", estado=" + estado + '}';
    }
    
    
    
}
