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
public class Persona {

    /**
     * @param args the command line arguments
     */
    String nombre;
    int edad;
    String domicilio;
    String sexo;

    /**
     * 
     * @param nombre
     * @param edad 
     * @param domicilio
     * @param sexo 
     */
    public Persona(String nombre, int edad, String domicilio, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.sexo = sexo;
    }
    /** @return  Nombre de la persona */
    public String getNombre() {
        return nombre;
    }
    /** Modificar nombre de la persona */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /** @return Edad de la persona */
    public int getEdad() {
        return edad;
    }
    /** Modificar edad en años de la persona */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /** @return Obtener dirección de la persona */
    public String getDomicilio() {
        return domicilio;
    }
    /** Modificar dirección de la persona */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    /** @return Obtener sexo de la persona */
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + ", sexo=" + sexo + '}';
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno("Alex Romero",19,"Juan Escutia Mz 118, Guadalupe del Moral","H","Facultad de Ingeniería",8.5);
        a1.setPromedio(9.0);
        System.out.println(a1);
        Trabajador t1 = new Trabajador("Jorge Sanchez",35,"Plaza de la Republica 57, Tabacalera","H",15,5500);
        t1.setSueldo(8000);
        System.out.println(t1.toString());
        Director d1 = new Director("Luis Moya",40,"Calle Luisa 40, Portales","H",24,26000,"Ingenieros Asociados S.A.");
        d1.setCompania("Constructores Asociados, S.A");
        d1.setSueldo(30000);
        System.out.println(d1.getCompania()+' '+d1.getSueldo());
        Profesor p1 = new Profesor("Orlando Zaldivar",46,"Calle Juana de Arco 47, Los Mochis","H",16000,60,"Maestro en Ciencias Computacionales");
        p1.setAntiguedad(65);
        p1.setGrado("Doctor en Ingenieria de Software");
        System.out.println(p1.getNombre()+' '+p1.getAntiguedad()+' '+p1.getGrado());
        Persona per1 = new Persona("Guillermina Ofelia Ramirez",61,"Juan Escutia Mz 118, Guadalupe del Moral","M");
        per1.setEdad(62);
        per1.setDomicilio("Lago Trasimeno 175, Anahuac");
        System.out.println(per1.getDomicilio()+' '+per1.getEdad());
    }
    
}
