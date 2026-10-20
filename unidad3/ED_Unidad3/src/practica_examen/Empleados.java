package practica_examen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Empleados {

    //Lectura con 2 Scanner, uno dirigido a leer la línea completa
    //y otro a leer los números de la línea
//    public static void main(String[] args) {
//        Scanner lectorLinea = new Scanner(System.in);
//        String lineaConEdades = lectorLinea.nextLine();
//        Scanner lectorNumeros = new Scanner(lineaConEdades);
//
//        int edad;
//        //ArrayList<Integer> edades = new ArrayList<>();
//        LinkedList<Integer> edades = new LinkedList<>();
//
//        //Sin try-catch
//        while (lectorNumeros.hasNextInt()) {
//            edad = lectorNumeros.nextInt();
//            if (!edades.contains(edad)) {
//                edades.add(edad);
//            }
//        }
//
//        Collections.sort(edades);
//
//        //System.out.println(edades.getLast() +" " +edades.getFirst());
//        System.out.println(edades.get(edades.size() - 1) + " " + edades.get(0));
//        //edades.forEach(e -> System.out.print(e + " "));
//        for (int i = 0; i < edades.size(); i++) {
//            System.out.print(edades.get(i) + " ");
//        }
//        System.out.println("");
//    }

//Usando split para obtener cada número que viene en una sola linea de texto
    public static void main(String[] args) {
        Scanner lectorLinea = new Scanner(System.in);
        String lineaConEdades=lectorLinea.nextLine();
        String[] arrEdades=lineaConEdades.split(" ");
        int edad;
        //ArrayList<Integer> edades = new ArrayList<>();
        LinkedList<Integer> edades = new LinkedList<>();
        for (int i = 0; i < arrEdades.length; i++) {
            edad=Integer.parseInt(arrEdades[i]);
            if(!edades.contains(edad))
                    edades.add(edad);
        }

        Collections.sort(edades);
        
        //System.out.println(edades.getLast() +" " +edades.getFirst());
        System.out.println(edades.get(edades.size()-1) +" " +edades.get(0));
        edades.forEach(e->System.out.print(e+" "));
    }
}
