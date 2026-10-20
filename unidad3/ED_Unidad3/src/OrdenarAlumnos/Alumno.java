package OrdenarAlumnos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int semestre;
    private String carrera;

    public Alumno(String nombre, int semestre, String carrera) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public int compareTo(Alumno o) {
//        Carrera 
//                Semestre
//                    Nombre
//        neg
//        return this.carrera.compareToIgnoreCase(o.carrera);
        if (this.carrera.compareToIgnoreCase(o.carrera)==0){
            if(this.semestre==o.semestre){
                //Revisar el nombre
                return this.nombre.compareToIgnoreCase(o.nombre);
            }else{
//                return Integer.compare(this.semestre,o.semestre);
                return (this.semestre-o.semestre)*-1;
//                if(this.semestre<o.semestre)
//                    return -1;
//                else
//                    return 1;
            }
        }else{
            return this.carrera.compareToIgnoreCase(o.carrera);
        }
//        cero
//        pos
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", semestre=" + semestre + ", carrera=" + carrera + '}';
    }

    
 
    
}
