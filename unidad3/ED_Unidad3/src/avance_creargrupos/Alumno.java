/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_creargrupos;

/**
 *
 * @author paveg
 */
public class Alumno implements Comparable<Alumno> {
    String id="";
    String nombre="";
    Alumno(String id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    @Override
    public int compareTo(Alumno o2) {
        return this.nombre.compareToIgnoreCase(o2.nombre);
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
