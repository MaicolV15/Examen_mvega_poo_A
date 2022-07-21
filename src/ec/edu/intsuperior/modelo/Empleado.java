/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Michael Vega
 */
public class Empleado {
    
    private String ci;
    private String nombre1;
    private String nombre2;
    private String Apellido1;
    private String Apellido2;
    private String Puesto;
    private double sueldoBruto;

    public Empleado() {
    }

    public Empleado(String ci, String nombre1, String nombre2, String Apellido1, String Apellido2, String Puesto, double sueldoBruto) {
        this.ci = ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Puesto = Puesto;
        this.sueldoBruto = sueldoBruto;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getCi() {
        return ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getPuesto() {
        return Puesto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    @Override
    public String toString() {
        return "Los datos del empleado son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + getApellido2() + getNombre2() + getNombre1() + "\n"
                + "Puesto de trabajo: " + getPuesto();

    }

}

    

