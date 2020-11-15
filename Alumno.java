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
public class Alumno extends Persona {
    String escuela;
    double promedio;
    public Alumno(String nombre, int edad, String domicilio, String sexo, String escuela, double promedio) {
        super(nombre, edad, domicilio, sexo);
        this.escuela = escuela;
        this.promedio = promedio;
    }
    /** @return Escuela donde estudia el alumno */
    public String getEscuela() {
        return escuela;
    }
    /** Modificar escuela del alumno */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    /** @return Promedio alcanzado por el alumno */
    public double getPromedio() {
        return promedio;
    }
    /** Modificar promedio del alumno */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "Alumno{" + "escuela=" + escuela + ", promedio=" + promedio + '}';
    }
    
}
