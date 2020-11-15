/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Alex
 */
public class Profesor extends Trabajador {
String grado;
    public Profesor(String nombre, int edad, String domicilio, String sexo, int sueldo, int antiguedad, String grado) {
        super(nombre, edad, domicilio, sexo, sueldo, antiguedad);
        this.grado = grado;
    }
    /** @return Grado académico del profesor */
    public String getGrado() {
        return grado;
    }
    /** Modificar grado académico del profesor */
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String toString() {
        return "Profesor{" + "grado=" + grado + '}';
    }
        
    
}