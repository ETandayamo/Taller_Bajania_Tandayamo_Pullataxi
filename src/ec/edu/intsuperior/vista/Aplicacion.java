/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Aplicacion {
    public static void main(String[ ]args) {
        Persona tanda = new Persona();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("27/10/2003");
        Date fec= new Date();
        fec.setYear(2003);
        fec.setMonth(10);
        fec.setDate(27);
        Persona ob1= new Persona("1753857604"," Elian","Francisco",""
            + "Pullataxi", "Guanoluisa" ,"Quito Norte" ) ;
        System.out.println("Fecha de nacimiento: "+ob1.getFechaNacimiento().getYear()+"/"
          +""+ob1.getFechaNacimiento().getMonth()+"/"
        +""+ob1.getFechaNacimiento().getDate());
    }
}
