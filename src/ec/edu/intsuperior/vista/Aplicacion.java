
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Empleado;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Empresa emp = new Empresa();
        JOptionPane.showMessageDialog(null, "Datos de la empresa");
        emp.setNombre(JOptionPane.showInputDialog("Ingresa el nombre de la empresa: "));
        emp.setDireccion(JOptionPane.showInputDialog("Ingresa la direccion de la empresa: "));
        emp.setTelefono(JOptionPane.showInputDialog("Ingresa el telefono de la empresa: "));
        emp.setCorreo(JOptionPane.showInputDialog("Ingresa el correo la empresa: "));
        JOptionPane.showMessageDialog(null, emp.toString());
        
        Cliente cli = new Cliente();
        int dia;
        int mes;
        int anio;
        JOptionPane.showMessageDialog(null, "Datos del cliente");
        cli.setCi(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
        cli.setNombre1(JOptionPane.showInputDialog("Ingrese su primer nombre"));
        cli.setNombre2(JOptionPane.showInputDialog("Ingresa su segundo nombre"));
        cli.setApellido1(JOptionPane.showInputDialog("Ingresa el apellido paterno"));
        cli.setApellido2(JOptionPane.showInputDialog("Ingresa el apellido materno"));
        cli.setDireccion(JOptionPane.showInputDialog("Ingresa su direccion"));
        cli.setCorreo(JOptionPane.showInputDialog("Ingrese su correo"));
        JOptionPane.showMessageDialog(null, "Fecha nacimiento");
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu dia "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu mes "));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tu año"));
        LocalDate diaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period p = Period.between(fechaNacimiento, diaHoy);
        cli.setTelefonoContaco(JOptionPane.showInputDialog("ingrese su numero de contacto"));
        cli.setCiudad(JOptionPane.showInputDialog("ingrese su Ciudad"));
        cli.setCodigoPostal(JOptionPane.showInputDialog("ingrese su Codigo Postal"));
        JOptionPane.showMessageDialog(null, cli.toString() + "\n"
                + "Edad: " + p.getYears() + " años, " + p.getMonths() + " meses, " + p.getDays() + " dias.");

        Empleado em = new Empleado();
        int idt;
        double dpd;
        JOptionPane.showMessageDialog(null, "Datos del empleado");
        em.setCi(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
        em.setNombre1(JOptionPane.showInputDialog("Ingrese su primer nombre"));
        em.setNombre2(JOptionPane.showInputDialog("Ingresa su segundo nombre"));
        em.setApellido1(JOptionPane.showInputDialog("Ingresa el primer apellido"));
        em.setApellido2(JOptionPane.showInputDialog("Ingresa el segundo apellido"));
        em.setPuesto(JOptionPane.showInputDialog("Ingresa el Puesto de trabajo"));
        idt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias trabajados"));
        dpd = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por dia"));
        double sb = 0, aux;
        if (idt > 30) {
            double tn = 15 * dpd;
            double sx = (dpd * 15);
            sb = sx + tn;
        } else {
            sb = idt * dpd;
        }
        JOptionPane.showMessageDialog(null, em.toString() + "\n"
                + "Dias trabajados: " + idt + "\n"
                + "pago por dia: " + dpd + "\n"
                + "Sueldo bruto: " + sb + "\n");

        Directivo dr = new Directivo();
        JOptionPane.showMessageDialog(null, "Datos de los directivos");
        dr.setCi(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
        dr.setNombre1(JOptionPane.showInputDialog("Ingrese su primer nombre"));
        dr.setNombre2(JOptionPane.showInputDialog("Ingresa su segundo nombre"));
        dr.setApellido1(JOptionPane.showInputDialog("Ingresa el primer apellido"));
        dr.setApellido2(JOptionPane.showInputDialog("Ingresa el segundo apellido"));
        String[] Categorias = {"Director de operaciones", "Director de marketing", "Director de recurso humanos", "Director de finanzas"};
        String Opcion = (String) JOptionPane.showInputDialog(null,
                "Seleeciona un categoria", "Opciones", JOptionPane.QUESTION_MESSAGE, null, Categorias, Categorias[0]);
        JOptionPane.showMessageDialog(null, dr.toString() + "\n"
                + "Categoria: " + Opcion + "\n"
                + "Que puesto quieres tener: " + em.getPuesto());
        
        JOptionPane.showMessageDialog(null, "Realizado por Andrea López");

    }
}
    
    

