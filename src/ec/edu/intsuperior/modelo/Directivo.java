/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author PC
 */
public class Directivo extends Empleado {
     public enum TiposCategorias {
        directorOperaciones, directorMarketing, directorRecursoHumanos, directorFinanzas
    }
    private String TipoCategorias;

    public Directivo() {
    }

    public Directivo(String TipoCategorias, String ci, String nombre1, String nombre2, String Apellido1, String Apellido2, String Puesto, double sueldoBruto) {
        super(ci, nombre1, nombre2, Apellido1, Apellido2, Puesto, sueldoBruto);
        this.TipoCategorias = TipoCategorias;
    }

    public void setTipoCategorias(String TipoCategorias) {
        this.TipoCategorias = TipoCategorias;
    }

    public String getTipoCategorias() {
        return TipoCategorias;
    }

    @Override
    public String toString() {
        return "Los datos del directivo son: \n"
                + "Cedula: " + getCi() + "\n"
                + "Apellidos y Nombres: " + getApellido1() + getApellido2() + getNombre2() + getNombre1();
    }

}
