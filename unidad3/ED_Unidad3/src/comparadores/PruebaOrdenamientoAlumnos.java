/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class PruebaOrdenamientoAlumnos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Alumno> lista = new ArrayList<>();
        int alumnos = lector.nextInt();
        Alumno a;
        for (int i = 0; i < alumnos; i++) {
            a = new Alumno(lector.next(), lector.nextLine(),
                    lector.next(), lector.nextInt());
            if (!lista.contains(a)) {
                lista.add(a);
            }
        }

        //Ordenar por carrera,semestre,nombre
        Collections.sort(lista, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if (o1.carrera.compareToIgnoreCase(o2.carrera) == 0) {
                    if (Integer.compare(o1.semestre, o2.semestre) == 0) {
                        return o1.nombre.compareToIgnoreCase(o2.nombre);
                    } else {
                        return Integer.compare(o1.semestre, o2.semestre);
                    }
                } else {
                    return o1.carrera.compareToIgnoreCase(o2.carrera);
                }
            }

        });

        for (Alumno alumno : lista) {
            System.out.println(alumno.carrera + " " + alumno.semestre + " "
                    + alumno.nombre + " " + alumno.id);
        }
        
        //Orden por Semestre y luego nombre
        lista.sort(new OrdenSemestreNombre());
        
        for (Alumno alumno : lista) {
            System.out.println(alumno.semestre + " "
                    + alumno.nombre + " " + alumno.id + " " + alumno.carrera );
        }
        
        //Orden por numero de control
        Collections.sort(lista);
        
        for (Alumno alumno : lista) {
            System.out.println(alumno.id + " " +alumno.semestre + " "
                    + alumno.nombre + " " +  alumno.carrera );
        }
        
        

    }
}

class OrdenSemestreNombre implements Comparator<Alumno> {
            @Override
    public int compare(Alumno o1, Alumno o2) {
        if (Integer.compare(o1.semestre, o2.semestre) == 0) {
            return o1.nombre.compareToIgnoreCase(o2.nombre);
        } else {
            return Integer.compare(o1.semestre, o2.semestre);
        }
       
    }
}
