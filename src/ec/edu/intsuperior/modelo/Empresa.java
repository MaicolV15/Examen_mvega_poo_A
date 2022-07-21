/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;
import java.util.HashSet;

/**
 *
 * @author PC
 */
public class Empresa {
     private String nombre;
    private String Direccion;
    private String correo;
    private String telefono;

    private HashSet<Cliente> Cliente = new HashSet<Cliente>();
    private HashSet<Empleado> Empleado = new HashSet<Empleado>();

    public Empresa() {
    }

    public Empresa(String nombre, String Direccion, String correo, String telefono) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void setCliente(HashSet<Cliente> Cliente) {
        this.Cliente = Cliente;
    }

    public void setEmpleado(HashSet<Empleado> Empleado) {
        this.Empleado = Empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public HashSet<Cliente> getCliente() {
        return Cliente;
    }

    public HashSet<Empleado> getEmpleado() {
        return Empleado;
    }

    @Override
    public String toString() {
        return "Los datos guardados de la empresa son: \n"
                + "Nombre: " + getNombre() + " " + "\n"
                + "Direccion: " + getDireccion() + "\n"
                + "telefono: " + getTelefono() + "\n"
                + "Correo: " + getCorreo();
    }


}
    

