package OrdenarAlumnos;


import java.util.PriorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class Prueba {
    public static void main(String[] args) {
        
        System.out.println("PALABRA".compareTo("HOLA"));
        
        PriorityQueue<Alumno> alumnos=new PriorityQueue<>();
        alumnos.add(new Alumno("Perez Uribe Pedro",10,"Sistemas Comp"));
        alumnos.add(new Alumno("Alvarez Villanueva",1,"Sistemas Comp"));
        alumnos.add(new Alumno("Lara Ruiz",9,"Sistemas Comp"));
        alumnos.add(new Alumno("Lara Ruiz",9,"Ambiental"));
        alumnos.add(new Alumno("Zavala Torres",2,"Gestion"));
        
        while(!alumnos.isEmpty())
            System.out.println(alumnos.poll());
    }
}
