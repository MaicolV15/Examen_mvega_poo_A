/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Cliente extends Persona{
    private String telefonoContaco;
    private String ciudad;
    private String codigoPostal;
    

    public Cliente() {
    } 

    public Cliente(String telefonoContaco, String ciudad, String codigoPostal, String Ci, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, String correo, int edad) {
        super(Ci, nombre1, nombre2, apellido1, apellido2, direccion, correo, edad);
        this.telefonoContaco = telefonoContaco;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public void setTelefonoContaco(String telefonoContaco) {
        this.telefonoContaco = telefonoContaco;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefonoContaco() {
        return telefonoContaco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
                + "Telefono de contacto del cliente: "+getTelefonoContaco() + "\n"
                + "Ciudad: "+getCiudad()+ "\n"
                + "Codigo Postal: "+getCodigoPostal();
    }
    
    
   
}
    

