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
public class Director extends Trabajador{
    String compania;
    public Director(String nombre, int edad, String domicilio, String sexo, int sueldo, int antiguedad, String compania) {
        super(nombre, edad, domicilio, sexo, sueldo, antiguedad);
        this.compania = compania;
    }
    /** @return Compañía del director */
    public String getCompania() {
        return compania;
    }
    /** Modificar compañía del director */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Director{" + "compania=" + compania + '}';
    }
}
