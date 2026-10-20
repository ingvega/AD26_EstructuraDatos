/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avance_creargrupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Lectura {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        ArrayList<Alumno> lista=new ArrayList<>();
        int alumnos=lector.nextInt();
        Alumno a;
        for (int i = 0; i < alumnos; i++) {
            a=new Alumno(lector.next(),lector.nextLine());
            if(!lista.contains(a))
                lista.add(a);
        }
        int tamanio=lector.nextInt();
        
        Collections.sort(lista);
        
        for (Alumno alumno : lista) {
            System.out.println(alumno.id +" "+alumno.nombre);
        }
    }
}
