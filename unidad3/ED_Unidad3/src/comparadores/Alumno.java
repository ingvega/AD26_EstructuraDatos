/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparadores;

//Carrera Semestre Nombre
//
//Semestre Nombre
//
//NumControl

/**
 *
 * @author paveg
 */
public class Alumno implements Comparable<Alumno> {
    String id="";
    String nombre="";
    String carrera="";
    int semestre;
    
    
    Alumno(String id, String nombre, String carrera, int semestre){
        this.id=id;
        this.nombre=nombre;
        this.carrera=carrera;
        this.semestre=semestre;
    }
    Alumno(String id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    @Override
    public int compareTo(Alumno o2) {
        return this.id.compareToIgnoreCase(o2.id);
     }    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!this.id.equalsIgnoreCase(other.id)) {
            return false;
        }
        return this.nombre.equalsIgnoreCase(other.nombre);
    }
}
