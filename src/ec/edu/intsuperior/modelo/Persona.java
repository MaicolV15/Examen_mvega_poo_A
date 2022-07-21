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
public class Persona {
    private String Ci;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String correo;
    private int edad;

    public Persona() {
 
    }

    public Persona(String Ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion,String correo, int edad) {
        this.Ci = Ci;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.correo = correo;
        this.edad = edad;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCi() {
        return Ci;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
    
        @Override
    public String toString() {
        return "Los datos guardados son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + " " + getApellido2()
                + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "Correo: " + getCorreo();
    }

    
}

    

