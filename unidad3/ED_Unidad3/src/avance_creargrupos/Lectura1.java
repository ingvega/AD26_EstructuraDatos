/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_creargrupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Lectura1 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        PriorityQueue<Alumno> lista=new PriorityQueue<>();
        int alumnos=lector.nextInt();
        Alumno a;
        for (int i = 0; i < alumnos; i++) {
            a=new Alumno(lector.next(),lector.nextLine());
            if(!lista.contains(a))
                lista.add(a);
        }
        int tamanio=lector.nextInt();
        
//        Collections.sort(lista);
        

//NO IMPRIME ORDENADAMENTE
//        for (Alumno alumno : lista) {
//            System.out.println(alumno.id +" "+alumno.nombre);
//        }
    while(!lista.isEmpty()){
        System.out.println(lista.poll());
    }

    }
}
