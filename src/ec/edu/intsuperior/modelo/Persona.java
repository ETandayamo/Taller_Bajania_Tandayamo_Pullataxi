/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author Desiree, Elian, Eva
 */
public class Persona {
    private String cedula;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private Date fechaNacimiento;
    private String correoElectronico;

    public Persona(String cedula, String nombre1, String nombre2, String apellido1, String apellido2, String direccion, Date fechaNacimiento, String correoElectronico) {
        this.cedula = cedula;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.correoElectronico = correoElectronico;
    }
    
    public Persona(String string, String _Elian, String francisco, String string0, String guanoluisa, String quito_Norte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        }

    public Persona(String string, String _Elian, String francisco, String string0, String guanoluisa, String quito_Norte, String elianFranciscogmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCedula() {
        return cedula;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
}
