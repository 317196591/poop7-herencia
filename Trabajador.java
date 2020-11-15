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
public class Trabajador extends Persona {
    int antiguedad;
    int sueldo;
    public Trabajador(String nombre, int edad, String domicilio, String sexo, int antiguedad, int sueldo) {
        super(nombre, edad, domicilio, sexo);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }
    /** @return Antigüedad del empleado */
    public int getAntiguedad() {
        return antiguedad;
    }
    /** Modificar antigüedad del empleado */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    /** @return Sueldo actual del empleado */
    public int getSueldo() {
        return sueldo;
    }
    /** Modificar sueldo del empleado */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "antiguedad=" + antiguedad + ", sueldo=" + sueldo + '}';
    }
}
